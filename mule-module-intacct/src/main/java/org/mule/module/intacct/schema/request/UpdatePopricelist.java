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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"datefrom", "dateto", "status"})
@XmlRootElement(name = "update_popricelist")
public class UpdatePopricelist
{

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    protected Datefrom datefrom;
    protected Dateto dateto;
    protected String status;

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
     * Gets the value of the datefrom property.
     * 
     * @return possible object is {@link Datefrom }
     */
    public Datefrom getDatefrom()
    {
        return datefrom;
    }

    /**
     * Sets the value of the datefrom property.
     * 
     * @param value allowed object is {@link Datefrom }
     */
    public void setDatefrom(Datefrom value)
    {
        this.datefrom = value;
    }

    /**
     * Gets the value of the dateto property.
     * 
     * @return possible object is {@link Dateto }
     */
    public Dateto getDateto()
    {
        return dateto;
    }

    /**
     * Sets the value of the dateto property.
     * 
     * @param value allowed object is {@link Dateto }
     */
    public void setDateto(Dateto value)
    {
        this.dateto = value;
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