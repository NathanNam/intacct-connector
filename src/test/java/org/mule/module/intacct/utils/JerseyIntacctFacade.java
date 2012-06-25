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

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import org.mule.module.intacct.impl.IntacctRestClient;
import org.mule.module.intacct.impl.JerseySslIntacctFacade;

/**
 *  This uses jersey to connect to the server but it DOESN'T use SSL (for server usages)
 */
public class JerseyIntacctFacade extends JerseySslIntacctFacade
{

    public JerseyIntacctFacade(final String gatewayURI)
    {
        super(gatewayURI);
    }
    
    

    public JerseyIntacctFacade(IntacctRestClient client)
    {
        super(client);
    }



    @Override
    protected void addSslConfiguration() throws NoSuchAlgorithmException, KeyManagementException
    {
        //Does nothing. No ssl
    }
    
    
    
}


