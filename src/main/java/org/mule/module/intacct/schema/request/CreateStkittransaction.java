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
@XmlType(name = "create_stkittransactionType", propOrder = {"transactiontype", "datecreated", "createdfrom", "documentno",
    "referenceno", "message", "externalid", "customfields", "stkittransitems"})
@XmlRootElement(name = "create_stkittransaction")
public class CreateStkittransaction
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
    protected Customfields customfields;
    protected Stkittransitems stkittransitems;

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
     * Gets the value of the stkittransitems property.
     * 
     * @return possible object is {@link Stkittransitems }
     */
    public Stkittransitems getStkittransitems()
    {
        return stkittransitems;
    }

    /**
     * Sets the value of the stkittransitems property.
     * 
     * @param value allowed object is {@link Stkittransitems }
     */
    public void setStkittransitems(Stkittransitems value)
    {
        this.stkittransitems = value;
    }

}