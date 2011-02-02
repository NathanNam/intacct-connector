/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.intacct.util;

import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.schema.response.Response;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.apache.commons.lang.UnhandledException;

/**
 * Holds the JAXB Context for parsing Intacct XML request and response 
 */
public final class JaxBUtils
{
    /** utility class */
    private JaxBUtils()
    {
        // nothing to do
    }
    
    public static final JAXBContext REQUEST_JAXB_CTX = loadJaxBCtx(Request.class.getPackage().getName());
    
    public static final JAXBContext RESPONSE_JAXB_CTX = loadJaxBCtx(Response.class.getPackage().getName());
    /** loads JAXB context */
    private static JAXBContext loadJaxBCtx(final String pkg) 
    {
        JAXBContext ctx;
        try
        {
            ctx = JAXBContext.newInstance(pkg);
        }
        catch (final JAXBException e)
        {
            throw new UnhandledException(e);
        }
        return ctx;
    }

}


