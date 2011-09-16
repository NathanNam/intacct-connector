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

import static org.junit.Assert.*;

import org.mortbay.jetty.handler.AbstractHandler;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.construct.SimpleFlowConstruct;
import org.mule.module.client.MuleClient;
import org.mule.module.intacct.config.IntacctNamespaceHandler;
import org.mule.module.intacct.exception.IntacctException;
import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.schema.response.Control;
import org.mule.module.intacct.schema.response.Response;
import org.mule.module.intacct.utils.EmptyResponseHandler;
import org.mule.module.intacct.utils.HttpTestServer;
import org.mule.module.intacct.utils.IntacctJaxBOkHandler;
import org.mule.module.intacct.utils.NotFoundResponseHandler;
import org.mule.module.intacct.xml.JaxBUtils;
import org.mule.module.intacct.xml.XmlFilterWrapper;
import org.mule.module.intacct.xml.XmlNamespaceFilter;

import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.core.util.ReaderWriter;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.sax.SAXSource;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 * This uses the Http Server and does real testing (integration). It tests success
 * cases, empty response, etc.
 */
public class RealHttpTestCase extends BaseIntacctTest
{

    private HttpTestServer server;
    private final String controlId = "mi id";

    @Override
    protected String getConfigResources()
    {
        return "intacct-namespace-real-config.xml";
    }

    @Override
    protected void doTearDown() throws Exception
    {
        if (server != null) server.stop();
    }

    /**
     * This tests sending some real request and getting some response. This sends a
     * function so all the request values
     */
    public void testSendSomething() throws Exception
    {
        Response response = new Response();
        Control control = new Control();
        control.setControlid(controlId);
        response.setControl(control);
        IntacctJaxBOkHandler handler = new IntacctJaxBOkHandler(response);
        startServer(handler);
        final Map<String, String> payload = new HashMap<String, String>();
        payload.put("key", "1234");
        payload.put("controlid", controlId);
        payload.put("accountnoLower", "500");
        SimpleFlowConstruct flow = lookupFlowConstruct("functionFlow");
        final MuleEvent event = getTestEvent(payload);
        final MuleEvent responseEvent = flow.process(event);

        String encodedXml = IOUtils.toString(handler.getRequest().getInputStream()).substring(
            "xmlrequest".length() + 1);
        final String charsetName = ReaderWriter.getCharset(MediaType.APPLICATION_FORM_URLENCODED_TYPE).name();
        String xml = URLDecoder.decode(encodedXml, charsetName);
        InputStream in = new ByteArrayInputStream(xml.getBytes(charsetName));
        Unmarshaller um = IntacctNamespaceHandler.REQUEST_JAXB_CTX.createUnmarshaller();
        XMLReader reader = XMLReaderFactory.createXMLReader();
        XmlFilterWrapper inFilter = new XmlFilterWrapper(new XmlNamespaceFilter(
            "http://www.mulesoft.org/schema/mule/intacct"));
        inFilter.setParent(reader);
        InputSource is = new InputSource(in);
        SAXSource source = new SAXSource(inFilter, is);

        Request req = (Request) um.unmarshal(source);
        Assert.assertEquals(controlId, req.getControl().getControlid());
        Response resp = (Response) responseEvent.getMessage().getPayload();
        Assert.assertNotNull(resp);
        Assert.assertEquals(controlId, resp.getControl().getControlid());
    }

    public void testSendNoResponse() throws Exception
    {
        try
        {
            startServer(new EmptyResponseHandler());
            final Map<String, String> payload = new HashMap<String, String>();
            payload.put("key", "1234");
            payload.put("controlid", controlId);
            payload.put("accountnoLower", "500");
            SimpleFlowConstruct flow = lookupFlowConstruct("functionFlow");
            final MuleEvent event = getTestEvent(payload);
            flow.process(event);
            Assert.fail();

        }
        catch (Throwable ex)
        {
            IntacctException iex = getDomainException(ex);
            Assert.assertNotNull(iex);
            Assert.assertNotNull(iex.getCause());
            Assert.assertTrue(iex.getCause() instanceof WebApplicationException);
        }

    }

    public void testSendResponseWithNoControlId() throws Exception
    {
        HttpTestServer server = null;
        try
        {
            Response response = new Response();
            Control control = new Control();
            response.setControl(control);
            IntacctJaxBOkHandler handler = new IntacctJaxBOkHandler(response);
            startServer(handler);

            final Map<String, String> payload = new HashMap<String, String>();
            payload.put("key", "1234");
            payload.put("controlid", controlId);
            payload.put("accountnoLower", "500");
            SimpleFlowConstruct flow = lookupFlowConstruct("functionFlow");
            final MuleEvent event = getTestEvent(payload);
            flow.process(event);
            Assert.fail();

        }
        catch (Throwable ex)
        {
            IntacctException iex = getDomainException(ex);
            Assert.assertNotNull(iex);
            Assert.assertNotNull(iex.getCause());
            Assert.assertTrue(iex.getCause() instanceof IntacctException);
        }
        finally
        {
            if (server != null)
            {
                server.stop();
            }
        }

    }

    public void testServerDown() throws Exception
    {
        try
        {

            final Map<String, String> payload = new HashMap<String, String>();
            payload.put("key", "1234");
            payload.put("controlid", "asdf");
            payload.put("accountnoLower", "500");
            SimpleFlowConstruct flow = lookupFlowConstruct("functionFlow");
            final MuleEvent event = getTestEvent(payload);
            flow.process(event);
            Assert.fail();

        }
        catch (Throwable ex)
        {
            IntacctException iex = getDomainException(ex);
            Assert.assertNotNull(iex);
            Assert.assertNotNull(iex.getCause());
            Assert.assertTrue(iex.getCause() instanceof ClientHandlerException);
            Assert.assertTrue(iex.getCause().getCause() instanceof ConnectException);
        }

    }

    public void testNotFoundResponse() throws Exception
    {
        try
        {
            startServer(new NotFoundResponseHandler());
            final Map<String, String> payload = new HashMap<String, String>();
            payload.put("key", "1234");
            payload.put("controlid", controlId);
            payload.put("accountnoLower", "500");
            SimpleFlowConstruct flow = lookupFlowConstruct("functionFlow");
            final MuleEvent event = getTestEvent(payload);
            flow.process(event);
            Assert.fail();

        }
        catch (Throwable ex)
        {
            IntacctException iex = getDomainException(ex);
            Assert.assertNotNull(iex);
            Assert.assertNotNull(iex.getCause());
            Assert.assertTrue(iex.getCause() instanceof UniformInterfaceException);
        }

    }

    public void testControlId() throws Exception
    {
        Response response = new Response();
        Control control = new Control();
        control.setControlid(controlId);
        response.setControl(control);
        IntacctJaxBOkHandler handler = new IntacctJaxBOkHandler(response);

        startServer(handler);

        MuleClient client = new MuleClient(muleContext);
        MuleMessage msg1 = client.send("vm://test-control-id", "Cust-0-01", null);
        System.out.println("Message1 = " + msg1.getPayloadAsString());
        MuleMessage msg2 = client.send("vm://test-control-id", "Cust-0-02", null);
        System.out.println("Message = " + msg2.getPayloadAsString());

    }

    /**
     * Gets the domain exception from the exception or returns null otherwise
     */
    private IntacctException getDomainException(Throwable t)
    {
        Throwable ex = t;
        while (ex != null && !(ex instanceof IntacctException))
        {
            ex = ex.getCause();
        }
        return (IntacctException) ex;

    }

    private void startServer(AbstractHandler handler) throws Exception
    {
        server = new HttpTestServer(handler, 50443);
        server.start();
    }

}
