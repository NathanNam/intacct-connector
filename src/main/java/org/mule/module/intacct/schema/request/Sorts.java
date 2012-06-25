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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"sortfield"})
@XmlRootElement(name = "sorts")
public class Sorts
{

    @XmlElement(required = true)
    protected List<Sortfield> sortfield;

    /**
     * Gets the value of the sortfield property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the sortfield property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSortfield().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Sortfield }
     */
    public List<Sortfield> getSortfield()
    {
        if (sortfield == null)
        {
            sortfield = new ArrayList<Sortfield>();
        }
        return this.sortfield;
    }

}
