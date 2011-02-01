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

import org.mortbay.jetty.Server;
import org.mortbay.jetty.handler.AbstractHandler;
 

/**
 * Some Http Test server for the connector
 */
public class HttpTestServer 
{
    private org.mortbay.jetty.Server server;
    private final AbstractHandler handler;
    private final int port;
 
    
 
    public HttpTestServer(AbstractHandler handler, int port) 
    {
        this.handler = handler;
        this.port = port;
        
    }
 
    public void start() throws Exception 
    {
        configureServer();
        startServer();
    }
 
    private void startServer() throws Exception 
    {
        getServer().start();
    }
 
    protected void configureServer() 
    {
        setServer(new Server(port));
        getServer().setHandler(handler);
    }
 
    
 
    public void stop() throws Exception 
    {
        getServer().stop();
    }

    public void setServer(org.mortbay.jetty.Server server)
    {
        this.server = server;
    }

    public org.mortbay.jetty.Server getServer()
    {
        return server;
    }
 
 
 
}



