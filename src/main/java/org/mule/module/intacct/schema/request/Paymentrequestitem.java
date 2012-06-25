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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"key", "paymentamount", "credittoapply", "discounttoapply"})
@XmlRootElement(name = "paymentrequestitem")
public class Paymentrequestitem
{

    @XmlAttribute(name = "externalkey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String externalkey;
    @XmlElement(required = true)
    protected String key;
    @XmlElement(required = true)
    protected Paymentamount paymentamount;
    protected String credittoapply;
    protected String discounttoapply;

    /**
     * Gets the value of the externalkey property.
     * 
     * @return possible object is {@link String }
     */
    public String getExternalkey()
    {
        if (externalkey == null)
        {
            return "false";
        }
        else
        {
            return externalkey;
        }
    }

    /**
     * Sets the value of the externalkey property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExternalkey(String value)
    {
        this.externalkey = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return possible object is {@link String }
     */
    public String getKey()
    {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setKey(String value)
    {
        this.key = value;
    }

    /**
     * Gets the value of the paymentamount property.
     * 
     * @return possible object is {@link Paymentamount }
     */
    public Paymentamount getPaymentamount()
    {
        return paymentamount;
    }

    /**
     * Sets the value of the paymentamount property.
     * 
     * @param value allowed object is {@link Paymentamount }
     */
    public void setPaymentamount(Paymentamount value)
    {
        this.paymentamount = value;
    }

    /**
     * Gets the value of the credittoapply property.
     * 
     * @return possible object is {@link String }
     */
    public String getCredittoapply()
    {
        return credittoapply;
    }

    /**
     * Sets the value of the credittoapply property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCredittoapply(String value)
    {
        this.credittoapply = value;
    }

    /**
     * Gets the value of the discounttoapply property.
     * 
     * @return possible object is {@link String }
     */
    public String getDiscounttoapply()
    {
        return discounttoapply;
    }

    /**
     * Sets the value of the discounttoapply property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDiscounttoapply(String value)
    {
        this.discounttoapply = value;
    }

}
