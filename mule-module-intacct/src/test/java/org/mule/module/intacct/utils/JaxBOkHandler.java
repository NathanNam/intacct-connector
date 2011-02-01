/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.intacct.utils;

import static javax.servlet.http.HttpServletResponse.SC_OK;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.mortbay.jetty.HttpConnection;
import org.mortbay.jetty.Request;
import org.mortbay.jetty.handler.AbstractHandler;

public abstract class JaxBOkHandler extends AbstractHandler
{

    private String requestBody;
    private final Object objectToMarshall;

    public JaxBOkHandler(Object objectToMarshall)
    {
        this.objectToMarshall = objectToMarshall;

    }

    @Override
    public void handle(String target, HttpServletRequest request, HttpServletResponse response, int dispatch)
        throws IOException, ServletException
    {
        Request baseRequest = request instanceof Request
                                                        ? (Request) request
                                                        : HttpConnection.getCurrentConnection().getRequest();
        setRequestBody(IOUtils.toString(baseRequest.getInputStream()));
        response.setStatus(SC_OK);
        response.setContentType("text/xml;charset=utf-8");
        try
        {
            Marshaller m = getContext().createMarshaller();
            m.marshal(objectToMarshall, response.getOutputStream());
        }
        catch (JAXBException e)
        {
            Assert.fail();
        }

        baseRequest.setHandled(true);

    }
    
    protected abstract JAXBContext getContext();

    public void setRequestBody(String requestBody)
    {
        this.requestBody = requestBody;
    }

    public String getRequestBody()
    {
        return requestBody;
    }

}
