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
@XmlType(name = "getType", propOrder = {"fields"})
@XmlRootElement(name = "get")
public class Get
{

    @XmlAttribute(name = "object", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String object;
    @XmlAttribute(name = "key", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String key;
    @XmlAttribute(name = "externalkey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String externalkey;
    protected Fields fields;

    /**
     * Gets the value of the object property.
     * 
     * @return possible object is {@link String }
     */
    public String getObject()
    {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setObject(String value)
    {
        this.object = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return possible object is {@link String }
     */
    public String getKey()
    {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setKey(String value)
    {
        this.key = value;
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
     * Gets the value of the fields property.
     * 
     * @return possible object is {@link Fields }
     */
    public Fields getFields()
    {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value allowed object is {@link Fields }
     */
    public void setFields(Fields value)
    {
        this.fields = value;
    }

}
