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


