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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "create_ictransactionType", propOrder = {"transactiontype", "datecreated", "createdfrom", "documentno",
    "referenceno", "message", "externalid", "basecurr", "customfields", "ictransitems", "subtotals"})
@XmlRootElement(name = "create_ictransaction")
public class CreateIctransaction
{

    @XmlElement(required = true)
    protected String transactiontype;
    @XmlElement(required = true)
    protected Datecreated datecreated;
    protected String createdfrom;
    protected String documentno;
    protected String referenceno;
    protected String message;
    protected String externalid;
    protected String basecurr;
    protected Customfields customfields;
    @XmlElement(required = true)
    protected Ictransitems ictransitems;
    protected Subtotals subtotals;

    /**
     * Gets the value of the transactiontype property.
     * 
     * @return possible object is {@link String }
     */
    public String getTransactiontype()
    {
        return transactiontype;
    }

    /**
     * Sets the value of the transactiontype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTransactiontype(String value)
    {
        this.transactiontype = value;
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
     * Gets the value of the createdfrom property.
     * 
     * @return possible object is {@link String }
     */
    public String getCreatedfrom()
    {
        return createdfrom;
    }

    /**
     * Sets the value of the createdfrom property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCreatedfrom(String value)
    {
        this.createdfrom = value;
    }

    /**
     * Gets the value of the documentno property.
     * 
     * @return possible object is {@link String }
     */
    public String getDocumentno()
    {
        return documentno;
    }

    /**
     * Sets the value of the documentno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDocumentno(String value)
    {
        this.documentno = value;
    }

    /**
     * Gets the value of the referenceno property.
     * 
     * @return possible object is {@link String }
     */
    public String getReferenceno()
    {
        return referenceno;
    }

    /**
     * Sets the value of the referenceno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setReferenceno(String value)
    {
        this.referenceno = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return possible object is {@link String }
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setMessage(String value)
    {
        this.message = value;
    }

    /**
     * Gets the value of the externalid property.
     * 
     * @return possible object is {@link String }
     */
    public String getExternalid()
    {
        return externalid;
    }

    /**
     * Sets the value of the externalid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExternalid(String value)
    {
        this.externalid = value;
    }

    /**
     * Gets the value of the basecurr property.
     * 
     * @return possible object is {@link String }
     */
    public String getBasecurr()
    {
        return basecurr;
    }

    /**
     * Sets the value of the basecurr property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBasecurr(String value)
    {
        this.basecurr = value;
    }

    /**
     * Gets the value of the customfields property.
     * 
     * @return possible object is {@link Customfields }
     */
    public Customfields getCustomfields()
    {
        return customfields;
    }

    /**
     * Sets the value of the customfields property.
     * 
     * @param value allowed object is {@link Customfields }
     */
    public void setCustomfields(Customfields value)
    {
        this.customfields = value;
    }

    /**
     * Gets the value of the ictransitems property.
     * 
     * @return possible object is {@link Ictransitems }
     */
    public Ictransitems getIctransitems()
    {
        return ictransitems;
    }

    /**
     * Sets the value of the ictransitems property.
     * 
     * @param value allowed object is {@link Ictransitems }
     */
    public void setIctransitems(Ictransitems value)
    {
        this.ictransitems = value;
    }

    /**
     * Gets the value of the subtotals property.
     * 
     * @return possible object is {@link Subtotals }
     */
    public Subtotals getSubtotals()
    {
        return subtotals;
    }

    /**
     * Sets the value of the subtotals property.
     * 
     * @param value allowed object is {@link Subtotals }
     */
    public void setSubtotals(Subtotals value)
    {
        this.subtotals = value;
    }

}
