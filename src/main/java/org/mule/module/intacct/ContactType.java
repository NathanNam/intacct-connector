
package org.mule.module.intacct;

import org.mule.module.intacct.schema.request.Contact;
import org.mule.module.intacct.schema.request.Contactname;


/** 
 * Diferents types of saving a contact.
 * @author Gaston Ponti
 */

public enum ContactType implements EnumType
{
    /**
     * Type contact with more information.
     */
     Contact(Contact.class),
     
     /**
      * type contact only with the string of the name.
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

