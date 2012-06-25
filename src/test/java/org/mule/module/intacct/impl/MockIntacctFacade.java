/**
 * Mule Intacct Cloud Connector
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package org.mule.module.intacct.impl;

import org.mule.module.intacct.IntacctFacade;
import org.mule.module.intacct.config.IntacctNamespaceHandler;
import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.schema.response.Response;
import org.mule.module.intacct.xml.JaxBUtils;

import javax.xml.bind.JAXBException;

import org.apache.commons.lang.UnhandledException;

/**
 * Implementation of {@link IntacctFacade} useful for debugging. Prints the request
 * on System.out.
 */
public class MockIntacctFacade implements IntacctFacade
{
    private Request request;
    private String requestAsString;

    @Override
    public Response executeOperation(final Request request)
    {
        this.request = request;

        try
        {
            setRequestAsString(JaxBUtils.marshallWithoutNamespaceAndUnderscoreReplacement(request,
                IntacctNamespaceHandler.REQUEST_JAXB_CTX).toString());
            return new Response();
        }
        catch (final JAXBException e)
        {
            throw new UnhandledException(e);
        }
    }

    public void setRequest(final Request request)
    {
        this.request = request;
    }

    public Request getRequest()
    {
        return request;
    }

    public void setRequestAsString(String requestAsString)
    {
        this.requestAsString = requestAsString;
    }

    public String getRequestAsString()
    {
        return requestAsString;
    }

}
