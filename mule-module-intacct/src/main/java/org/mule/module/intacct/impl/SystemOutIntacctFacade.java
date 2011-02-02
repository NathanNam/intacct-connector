/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.intacct.impl;



import org.mule.module.intacct.IntacctFacade;
import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.schema.response.Response;
import org.mule.module.intacct.util.JaxBUtils;

import java.io.StringWriter;
import java.io.Writer;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.lang.UnhandledException;

/**
 * Implementation of {@link IntacctFacade} useful for debugging.
 * Prints the request on System.out.
 */
public class SystemOutIntacctFacade implements IntacctFacade
{
    private Request request;
    
    @Override
    public Response executeOperation(final Request request)
    {
        this.request = request;
        
        try
        {
            System.out.println(JaxBUtils.marshallWithoutNamespace(request, JaxBUtils.REQUEST_JAXB_CTX));
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

}


