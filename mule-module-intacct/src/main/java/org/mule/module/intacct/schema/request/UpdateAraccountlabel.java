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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"glaccountno", "description", "offsetglaccountno", "status", "taxcode"})
@XmlRootElement(name = "update_araccountlabel")
public class UpdateAraccountlabel
{

    @XmlAttribute(name = "accountlabel", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String accountlabel;
    @XmlAttribute(name = "set_nulls")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String setNulls;
    @XmlAttribute(name = "externalkey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String externalkey;
    protected Glaccountno glaccountno;
    protected String description;
    protected String offsetglaccountno;
    protected String status;
    protected String taxcode;

    /**
     * Gets the value of the accountlabel property.
     * 
     * @return possible object is {@link String }
     */
    public String getAccountlabel()
    {
        return accountlabel;
    }

    /**
     * Sets the value of the accountlabel property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAccountlabel(String value)
    {
        this.accountlabel = value;
    }

    /**
     * Gets the value of the setNulls property.
     * 
     * @return possible object is {@link String }
     */
    public String getSetNulls()
    {
        if (setNulls == null)
        {
            return "false";
        }
        else
        {
            return setNulls;
        }
    }

    /**
     * Sets the value of the setNulls property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSetNulls(String value)
    {
        this.setNulls = value;
    }

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
     * Gets the value of the offsetglaccountno property.
     * 
     * @return possible object is {@link String }
     */
    public String getOffsetglaccountno()
    {
        return offsetglaccountno;
    }

    /**
     * Sets the value of the offsetglaccountno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setOffsetglaccountno(String value)
    {
        this.offsetglaccountno = value;
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
     * Gets the value of the taxcode property.
     * 
     * @return possible object is {@link String }
     */
    public String getTaxcode()
    {
        return taxcode;
    }

    /**
     * Sets the value of the taxcode property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTaxcode(String value)
    {
        this.taxcode = value;
    }

}
