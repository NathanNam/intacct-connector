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

import javax.net.ssl.SSLContext;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.apache.commons.lang.Validate;
import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.schema.response.Response;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.representation.Form;

public class JerseyIntacctRestClient implements IntacctRestClient
{
    private WebResource gateway;

    public JerseyIntacctRestClient(WebResource gateway)
    {
        this.gateway = gateway;
    }

    public JerseyIntacctRestClient(final Client client, final String gatewayURI)
    {
        this(createGateway(gatewayURI, client));
    }

    public JerseyIntacctRestClient(final String gatewayURI)
    {
        this(createGateway(gatewayURI, createClient(gatewayURI)));
    }

    private static WebResource createGateway(final String gatewayURI, final Client client)
    {
        Validate.notNull("client can't be null");
        Validate.notEmpty(gatewayURI, "gatewayURI can't be empty");

        return client.resource(gatewayURI);
    }

    /** creates the client for the intacct XML gateway */
    private static Client createClient(final String gatewayURI)
    {
        final ClientConfig config = new DefaultClientConfig();
        config.getClasses().add(Request.class);
        config.getClasses().add(Response.class);
        return Client.create(config);
    }

    @Override
    public Response postXml(String xml)
    {
        // It is important to make clear that we are using FORM URLENCODED
        // instead of
        // the custom media type because Jersey uses an "object" model. It
        // requires that
        // the content type must be parsed to some MediaType object.
        // Every media type must have a type and a subtype, as that custom type
        // doesn't use a subtype we cannot use it with Jersey.

        // We use a form because that's what jersey needs with URLENCODED type
        // to detect it
        // by itself with the MessageBodyWriter
        final MultivaluedMap<String, String> map = new Form();
        map.add("xmlrequest", xml);
        final Response post = gateway.type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).post(Response.class,
            map);
        return post;
    }

    @Override
    public void addSslConfiguration()
    {
        try
        {
            final SSLContext ctx = SSLContext.getInstance("SSL");
            ctx.init(null, null, null);
        }
        catch (Exception e)
        {
            // Should never happen
            throw new AssertionError(e);
        }
    }
}
