//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2.3-3- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.20 at 12:04:27 PM ART 
//

package org.mule.module.intacct.schema.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"checkpaperformat", "signaturesrequired"})
@XmlRootElement(name = "checklayout")
public class Checklayout
{

    protected String checkpaperformat;
    protected String signaturesrequired;

    /**
     * Gets the value of the checkpaperformat property.
     * 
     * @return possible object is {@link String }
     */
    public String getCheckpaperformat()
    {
        return checkpaperformat;
    }

    /**
     * Sets the value of the checkpaperformat property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setCheckpaperformat(String value)
    {
        this.checkpaperformat = value;
    }

    /**
     * Gets the value of the signaturesrequired property.
     * 
     * @return possible object is {@link String }
     */
    public String getSignaturesrequired()
    {
        return signaturesrequired;
    }

    /**
     * Sets the value of the signaturesrequired property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSignaturesrequired(String value)
    {
        this.signaturesrequired = value;
    }

}
