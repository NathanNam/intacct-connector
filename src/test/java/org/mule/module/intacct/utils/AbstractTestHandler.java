/**
 * Mule Intacct Cloud Connector
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
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
