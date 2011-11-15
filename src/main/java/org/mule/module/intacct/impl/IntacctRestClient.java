/**
 * Mule Intacct Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.module.intacct.impl;

import org.mule.module.intacct.schema.response.Response;

/**
 * IntacctRestClient
 * @author flbulgarelli
 */
public interface IntacctRestClient
{
    /**
     * Sends an xml request
     * 
     * @param xml
     * @return the resposne
     */
    Response postXml(String xml);

    void addSslConfiguration();

}
