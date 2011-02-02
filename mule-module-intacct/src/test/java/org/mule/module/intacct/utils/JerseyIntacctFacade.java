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

import org.mule.module.intacct.impl.JerseySslIntacctFacade;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

/**
 *  This uses jersey to connect to the server but it DOESN'T use SSL (for server usages)
 */
public class JerseyIntacctFacade extends JerseySslIntacctFacade
{

    public JerseyIntacctFacade(final String gatewayURI)
    {
        super(gatewayURI);
    }

    @Override
    protected void addSslConfiguration() throws NoSuchAlgorithmException, KeyManagementException
    {
        //Does nothing. No ssl
    }
    
    
    
}


