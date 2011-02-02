/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.intacct.exception;

/**
 * Exception used to wrap connector's errors.
 */
public class IntacctException extends RuntimeException
{

    private static final long serialVersionUID = 942551423883775681L;

    public IntacctException()
    {
        super();
    }

    public IntacctException(final String message, final Throwable cause)
    {
        super(message, cause);
    }

    public IntacctException(final String message)
    {
        super(message);
    }

    public IntacctException(final Throwable cause)
    {
        super(cause);
    }

}


