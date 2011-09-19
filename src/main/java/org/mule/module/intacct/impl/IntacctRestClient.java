
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
