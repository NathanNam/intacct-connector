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
@XmlType(name = "", propOrder = {"postingdate", "txntype", "doctype", "document", "payee", "amount",
    "description"})
@XmlRootElement(name = "banktxn")
public class Banktxn
{

    @XmlElement(required = true)
    protected Postingdate postingdate;
    @XmlElement(required = true)
    protected String txntype;
    @XmlElement(required = true)
    protected Doctype doctype;
    @XmlElement(required = true)
    protected String document;
    @XmlElement(required = true)
    protected String payee;
    @XmlElement(required = true)
    protected Amount amount;
    protected String description;

    /**
     * Gets the value of the postingdate property.
     * 
     * @return possible object is {@link Postingdate }
     */
    public Postingdate getPostingdate()
    {
        return postingdate;
    }

    /**
     * Sets the value of the postingdate property.
     * 
     * @param value allowed object is {@link Postingdate }
     */
    public void setPostingdate(Postingdate value)
    {
        this.postingdate = value;
    }

    /**
     * Gets the value of the txntype property.
     * 
     * @return possible object is {@link String }
     */
    public String getTxntype()
    {
        return txntype;
    }

    /**
     * Sets the value of the txntype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTxntype(String value)
    {
        this.txntype = value;
    }

    /**
     * Gets the value of the doctype property.
     * 
     * @return possible object is {@link Doctype }
     */
    public Doctype getDoctype()
    {
        return doctype;
    }

    /**
     * Sets the value of the doctype property.
     * 
     * @param value allowed object is {@link Doctype }
     */
    public void setDoctype(Doctype value)
    {
        this.doctype = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return possible object is {@link String }
     */
    public String getDocument()
    {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDocument(String value)
    {
        this.document = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     * @return possible object is {@link String }
     */
    public String getPayee()
    {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPayee(String value)
    {
        this.payee = value;
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

}
