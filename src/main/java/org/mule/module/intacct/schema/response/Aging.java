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
@XmlType(name = "", propOrder = {"agingperiod", "totalamount", "agingdetails"})
@XmlRootElement(name = "aging")
public class Aging
{

    @XmlElement(required = true)
    protected String agingperiod;
    @XmlElement(required = true)
    protected String totalamount;
    protected Agingdetails agingdetails;

    /**
     * Gets the value of the agingperiod property.
     * 
     * @return possible object is {@link String }
     */
    public String getAgingperiod()
    {
        return agingperiod;
    }

    /**
     * Sets the value of the agingperiod property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAgingperiod(String value)
    {
        this.agingperiod = value;
    }

    /**
     * Gets the value of the totalamount property.
     * 
     * @return possible object is {@link String }
     */
    public String getTotalamount()
    {
        return totalamount;
    }

    /**
     * Sets the value of the totalamount property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTotalamount(String value)
    {
        this.totalamount = value;
    }

    /**
     * Gets the value of the agingdetails property.
     * 
     * @return possible object is {@link Agingdetails }
     */
    public Agingdetails getAgingdetails()
    {
        return agingdetails;
    }

    /**
     * Sets the value of the agingdetails property.
     * 
     * @param value allowed object is {@link Agingdetails }
     */
    public void setAgingdetails(Agingdetails value)
    {
        this.agingdetails = value;
    }

}
