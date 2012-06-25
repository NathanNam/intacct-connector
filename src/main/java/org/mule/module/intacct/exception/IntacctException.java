/**
 * Mule Intacct Cloud Connector
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
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


