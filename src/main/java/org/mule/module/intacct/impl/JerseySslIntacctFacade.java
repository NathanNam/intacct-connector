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

import java.io.Writer;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.SSLContext;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.xml.bind.JAXBException;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.UnhandledException;
import org.apache.commons.lang.Validate;

/**
 * Executes an operation using Intacct XML Gateway.
 */
public class JerseySslIntacctFacade implements IntacctFacade
{
    private WebResource gateway;

    /** constructor */
    public JerseySslIntacctFacade(final String gatewayURI)
    {
        createGateway(gatewayURI, createClient(gatewayURI));
    }

    private void createGateway(final String gatewayURI, final Client client)
    {
        Validate.notNull("client can't be null");
        Validate.notEmpty(gatewayURI, "gatewayURI can't be empty");

        gateway = client.resource(gatewayURI);
    }

    /** creates the client for the intacct XML gateway */
    private Client createClient(final String gatewayURI)
    {

        try
        {
            final ClientConfig config = new DefaultClientConfig();
            addSslConfiguration();
            config.getClasses().add(Request.class);
            config.getClasses().add(Response.class);
            return Client.create(config);
        }
        catch (final KeyManagementException e)
        {
            throw new UnhandledException(e);
        }
        catch (final NoSuchAlgorithmException e)
        {
            throw new UnhandledException(e);
        }

    }

    protected void addSslConfiguration() throws NoSuchAlgorithmException, KeyManagementException
    {
        final SSLContext ctx = SSLContext.getInstance("SSL");

        ctx.init(null, null, null);
    }

    /** constructor */
    public JerseySslIntacctFacade(final Client client, final String gatewayURI)
    {
        createGateway(gatewayURI, client);
    }

    @Override
    public Response executeOperation(final Request request)
    {
        try
        {
            //It is important to make clear that we are using FORM URLENCODED instead of 
            //the custom media type because Jersey uses an "object" model. It requires that
            //the content type must be parsed to some MediaType object.
            //Every media type must have a type and a subtype, as that custom type
            //doesn't use a subtype we cannot use it with Jersey.
            
            //We use a form because that's what jersey needs with URLENCODED type to detect it
            //by itself with the MessageBodyWriter
            final MultivaluedMap<String, String> map = new Form();
            //As the xml sent doesn't have the namespace we're removing it here
            Writer writer = JaxBUtils.marshallWithoutNamespaceAndUnderscoreReplacement(request,
                IntacctNamespaceHandler.REQUEST_JAXB_CTX);
            //We must send an attribute xmlrequest with the xml value
            map.add("xmlrequest", writer.toString());
            final Response post = gateway.type(MediaType.APPLICATION_FORM_URLENCODED_TYPE)
                .post(Response.class, map);
            //If there's no response or it has no control id it must "explode"
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
