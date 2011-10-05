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
@XmlType(name = "create_taxdetailType", propOrder = {"detailid", "description", "taxtype", "value", "mintaxable", "maxtaxable",
    "include", "mintax", "maxtax", "glaccountno", "accountlabel", "taxauthority", "status"})
@XmlRootElement(name = "create_taxdetail")
public class CreateTaxdetail
{

    @XmlElement(required = true)
    protected String detailid;
    protected String description;
    @XmlElement(required = true)
    protected String taxtype;
    protected Value value;
    protected String mintaxable;
    protected String maxtaxable;
    protected String include;
    protected String mintax;
    protected String maxtax;
    @XmlElement(required = true)
    protected Glaccountno glaccountno;
    protected Accountlabel accountlabel;
    protected String taxauthority;
    protected String status;

    /**
     * Gets the value of the detailid property.
     * 
     * @return possible object is {@link String }
     */
    public String getDetailid()
    {
        return detailid;
    }

    /**
     * Sets the value of the detailid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDetailid(String value)
    {
        this.detailid = value;
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
     * Gets the value of the taxtype property.
     * 
     * @return possible object is {@link String }
     */
    public String getTaxtype()
    {
        return taxtype;
    }

    /**
     * Sets the value of the taxtype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTaxtype(String value)
    {
        this.taxtype = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return possible object is {@link Value }
     */
    public Value getValue()
    {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value allowed object is {@link Value }
     */
    public void setValue(Value value)
    {
        this.value = value;
    }

    /**
     * Gets the value of the mintaxable property.
     * 
     * @return possible object is {@link String }
     */
    public String getMintaxable()
    {
        return mintaxable;
    }

    /**
     * Sets the value of the mintaxable property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setMintaxable(String value)
    {
        this.mintaxable = value;
    }

    /**
     * Gets the value of the maxtaxable property.
     * 
     * @return possible object is {@link String }
     */
    public String getMaxtaxable()
    {
        return maxtaxable;
    }

    /**
     * Sets the value of the maxtaxable property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setMaxtaxable(String value)
    {
        this.maxtaxable = value;
    }

    /**
     * Gets the value of the include property.
     * 
     * @return possible object is {@link String }
     */
    public String getInclude()
    {
        return include;
    }

    /**
     * Sets the value of the include property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setInclude(String value)
    {
        this.include = value;
    }

    /**
     * Gets the value of the mintax property.
     * 
     * @return possible object is {@link String }
     */
    public String getMintax()
    {
        return mintax;
    }

    /**
     * Sets the value of the mintax property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setMintax(String value)
    {
        this.mintax = value;
    }

    /**
     * Gets the value of the maxtax property.
     * 
     * @return possible object is {@link String }
     */
    public String getMaxtax()
    {
        return maxtax;
    }

    /**
     * Sets the value of the maxtax property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setMaxtax(String value)
    {
        this.maxtax = value;
    }

    /**
     * Gets the value of the glaccountno property.
     * 
     * @return possible object is {@link Glaccountno }
     */
    public Glaccountno getGlaccountno()
    {
        return glaccountno;
    }

    /**
     * Sets the value of the glaccountno property.
     * 
     * @param value allowed object is {@link Glaccountno }
     */
    public void setGlaccountno(Glaccountno value)
    {
        this.glaccountno = value;
    }

    /**
     * Gets the value of the accountlabel property.
     * 
     * @return possible object is {@link Accountlabel }
     */
    public Accountlabel getAccountlabel()
    {
        return accountlabel;
    }

    /**
     * Sets the value of the accountlabel property.
     * 
     * @param value allowed object is {@link Accountlabel }
     */
    public void setAccountlabel(Accountlabel value)
    {
        this.accountlabel = value;
    }

    /**
     * Gets the value of the taxauthority property.
     * 
     * @return possible object is {@link String }
     */
    public String getTaxauthority()
    {
        return taxauthority;
    }

    /**
     * Sets the value of the taxauthority property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTaxauthority(String value)
    {
        this.taxauthority = value;
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

}
