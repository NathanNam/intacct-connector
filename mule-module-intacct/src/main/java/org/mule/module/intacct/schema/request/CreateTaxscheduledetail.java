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
@XmlType(name = "create_taxscheduledetailType", propOrder = {"scheduleid", "detailid"})
@XmlRootElement(name = "create_taxscheduledetail")
public class CreateTaxscheduledetail
{

    @XmlElement(required = true)
    protected String scheduleid;
    @XmlElement(required = true)
    protected String detailid;

    /**
     * Gets the value of the scheduleid property.
     * 
     * @return possible object is {@link String }
     */
    public String getScheduleid()
    {
        return scheduleid;
    }

    /**
     * Sets the value of the scheduleid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setScheduleid(String value)
    {
        this.scheduleid = value;
    }

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

}
