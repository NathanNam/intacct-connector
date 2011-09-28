
	
	/*
	 * Copyright (c) 2011 Zauber S.A.  -- All rights reserved
	 */
	
	package org.mule.module.intacct;

import org.mule.module.intacct.schema.request.Contact;
import org.mule.module.intacct.schema.request.Contactname;

	
/** 
 * 
 * @author Gaston Ponti
 * @since Sep 28, 2011
 */

public enum ContactType
{
     Contact(Contact.class),
     ContacName(Contactname.class);
     
     private Class<?> requestType;

     private ContactType(Class<?> requestType){
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

    public Class<?> getRequestType()
    {
        return requestType;
    }
}

	