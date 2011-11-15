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
@XmlType(name = "create_invoicebatchType", propOrder = {"batchtitle", "datecreated", "createInvoice"})
@XmlRootElement(name = "create_invoicebatch")
public class CreateInvoicebatch
{

    @XmlElement(required = true)
    protected String batchtitle;
    protected Datecreated datecreated;
    @XmlElement(name = "create_invoice")
    protected List<CreateInvoice> createInvoice;

    /**
     * Gets the value of the batchtitle property.
     * 
     * @return possible object is {@link String }
     */
    public String getBatchtitle()
    {
        return batchtitle;
    }

    /**
     * Sets the value of the batchtitle property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBatchtitle(String value)
    {
        this.batchtitle = value;
    }

    /**
     * Gets the value of the datecreated property.
     * 
     * @return possible object is {@link Datecreated }
     */
    public Datecreated getDatecreated()
    {
        return datecreated;
    }

    /**
     * Sets the value of the datecreated property.
     * 
     * @param value allowed object is {@link Datecreated }
     */
    public void setDatecreated(Datecreated value)
    {
        this.datecreated = value;
    }

    /**
     * Gets the value of the createInvoice property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the createInvoice property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getCreateInvoice().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link CreateInvoice }
     */
    public List<CreateInvoice> getCreateInvoice()
    {
        if (createInvoice == null)
        {
            createInvoice = new ArrayList<CreateInvoice>();
        }
        return this.createInvoice;
    }

}
