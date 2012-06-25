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
