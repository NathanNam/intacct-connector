/*
 * Mule Intacct Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.intacct;

import org.mule.module.intacct.schema.request.Expression;
import org.mule.module.intacct.schema.request.Logical;


/**
 * @author Gaston Ponti
 */

public enum FilterType implements EnumType
{
    Logical(Logical.class),
    Expression(Expression.class);
    
    private Class<?> requestType;

    private FilterType(Class<?> requestType)
    {
        this.requestType = requestType;
    }
    
    public Object newInstance()
    {
        try
        {
            return requestType.newInstance();
        }
        catch (Exception e)
        {
            // Can never occur
            throw new AssertionError(e);
        }
    }
    
    /**
    * Returns the requestType.
    * 
    * @return  with the requestType.
    */
   @Override
   public Class<?> getRequestType()
   {
       return requestType;
   }
}
