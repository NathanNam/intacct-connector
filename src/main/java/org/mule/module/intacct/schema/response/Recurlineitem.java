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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"accountlabelOrGlaccountno", "amount", "memo", "locationid", "departmentid"})
@XmlRootElement(name = "recurlineitem")
public class Recurlineitem
{

    @XmlElements({@XmlElement(name = "accountlabel", required = true, type = Accountlabel.class),
        @XmlElement(name = "glaccountno", required = true, type = Glaccountno.class)})
    protected List<Object> accountlabelOrGlaccountno;
    @XmlElement(required = true)
    protected Amount amount;
    protected String memo;
    protected Locationid locationid;
    protected Departmentid departmentid;

    /**
     * Gets the value of the accountlabelOrGlaccountno property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the accountlabelOrGlaccountno property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAccountlabelOrGlaccountno().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Accountlabel }
     * {@link Glaccountno }
     */
    public List<Object> getAccountlabelOrGlaccountno()
    {
        if (accountlabelOrGlaccountno == null)
        {
            accountlabelOrGlaccountno = new ArrayList<Object>();
        }
        return this.accountlabelOrGlaccountno;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return possible object is {@link Amount }
     */
    public Amount getAmount()
    {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value allowed object is {@link Amount }
     */
    public void setAmount(Amount value)
    {
        this.amount = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return possible object is {@link String }
     */
    public String getMemo()
    {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setMemo(String value)
    {
        this.memo = value;
    }

    /**
     * Gets the value of the locationid property.
     * 
     * @return possible object is {@link Locationid }
     */
    public Locationid getLocationid()
    {
        return locationid;
    }

    /**
     * Sets the value of the locationid property.
     * 
     * @param value allowed object is {@link Locationid }
     */
    public void setLocationid(Locationid value)
    {
        this.locationid = value;
    }

    /**
     * Gets the value of the departmentid property.
     * 
     * @return possible object is {@link Departmentid }
     */
    public Departmentid getDepartmentid()
    {
        return departmentid;
    }

    /**
     * Sets the value of the departmentid property.
     * 
     * @param value allowed object is {@link Departmentid }
     */
    public void setDepartmentid(Departmentid value)
    {
        this.departmentid = value;
    }

}