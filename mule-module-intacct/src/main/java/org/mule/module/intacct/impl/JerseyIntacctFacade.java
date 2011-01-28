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

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.SSLContext;

import org.apache.commons.lang.UnhandledException;
import org.apache.commons.lang.Validate;

/**
 * Executes an operation using Intacct XML Gateway.
 */
public class JerseyIntacctFacade implements IntacctFacade 
{
    private final WebResource gateway;

    /** constructor */
    public JerseyIntacctFacade(final String gatewayURI) {
        this(createClient(gatewayURI), gatewayURI);
    }
    
    /** creates the client for the intacct XML gateway */
    private static Client createClient(final String gatewayURI)
    {
        try {
            final ClientConfig config = new DefaultClientConfig();
            final SSLContext ctx = SSLContext.getInstance("SSL");
            ctx.init(null, null, null);
            
            config.getClasses().add(Request.class);
            config.getClasses().add(Response.class);
            
            return Client.create(config);
        }
        catch (final KeyManagementException e)
        {
            throw new UnhandledException(e);
        }
        catch (NoSuchAlgorithmException e)
        {
            throw new UnhandledException(e);
        }
    }

    /** constructor */
    public JerseyIntacctFacade(final Client client, final String gatewayURI)
    {
        Validate.notNull("client can't be null");
        Validate.notEmpty(gatewayURI, "gatewayURI can't be empty");
        
        gateway = client.resource(gatewayURI);
    }
    
    @Override
    public Response executeOperation(final Request request)
    {
        return gateway.type("x-intacct-xml-request").post(Response.class, request);
    }
}

