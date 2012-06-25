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

import org.mortbay.jetty.Server;
import org.mortbay.jetty.handler.AbstractHandler;
 

/**
 * Some Http Test server to do some real testing
 */
public class HttpTestServer 
{
    private org.mortbay.jetty.Server server;
    private final AbstractHandler handler;
    private final int port;
 
    
 
    public HttpTestServer(final AbstractHandler handler, final int port) 
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
