/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.intacct.exceptions;

import org.mule.api.MuleEvent;
import org.mule.api.exception.MessagingExceptionHandler;
import org.mule.exception.DefaultServiceExceptionStrategy;

import java.beans.ExceptionListener;

public class ExceptionHandler extends DefaultServiceExceptionStrategy
                           implements MessagingExceptionHandler, ExceptionListener 
{

    
    @Override
    protected void defaultHandler(final Throwable t)
    {
        exception = t;
    }

    private Throwable exception;
    

    public void setException(final Exception exception)
    {
        this.exception = exception;
    }

    public Throwable getException()
    {
        return exception;
    }

    @Override
    public MuleEvent handleException(final Exception exception, final MuleEvent event)
    {
        this.exception = exception;
        return event;
    }

    @Override
    public void exceptionThrown(final Exception e)
    {
        exception = e;
        
    }

}


