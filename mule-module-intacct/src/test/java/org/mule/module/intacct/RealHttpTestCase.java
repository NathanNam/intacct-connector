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

import org.mule.api.MuleEvent;
import org.mule.construct.SimpleFlowConstruct;
import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.schema.response.Control;
import org.mule.module.intacct.schema.response.Response;
import org.mule.module.intacct.util.JaxBUtils;
import org.mule.module.intacct.utils.HttpTestServer;
import org.mule.module.intacct.utils.IntacctJaxBOkHandler;
import org.mule.module.intacct.utils.JaxBOkHandler;
import org.mule.module.intacct.utils.SslTestServer;
import org.mule.tck.FunctionalTestCase;

import com.sun.jersey.core.util.ReaderWriter;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.servlet.http.HttpUtils;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;

public class RealHttpTestCase extends BaseIntacctTest
{

    @Override
    protected String getConfigResources()
    {
        return "intacct-namespace-real-config.xml";
    }
    
    private HttpTestServer server;
    
    

    @Override
    protected void doSetUp() throws Exception
    {
        super.doSetUp();
    }



    @Override
    protected void doTearDown() throws Exception
    {
        super.doTearDown();
    }



    public void testSendSomething() throws Exception
    {
        Response response = new Response();
        Control control = new Control();
        String controlId = "mi id";
        control.setControlid(controlId);
        response.setControl(control);
        IntacctJaxBOkHandler handler = new IntacctJaxBOkHandler(response);
        final int port = 50443;
        HttpTestServer server = new HttpTestServer(handler, port);
        server.start();
        final Map<String, String> payload = new HashMap<String, String>();
        payload.put("key", "1234");
        payload.put("controlid", controlId);
        payload.put("accountnoLower", "500");
        SimpleFlowConstruct flow = lookupFlowConstruct("functionFlow");
        final MuleEvent event = getTestEvent(payload);
        final MuleEvent responseEvent = flow.process(event);
        server.stop();
        String encodedXml = IOUtils.toString(handler.getRequest().getInputStream()).substring(
            "xmlrequest".length() + 1);
        final String charsetName = ReaderWriter.getCharset(MediaType.APPLICATION_FORM_URLENCODED_TYPE).name();
        String xml = URLDecoder.decode(encodedXml, charsetName);
        InputStream in = new ByteArrayInputStream(xml.getBytes(charsetName));
        Unmarshaller um = JaxBUtils.REQUEST_JAXB_CTX.createUnmarshaller();
        Request req = (Request) um.unmarshal(in);
        Assert.assertEquals(controlId, req.getControl().getControlid());
        Response resp = (Response) responseEvent.getMessage().getPayload();
        Assert.assertNotNull(resp);
        Assert.assertEquals(controlId, resp.getControl().getControlid());
    }
    
    public void testSendNoResponse() 
    {
        
    }

}