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
@XmlType(name = "create_artermType", propOrder = {"name", "description", "status", "due", "discount", "penalty"})
@XmlRootElement(name = "create_arterm")
public class CreateArterm
{

    @XmlElement(required = true)
    protected String name;
    protected String description;
    protected String status;
    protected Due due;
    protected Discount discount;
    protected Penalty penalty;

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setName(String value)
    {
        this.name = value;
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
     * Gets the value of the due property.
     * 
     * @return possible object is {@link Due }
     */
    public Due getDue()
    {
        return due;
    }

    /**
     * Sets the value of the due property.
     * 
     * @param value allowed object is {@link Due }
     */
    public void setDue(Due value)
    {
        this.due = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return possible object is {@link Discount }
     */
    public Discount getDiscount()
    {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value allowed object is {@link Discount }
     */
    public void setDiscount(Discount value)
    {
        this.discount = value;
    }

    /**
     * Gets the value of the penalty property.
     * 
     * @return possible object is {@link Penalty }
     */
    public Penalty getPenalty()
    {
        return penalty;
    }

    /**
     * Sets the value of the penalty property.
     * 
     * @param value allowed object is {@link Penalty }
     */
    public void setPenalty(Penalty value)
    {
        this.penalty = value;
    }

}
