/**
 * Mule Intacct Cloud Connector
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


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

import org.mule.module.intacct.schema.request.Contact;
import org.mule.module.intacct.schema.request.Contactname;


/** 
 * Diferents types of reference to a contact.
 * @author Gaston Ponti
 */

public enum ContactType implements EnumType
{
    /**
     * Type contact use it when you want to create a new contact. You can provide 
     * the details for the contact, and a new contact will be created with this data.
     * When updating an employee, if updates to the employee's contact information 
     * are to be made, the changes can be specified in the contact object.
     */
     Contact(Contact.class),
     
     /**
      * Type contact only with the string of the name, that refers to a contact 
      * that already exists. You can link the employee to the existing contact 
      * using this.
      */
     ContactName(Contactname.class);
     
     private Class<?> requestType;

     private ContactType(Class<?> requestType)
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

