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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "create_expensereportbatchType", propOrder = {"batchtitle", "datecreated", "createExpensereport"})
@XmlRootElement(name = "create_expensereportbatch")
public class CreateExpensereportbatch
{

    @XmlElement(required = true)
    protected String batchtitle;
    protected Datecreated datecreated;
    @XmlElement(name = "create_expensereport")
    protected List<CreateExpensereport> createExpensereport;

    /**
     * Gets the value of the batchtitle property.
     * 
     * @return possible object is {@link String }
     */
    public String getBatchtitle()
    {
        return batchtitle;
    }

    /**
     * Sets the value of the batchtitle property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBatchtitle(String value)
    {
        this.batchtitle = value;
    }

    /**
     * Gets the value of the datecreated property.
     * 
     * @return possible object is {@link Datecreated }
     */
    public Datecreated getDatecreated()
    {
        return datecreated;
    }

    /**
     * Sets the value of the datecreated property.
     * 
     * @param value allowed object is {@link Datecreated }
     */
    public void setDatecreated(Datecreated value)
    {
        this.datecreated = value;
    }

    /**
     * Gets the value of the createExpensereport property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the createExpensereport property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getCreateExpensereport().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreateExpensereport }
     */
    public List<CreateExpensereport> getCreateExpensereport()
    {
        if (createExpensereport == null)
        {
            createExpensereport = new ArrayList<CreateExpensereport>();
        }
        return this.createExpensereport;
    }

}
