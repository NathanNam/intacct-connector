/**
 * Mule Intacct Cloud Connector
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
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
