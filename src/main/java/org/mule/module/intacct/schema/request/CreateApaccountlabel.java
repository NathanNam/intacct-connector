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
@XmlType(name = "create_apaccountlabelType", propOrder = {"glaccountno", "accountlabel", "description", "offsetglaccountno", "status",
    "externalid"})
@XmlRootElement(name = "create_apaccountlabel")
public class CreateApaccountlabel
{

    @XmlAttribute(name = "ignoreduplicates")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ignoreduplicates;
    @XmlElement(required = true)
    protected Glaccountno glaccountno;
    @XmlElement(required = true)
    protected Accountlabel accountlabel;
    @XmlElement(required = true)
    protected String description;
    protected String offsetglaccountno;
    protected String status;
    protected String externalid;

    /**
     * Gets the value of the ignoreduplicates property.
     * 
     * @return possible object is {@link String }
     */
    public String getIgnoreduplicates()
    {
        if (ignoreduplicates == null)
        {
            return "false";
        }
        else
        {
            return ignoreduplicates;
        }
    }

    /**
     * Sets the value of the ignoreduplicates property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setIgnoreduplicates(String value)
    {
        this.ignoreduplicates = value;
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

}
