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

import javax.xml.bind.JAXBContext;

import org.mule.module.intacct.config.IntacctNamespaceHandler;

/**
 *  A {@link JaxBOkHandler} that uses the response context for intacct
 */
public class IntacctJaxBOkHandler extends JaxBOkHandler
{

    public IntacctJaxBOkHandler(final Object objectToMarshall)
    {
        super(objectToMarshall);
    }

    @Override
    protected JAXBContext getContext()
    {
        return IntacctNamespaceHandler.RESPONSE_JAXB_CTX;
    }

}


