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
@XmlType(name = "", propOrder = {"wureceipts"})
@XmlRootElement(name = "record_wureceipts")
public class RecordWureceipts
{

    @XmlElement(required = true)
    protected Wureceipts wureceipts;

    /**
     * Gets the value of the wureceipts property.
     * 
     * @return possible object is {@link Wureceipts }
     */
    public Wureceipts getWureceipts()
    {
        return wureceipts;
    }

    /**
     * Sets the value of the wureceipts property.
     * 
     * @param value allowed object is {@link Wureceipts }
     */
    public void setWureceipts(Wureceipts value)
    {
        this.wureceipts = value;
    }

}
