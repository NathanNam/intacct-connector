/*
 * Mule Intacct Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2.3-3- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.20 at 12:04:27 PM ART 
//

package org.mule.module.intacct.schema.response;

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
@XmlType(name = "", propOrder = {"banktxn"})
@XmlRootElement(name = "banktxns")
public class Banktxns
{

    @XmlElement(required = true)
    protected List<Banktxn> banktxn;

    /**
     * Gets the value of the banktxn property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the banktxn property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getBanktxn().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Banktxn }
     */
    public List<Banktxn> getBanktxn()
    {
        if (banktxn == null)
        {
            banktxn = new ArrayList<Banktxn>();
        }
        return this.banktxn;
    }

}
