/**
 * Mule Intacct Cloud Connector
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package org.mule.module.intacct;

import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.module.intacct.impl.IntacctRestClient;
import org.mule.module.intacct.response.IntacctResponseWrapper;
import org.mule.module.intacct.schema.request.Contactname;
import org.mule.module.intacct.schema.request.Datecreated;
import org.mule.module.intacct.schema.request.Function;
import org.mule.module.intacct.schema.request.Itemid;
import org.mule.module.intacct.schema.request.Sotransitem;
import org.mule.module.intacct.schema.response.Control;
import org.mule.module.intacct.schema.response.Response;
import org.mule.module.intacct.utils.JerseyIntacctFacade;
import org.mule.module.intacct.utils.MapBuilder;


/**
 * IntacctConnectorTest
 * @author flbulgarelli
 */
public class IntacctConnectorTest
{
    private IntacctCloudConnector connector;
    private IntacctRestClient restClient;

    private final IntacctMapObjectMapper mom =  new IntacctMapObjectMapper();

    @Before
    public void setUp() throws InitialisationException
    {
        connector = new IntacctCloudConnector();
        restClient = mock(IntacctRestClient.class);
        connector.setIntacctImplementation(new JerseyIntacctFacade(restClient));
        connector.init();
    }

    @Test
    public void getListWithNoFiltersSucceeds() throws Exception
    {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                     "\n" +
                     "<request>\n" +
                     "  <control>\n" +
                     "    <dtdversion>2.1</dtdversion>\n" +
                     "  </control>\n" +
                     "  <operation>\n" +
                     "    <authentication>\n" +
                     "      <login></login>\n" +
                     "    </authentication>\n" +
                     "    <content>\n" +
                     "      <function controlid=\"100\">\n" +
                     "        <get_list object=\"glaccount\"></get_list>\n" +
                     "      </function>\n" +
                     "    </content>\n" +
                     "  </operation>\n" +
                     "</request>\n";
        
        expectPostXml();
        connector.getList("100", "glaccount", null, null, null, null, null, null);
        verify(restClient).postXml(argThat(new StringMatchWithXml(xml)));
    }

    @Test
    public void testControlIdIsNotCached() throws Exception
    {
        expectPostXml();

        Function function = new Function();
        function.setControlid("100");
        connector.operation(mom.toMap(function));

        verify(restClient, times(1)).postXml(
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "\n" +
                "<request>\n" +
                "  <control>\n" +
                "    <dtdversion>2.1</dtdversion>\n" +
                "  </control>\n" +
                "  <operation>\n" +
                "    <authentication>\n" +
                "      <login></login>\n" +
                "    </authentication>\n" +
                "    <content>\n" +
                "      <function controlid=\"100\"></function>\n" +
                "    </content>\n" +
                "  </operation>\n" +
                "</request>");

        Function function2 = new Function();
        function2.setControlid("200");
        connector.operation(mom.toMap(function2));

        verify(restClient, times(1)).postXml(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "\n" +
            "<request>\n" +
            "  <control>\n" +
            "    <dtdversion>2.1</dtdversion>\n" +
            "  </control>\n" +
            "  <operation>\n" +
            "    <authentication>\n" +
            "      <login></login>\n" +
            "    </authentication>\n" +
            "    <content>\n" +
            "      <function controlid=\"200\"></function>\n" +
            "    </content>\n" +
            "  </operation>\n" +
            "</request>");
    }

    @Test
    public void testCreateAradjustment() throws Exception
    {
        expectPostXml();

        connector.createARAdjustment(
            "invoiceNo", //
            "customerId", //
            new MapBuilder().with("year", 2010).with("month", 10).with("day", 12).build(), //
            null, //
            "batchKey", //
            "adjustmentNo", "invoiceNo", "description", "externalId", "basecurr", "currency",
            ExchType.ExchRate, null, "nogl",
            Arrays.<Map<String, Object>> asList(new HashMap<String, Object>()));

        verify(restClient, times(1)).postXml(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "\n" +
            "<request>\n" +
            "  <control>\n" +
            "    <dtdversion>2.1</dtdversion>\n" +
            "  </control>\n" +
            "  <operation>\n" +
            "    <authentication>\n" +
            "      <login></login>\n" +
            "    </authentication>\n" +
            "    <content>\n" +
            "      <function controlid=\"invoiceNo\">\n" +
            "        <create_aradjustment>\n" +
            "          <customerid>customerId</customerid>\n" +
            "          <datecreated>\n" +
            "            <year>2010</year>\n" +
            "            <month>10</month>\n" +
            "            <day>12</day>\n" +
            "          </datecreated>\n" +
            "          <batchkey>batchKey</batchkey>\n" +
            "          <adjustmentno>adjustmentNo</adjustmentno>\n" +
            "          <invoiceno>invoiceNo</invoiceno>\n" +
            "          <description>description</description>\n" +
            "          <externalid>externalId</externalid>\n" +
            "          <basecurr>basecurr</basecurr>\n" +
            "          <currency>currency</currency>\n" +
            "          <nogl>nogl</nogl>\n" +
            "          <aradjustmentitems>\n" +
            "            <lineitem></lineitem>\n" +
            "          </aradjustmentitems>\n" +
            "        </create_aradjustment>\n" +
            "      </function>\n" +
            "    </content>\n" +
            "  </operation>\n" +
            "</request>" );
    }

    @Test
    public void testCreateSotransactionTraductionFromMap() throws Exception
    {
        expectPostXml();

        Datecreated datecreated = new Datecreated();
        datecreated.setDay("1");
        datecreated.setMonth("1");
        datecreated.setYear("2000");

        List<Map<String, Object>> mapShipTo = new ArrayList<Map<String, Object>>();
        Contactname contactname = new Contactname();
        contactname.setValue("fooContact");
        mapShipTo.add(mom.toMap(contactname));

        List<Map<String, Object>> sotransitems = new ArrayList<Map<String, Object>>();
        Sotransitem sotransitem1 = new Sotransitem();
        Itemid itemid1 = new Itemid();
        itemid1.setValue("item1");
        sotransitem1.setItemid(itemid1);
        sotransitem1.setQuantity("2");
        sotransitems.add(mom.toMap(sotransitem1));
        Sotransitem sotransitem2 = new Sotransitem();
        Itemid itemid2 = new Itemid();
        itemid2.setValue("item2");
        sotransitem2.setItemid(itemid2);
        sotransitem2.setQuantity("2");
        sotransitems.add(mom.toMap(sotransitem2));

        connector.createSOTransaction("100",
                                      "fooTransactionType",
                                      mom.toMap(datecreated),
                                      null,
                                      "25",
                                      null,
                                      null,
                                      null,
                                      null,
                                      null,
                                      null,
                                      null,
                                      null,
                                      ContactType.ContactName,
                                      mapShipTo,
                                      null,
                                      null,
                                      null,
                                      null,
                                      null,
                                      null,
                                      null,
                                      sotransitems,
                                      null
                                      );

        verify(restClient, times(1)).postXml(
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "\n" +
                "<request>\n" +
                "  <control>\n" +
                "    <dtdversion>2.1</dtdversion>\n" +
                "  </control>\n" +
                "  <operation>\n" +
                "    <authentication>\n" +
                "      <login></login>\n" +
                "    </authentication>\n" +
                "    <content>\n" +
                "      <function controlid=\"100\">\n" +
                "        <create_sotransaction>\n" +
                "          <transactiontype>fooTransactionType</transactiontype>\n" +
                "          <datecreated>\n" +
                "            <year>2000</year>\n" +
                "            <month>1</month>\n" +
                "            <day>1</day>\n" +
                "          </datecreated>\n" +
                "          <customerid>25</customerid>\n" +
                "          <shipto>\n" +
                "            <contactname>fooContact</contactname>\n" +
                "          </shipto>\n" +
                "          <sotransitems>\n" +
                "            <sotransitem>\n" +
                "              <itemid>item1</itemid>\n" +
                "              <quantity>2</quantity>\n" +
                "            </sotransitem>\n" +
                "            <sotransitem>\n" +
                "              <itemid>item2</itemid>\n" +
                "              <quantity>2</quantity>\n" +
                "            </sotransitem>\n" +
                "          </sotransitems>\n" +
                "        </create_sotransaction>\n" +
                "      </function>\n" +
                "    </content>\n" +
                "  </operation>\n" +
                "</request>");
    }

    protected void expectPostXml()
    {
        when(restClient.postXml(anyString()))
        .thenReturn(new IntacctResponseWrapper(new Response(){{
            setControl(new Control(){{
                setControlid("XXXX");
            }});
        }}));
    }
}


