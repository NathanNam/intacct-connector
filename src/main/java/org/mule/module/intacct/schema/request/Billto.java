/**
 * Mule Intacct Cloud Connector
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2.3-3- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.20 at 12:04:16 PM ART 
//

package org.mule.module.intacct.schema.request;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"contactOrContactname"})
@XmlRootElement(name = "billto")
public class Billto
{

    @XmlElements({@XmlElement(name = "contact", required = true, type = Contact.class),
        @XmlElement(name = "contactname", required = true, type = Contactname.class)})
    protected List<Object> contactOrContactname;

    /**
     * Gets the value of the contactOrContactname property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the contactOrContactname property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getContactOrContactname().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Contact }
     * {@link Contactname }
     */
    public List<Object> getContactOrContactname()
    {
        if (contactOrContactname == null)
        {
            contactOrContactname = new ArrayList<Object>();
        }
        return this.contactOrContactname;
    }

}
