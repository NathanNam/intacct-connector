/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.intacct.utils;

import java.net.URL;

import org.mortbay.jetty.Connector;
import org.mortbay.jetty.handler.AbstractHandler;
import org.mortbay.jetty.security.SslSocketConnector;

public class SslTestServer extends HttpTestServer
{
    

    
    private final int sslPort;

    public SslTestServer(AbstractHandler handler, int port, int sslPort)
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
