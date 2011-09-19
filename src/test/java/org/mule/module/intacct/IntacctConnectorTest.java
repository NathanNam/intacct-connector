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

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.module.intacct.impl.IntacctRestClient;
import org.mule.module.intacct.schema.request.Function;
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
    
    @Before
    public void setUp() throws InitialisationException
    {
        connector = new IntacctCloudConnector();
        restClient = mock(IntacctRestClient.class);
        connector.setIntacctImplementation(new JerseyIntacctFacade(restClient));
        connector.init();
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
        
        connector.operation(new Function(){{
            setControlid("100");
        }});
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
        
        connector.operation(new Function(){{
            setControlid("200");
        }});
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
}


