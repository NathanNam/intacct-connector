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

import java.net.URL;

import org.mortbay.jetty.Connector;
import org.mortbay.jetty.handler.AbstractHandler;
import org.mortbay.jetty.security.SslSocketConnector;

/**
 *  This is a test server that works with SSL and no SSL.
 */
public class SslTestServer extends HttpTestServer
{
    private final int sslPort;

    public SslTestServer(final AbstractHandler handler, final int port, final int sslPort)
    {
        super(handler, port);
        this.sslPort = sslPort;
    }

    @Override
    protected void configureServer()
    {
        super.configureServer();
        Connector secureConnector = createSecureConnector();
        getServer().addConnector(secureConnector);
    }

    private Connector createSecureConnector()
    {
        SslSocketConnector connector = new SslSocketConnector();
        connector.setPort(sslPort);
        URL keystoreUrl = getClass().getClassLoader().getResource("keystore");
        connector.setKeystore(keystoreUrl.getFile());
        connector.setKeyPassword("gonto");
        return connector;
    }

}
