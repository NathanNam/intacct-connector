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
@XmlType(name = "", propOrder = {"accountno"})
@XmlRootElement(name = "ctanetincomeacct")
public class Ctanetincomeacct
{

    @XmlElement(required = true)
    protected String accountno;

    /**
     * Gets the value of the accountno property.
     * 
     * @return possible object is {@link String }
     */
    public String getAccountno()
    {
        return accountno;
    }

    /**
     * Sets the value of the accountno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAccountno(String value)
    {
        this.accountno = value;
    }

}
