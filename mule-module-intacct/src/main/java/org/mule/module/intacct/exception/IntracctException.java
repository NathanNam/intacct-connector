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

public class IntracctException extends RuntimeException
{

    public IntracctException()
    {
        super();
    }

    public IntracctException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public IntracctException(String message)
    {
        super(message);
    }

    public IntracctException(Throwable cause)
    {
        super(cause);
    }

}


