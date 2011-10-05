//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2.3-3- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.20 at 12:04:16 PM ART 
//

package org.mule.module.intacct.schema.request;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"logicalOrExpression"})
@XmlRootElement(name = "logical")
public class Logical
{

    @XmlAttribute(name = "logical_operator", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String logicalOperator;
    @XmlAttribute(name = "object")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String object;
    @XmlElements({@XmlElement(name = "logical", type = Logical.class),
        @XmlElement(name = "expression", type = Expression.class)})
    protected List<Object> logicalOrExpression;

    /**
     * Gets the value of the logicalOperator property.
     * 
     * @return possible object is {@link String }
     */
    public String getLogicalOperator()
    {
        return logicalOperator;
    }

    /**
     * Sets the value of the logicalOperator property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setLogicalOperator(String value)
    {
        this.logicalOperator = value;
    }

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
     * Gets the value of the logicalOrExpression property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the logicalOrExpression property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getLogicalOrExpression().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Logical }
     * {@link Expression }
     */
    public List<Object> getLogicalOrExpression()
    {
        if (logicalOrExpression == null)
        {
            logicalOrExpression = new ArrayList<Object>();
        }
        return this.logicalOrExpression;
    }

}
