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

/**
 *  This handler recieves an object and marshales it to XML and sends it in the response
 */
public abstract class JaxBOkHandler extends AbstractTestHandler
{

    private final Object objectToMarshall;
    private Request request;

    public JaxBOkHandler(Object objectToMarshall)
    {
        this.objectToMarshall = objectToMarshall;
        

    }

    @Override
    public void doHandle(String target, HttpServletRequest request, HttpServletResponse response, int dispatch)
        throws IOException, ServletException
    {
        try
        {
            Marshaller m = getContext().createMarshaller();
            m.marshal(objectToMarshall, response.getOutputStream());
        }
        catch (JAXBException e)
        {
            Assert.fail();
        }
    }
    
    @Override
    protected int getResponseStatus() 
    {
        return SC_OK;
    }
    
    protected abstract JAXBContext getContext();

    public void setRequest(Request request)
    {
        this.request = request;
    }

    public Request getRequest()
    {
        return request;
    }

}
