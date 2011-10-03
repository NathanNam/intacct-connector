
	
	/*
	 * Copyright (c) 2011 Zauber S.A.  -- All rights reserved
	 */
	
	package org.mule.module.intacct;

import org.mule.module.intacct.schema.request.Expression;
import org.mule.module.intacct.schema.request.Logical;

	
	/**
 * TODO: Description of the class, Comments in english by default  
 * 
 * 
 * @author Gaston Ponti
 * @since Oct 3, 2011
 */

public enum FilterType implements EnumType
{
    Logical(Logical.class),
    Expression(Expression.class);
    
    private Class<?> requestType;

    private FilterType(Class<?> requestType){
        this.requestType = requestType;
    }
    
    public Object newInstance() {
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