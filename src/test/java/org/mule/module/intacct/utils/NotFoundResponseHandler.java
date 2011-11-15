/*
 * Mule Intacct Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.intacct.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  This responds a 404
 */
public class NotFoundResponseHandler extends AbstractTestHandler
{


    @Override
    protected void doHandle(String target,
                            HttpServletRequest request,
                            HttpServletResponse response,
                            int dispatch)
    {
        //Does nothing, the response is empty and the rest is on the parent
        
    }

    @Override
    protected int getResponseStatus()
    {
        return HttpServletResponse.SC_NOT_FOUND;
    }

}
