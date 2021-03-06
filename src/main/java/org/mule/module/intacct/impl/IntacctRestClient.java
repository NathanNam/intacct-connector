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
