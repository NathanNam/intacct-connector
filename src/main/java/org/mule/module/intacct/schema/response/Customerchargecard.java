//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2.3-3- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.20 at 12:04:27 PM ART 
//

package org.mule.module.intacct.schema.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"recordno", "customerid", "cardnum", "maskcardnum", "cardtype", "expMonth",
    "expYear", "description", "defaultcard", "status", "mailaddress"})
@XmlRootElement(name = "customerchargecard")
public class Customerchargecard
{

    @XmlElement(required = true)
    protected String recordno;
    @XmlElement(required = true)
    protected String customerid;
    @XmlElement(required = true)
    protected String cardnum;
    @XmlElement(required = true)
    protected String maskcardnum;
    @XmlElement(required = true)
    protected String cardtype;
    @XmlElement(name = "exp_month", required = true)
    protected String expMonth;
    @XmlElement(name = "exp_year", required = true)
    protected String expYear;
    protected String description;
    protected String defaultcard;
    protected String status;
    @XmlElement(required = true)
    protected Mailaddress mailaddress;

    /**
     * Gets the value of the recordno property.
     * 
     * @return possible object is {@link String }
     */
    public String getRecordno()
    {
        return recordno;
    }

    /**
     * Sets the value of the recordno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRecordno(String value)
    {
        this.recordno = value;
    }

    /**
     * Gets the value of the customerid property.
     * 
     * @return possible object is {@link String }
     */
    public String getCustomerid()
    {
        return customerid;
    }

    /**
     * Sets the value of the customerid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCustomerid(String value)
    {
        this.customerid = value;
    }

    /**
     * Gets the value of the cardnum property.
     * 
     * @return possible object is {@link String }
     */
    public String getCardnum()
    {
        return cardnum;
    }

    /**
     * Sets the value of the cardnum property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCardnum(String value)
    {
        this.cardnum = value;
    }

    /**
     * Gets the value of the maskcardnum property.
     * 
     * @return possible object is {@link String }
     */
    public String getMaskcardnum()
    {
        return maskcardnum;
    }

    /**
     * Sets the value of the maskcardnum property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setMaskcardnum(String value)
    {
        this.maskcardnum = value;
    }

    /**
     * Gets the value of the cardtype property.
     * 
     * @return possible object is {@link String }
     */
    public String getCardtype()
    {
        return cardtype;
    }

    /**
     * Sets the value of the cardtype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCardtype(String value)
    {
        this.cardtype = value;
    }

    /**
     * Gets the value of the expMonth property.
     * 
     * @return possible object is {@link String }
     */
    public String getExpMonth()
    {
        return expMonth;
    }

    /**
     * Sets the value of the expMonth property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExpMonth(String value)
    {
        this.expMonth = value;
    }

    /**
     * Gets the value of the expYear property.
     * 
     * @return possible object is {@link String }
     */
    public String getExpYear()
    {
        return expYear;
    }

    /**
     * Sets the value of the expYear property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setExpYear(String value)
    {
        this.expYear = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link String }
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDescription(String value)
    {
        this.description = value;
    }

    /**
     * Gets the value of the defaultcard property.
     * 
     * @return possible object is {@link String }
     */
    public String getDefaultcard()
    {
        return defaultcard;
    }

    /**
     * Sets the value of the defaultcard property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDefaultcard(String value)
    {
        this.defaultcard = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return possible object is {@link String }
     */
    public String getStatus()
    {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setStatus(String value)
    {
        this.status = value;
    }

    /**
     * Gets the value of the mailaddress property.
     * 
     * @return possible object is {@link Mailaddress }
     */
    public Mailaddress getMailaddress()
    {
        return mailaddress;
    }

    /**
     * Sets the value of the mailaddress property.
     * 
     * @param value allowed object is {@link Mailaddress }
     */
    public void setMailaddress(Mailaddress value)
    {
        this.mailaddress = value;
    }

}