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

import static org.mule.module.intacct.IntacctCloudConnector.REQUEST_JAXB_CTX;

import org.mule.module.intacct.IntacctFacade;
import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.schema.response.Response;

import java.io.StringWriter;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.apache.commons.lang.UnhandledException;

public class SystemOutIntacctFacade implements IntacctFacade
{
    private Request request;
    
    @Override
    public Response executeOperation(final Request request)
    {
        this.request = request;
        try
        {
            final Marshaller m = REQUEST_JAXB_CTX.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.setProperty(Marshaller.JAXB_ENCODING, "utf-8");
            StringWriter w = new StringWriter();
            m.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
            m.marshal(request, w);
            System.out.println(w);
            return new Response();
        }
        catch (JAXBException e)
        {
            throw new UnhandledException(e);
        }
    }

    public void setRequest(Request request)
    {
        this.request = request;
    }

    public Request getRequest()
    {
        return request;
    }

}


