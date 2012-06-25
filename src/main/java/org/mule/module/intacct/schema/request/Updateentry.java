/**
 * Mule Intacct Cloud Connector
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"valueOrDepartmentidOrLocationid"})
@XmlRootElement(name = "updateentry")
public class Updateentry
{

    @XmlAttribute(name = "line_num", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lineNum;
    @XmlElements({@XmlElement(name = "value", required = true, type = Value.class),
        @XmlElement(name = "departmentid", required = true, type = Departmentid.class),
        @XmlElement(name = "locationid", required = true, type = Locationid.class)})
    protected List<Object> valueOrDepartmentidOrLocationid;

    /**
     * Gets the value of the lineNum property.
     * 
     * @return possible object is {@link String }
     */
    public String getLineNum()
    {
        return lineNum;
    }

    /**
     * Sets the value of the lineNum property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setLineNum(String value)
    {
        this.lineNum = value;
    }

    /**
     * Gets the value of the valueOrDepartmentidOrLocationid property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the valueOrDepartmentidOrLocationid property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getValueOrDepartmentidOrLocationid().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Value }
     * {@link Departmentid } {@link Locationid }
     */
    public List<Object> getValueOrDepartmentidOrLocationid()
    {
        if (valueOrDepartmentidOrLocationid == null)
        {
            valueOrDepartmentidOrLocationid = new ArrayList<Object>();
        }
        return this.valueOrDepartmentidOrLocationid;
    }

}
