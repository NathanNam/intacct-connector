/**
 * Mule Intacct Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.intacct.impl;

import java.io.Writer;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.JAXBException;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.UnhandledException;
import org.apache.commons.lang.Validate;
import org.mule.module.intacct.IntacctFacade;
import org.mule.module.intacct.config.IntacctNamespaceHandler;
import org.mule.module.intacct.exception.IntacctException;
import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.schema.response.Response;
import org.mule.module.intacct.xml.JaxBUtils;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.representation.Form;

/**
 * Executes an operation using Intacct XML Gateway.
 */
public class JerseySslIntacctFacade implements IntacctFacade
{
    private IntacctRestClient client;

    public JerseySslIntacctFacade(String uri)
    {
        this(new JerseyIntacctRestClient(uri));
    }

    public JerseySslIntacctFacade(IntacctRestClient client)
    {
        this.client = client;
    }

    protected void addSslConfiguration() throws NoSuchAlgorithmException, KeyManagementException
    {
        client.addSslConfiguration();
    }

    @Override
    public Response executeOperation(final Request request)
    {
        try
        {
            // As the xml sent doesn't have the namespace we're removing it here
            Writer writer = JaxBUtils.marshallWithoutNamespaceAndUnderscoreReplacement(request,
                IntacctNamespaceHandler.REQUEST_JAXB_CTX);
            // We must send an attribute xmlrequest with the xml value
            String requestString = writer.toString();
            Response post = client.postXml(requestString);
            // If there's no response or it has no control id it must "explode"
            if (post == null || post.getControl() == null
                || StringUtils.isBlank(post.getControl().getControlid()))
            {
                throw new IntacctException(
                    "The response from the server is empty or doesn't have a control id");
            }
            return post;
        }
        catch (JAXBException e)
        {
            throw new IntacctException("Error parseando el XML", e);
        }

    }
}
