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
@XmlType(name = "", propOrder = {"customfieldname", "customfieldvalue"})
@XmlRootElement(name = "customfield")
public class Customfield
{

    @XmlElement(required = true)
    protected String customfieldname;
    @XmlElement(required = true)
    protected String customfieldvalue;

    /**
     * Gets the value of the customfieldname property.
     * 
     * @return possible object is {@link String }
     */
    public String getCustomfieldname()
    {
        return customfieldname;
    }

    /**
     * Sets the value of the customfieldname property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCustomfieldname(String value)
    {
        this.customfieldname = value;
    }

    /**
     * Gets the value of the customfieldvalue property.
     * 
     * @return possible object is {@link String }
     */
    public String getCustomfieldvalue()
    {
        return customfieldvalue;
    }

    /**
     * Sets the value of the customfieldvalue property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCustomfieldvalue(String value)
    {
        this.customfieldvalue = value;
    }

}
