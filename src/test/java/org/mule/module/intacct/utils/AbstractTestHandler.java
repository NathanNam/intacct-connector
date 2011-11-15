/*
 * Mule Intacct Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.intacct.utils;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mortbay.jetty.HttpConnection;
import org.mortbay.jetty.Request;
import org.mortbay.jetty.handler.AbstractHandler;

/**
 * This abstract class is used by every Abstract Handler for the Http Server. It has
 * the basic request and response functionality
 */
public abstract class AbstractTestHandler extends AbstractHandler
{
    private Request request;

    @Override
    public void handle(String target, HttpServletRequest request, HttpServletResponse response, int dispatch)
        throws IOException, ServletException
    {
        Request baseRequest = request instanceof Request
                                                        ? (Request) request
                                                        : HttpConnection.getCurrentConnection().getRequest();
        setRequest(baseRequest);
        response.setContentType("text/xml;charset=utf-8");
        response.setStatus(getResponseStatus());
        doHandle(target, baseRequest, response, dispatch);
        getRequest().setHandled(true);
    }

    protected abstract int getResponseStatus();

    protected abstract void doHandle(String target,
                                     HttpServletRequest request,
                                     HttpServletResponse response,
                                     int dispatch) throws IOException, ServletException;

    public void setRequest(Request request)
    {
        this.request = request;
    }

    public Request getRequest()
    {
        return request;
    }

}
