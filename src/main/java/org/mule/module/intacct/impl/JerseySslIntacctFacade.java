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

import java.io.Writer;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.JAXBException;

import org.apache.commons.lang.StringUtils;
import org.mule.module.intacct.IntacctFacade;
import org.mule.module.intacct.config.IntacctConnectorNamespaceHandler;
import org.mule.module.intacct.exception.IntacctException;
import org.mule.module.intacct.response.IntacctResponseWrapper;
import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.xml.JaxBUtils;

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
    public IntacctResponseWrapper executeOperation(final Request request)
    {
        try
        {
            // As the xml sent doesn't have the namespace we're removing it here
            Writer writer = JaxBUtils.marshallWithoutNamespaceAndUnderscoreReplacement(request,
                IntacctConnectorNamespaceHandler.REQUEST_JAXB_CTX);
            // We must send an attribute xmlrequest with the xml value
            String requestString = writer.toString();
            IntacctResponseWrapper post = client.postXml(requestString);
            // If there's no response or it has no control id it must "explode"
            if (post == null || post.getResponse().getControl() == null
                || StringUtils.isBlank(post.getResponse().getControl().getControlid()))
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
