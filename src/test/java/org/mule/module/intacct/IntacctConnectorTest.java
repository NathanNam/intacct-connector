/*
 * Mule Intacct Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.intacct;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.staccatocommons.collections.Maps;
import net.sf.staccatocommons.lang.MapBuilder;

import org.junit.Before;
import org.junit.Test;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.module.intacct.impl.IntacctRestClient;
import org.mule.module.intacct.schema.request.Contactname;
import org.mule.module.intacct.schema.request.Datecreated;
import org.mule.module.intacct.schema.request.Function;
import org.mule.module.intacct.schema.request.Itemid;
import org.mule.module.intacct.schema.request.Sotransitem;
import org.mule.module.intacct.schema.response.Control;
import org.mule.module.intacct.schema.response.Response;
import org.mule.module.intacct.utils.JerseyIntacctFacade;


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
        expectPostXml();
        connector.getList("100", "glaccount", null, null, null, null, null, null);
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
        .thenReturn(new Response(){{
            setControl(new Control(){{
                setControlid("XXXX");
            }});
        }});
    }
}


