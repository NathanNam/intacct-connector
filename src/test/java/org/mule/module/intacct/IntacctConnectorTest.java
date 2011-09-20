/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.intacct;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.module.intacct.impl.IntacctRestClient;
import org.mule.module.intacct.schema.request.Datecreated;
import org.mule.module.intacct.schema.request.Function;
import org.mule.module.intacct.schema.request.Itemid;
import org.mule.module.intacct.schema.request.Shipto;
import org.mule.module.intacct.schema.request.Sotransitem;
import org.mule.module.intacct.schema.request.Sotransitems;
import org.mule.module.intacct.schema.response.Control;
import org.mule.module.intacct.schema.response.Response;
import org.mule.module.intacct.utils.JerseyIntacctFacade;

import ar.com.zauber.commons.mom.CXFStyle;
import ar.com.zauber.commons.mom.MapObjectMapper;

/**
 * IntacctConnectorTest
 * @author flbulgarelli
 */
public class IntacctConnectorTest
{
    private IntacctCloudConnector connector;
    private IntacctRestClient restClient;
    
    private MapObjectMapper mom =  new MapObjectMapper("org.mule.module.intacct.schema");
    
    @Before
    public void setUp() throws InitialisationException
    {
        connector = new IntacctCloudConnector();
        restClient = mock(IntacctRestClient.class);
        connector.setIntacctImplementation(new JerseyIntacctFacade(restClient));
        connector.init();
        mom.setPropertyStyle(CXFStyle.STYLE);
    }

    @Test
    public void testControlIdIsNotCached() throws Exception
    {
        when(restClient.postXml(anyString()))
		.thenReturn(new Response(){{
            setControl(new Control(){{
                setControlid("XXXX");
            }});
        }});
        
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
    @Ignore
    public void testCreateSotransactionTraductionFromMap() throws Exception
    {
        when(restClient.postXml(anyString()))
        .thenReturn(new Response(){{
            setControl(new Control(){{
                setControlid("XXXX");
            }});
        }});
        
        Datecreated datecreated = new Datecreated();
        datecreated.setDay("1");
        datecreated.setMonth("1");
        datecreated.setYear("2000");
        
        Shipto shipto = new Shipto();
        shipto.getContactOrContactname().add("fooContact");
        
        Sotransitems sotransitems = new Sotransitems();
        Sotransitem sotransitem1 = new Sotransitem();
        sotransitem1.setItemid(new Itemid());
        sotransitem1.setQuantity("2");
        sotransitems.getSotransitem().add(sotransitem1);
        Sotransitem sotransitem2 = new Sotransitem();
        sotransitem2.setItemid(new Itemid());
        sotransitem2.setQuantity("2");
        sotransitems.getSotransitem().add(sotransitem2);

        connector.createSotransaction("100",
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
                                      mom.toMap(shipto),
                                      null,
                                      null,
                                      null,
                                      null,
                                      null,
                                      null,
                                      null,
                                      mom.toMap(sotransitems),
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
                "      <function controlid=\"100\"></function>\n" + 
                "    </content>\n" + 
                "  </operation>\n" + 
                "</request>");
    }
}


