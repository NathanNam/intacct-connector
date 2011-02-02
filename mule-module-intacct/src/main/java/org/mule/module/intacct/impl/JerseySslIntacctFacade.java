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
import org.mule.module.intacct.exception.IntracctException;
import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.schema.response.Response;
import org.mule.module.intacct.util.JaxBUtils;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.representation.Form;

import java.io.StringWriter;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.SSLContext;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

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
            final MultivaluedMap<String, String> map = new Form();
            Marshaller m;
            m = JaxBUtils.REQUEST_JAXB_CTX.createMarshaller();
            final StringWriter writer = new StringWriter();
            m.marshal(request, writer);
            map.add("xmlrequest", writer.toString());
            final Response post = gateway.type(MediaType.APPLICATION_FORM_URLENCODED_TYPE)
                .post(Response.class, map);
            if (post == null || post.getControl() == null
                || StringUtils.isBlank(post.getControl().getControlid()))
            {
                throw new IntracctException(
                    "The response from the server is empty or doesn't have a control id");
            }
            return post;
        }
        catch (JAXBException e)
        {
            throw new IntracctException("Error parseando el XML", e);
        }

    }
}
