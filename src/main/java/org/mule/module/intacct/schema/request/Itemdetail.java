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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"quantity", "serialnoOrLotno", "aisle", "row", "bin", "itemexpiration"})
@XmlRootElement(name = "itemdetail")
public class Itemdetail
{

    protected String quantity;
    @XmlElements({@XmlElement(name = "serialno", type = Serialno.class),
        @XmlElement(name = "lotno", type = Lotno.class)})
    protected List<Object> serialnoOrLotno;
    protected String aisle;
    protected String row;
    protected String bin;
    protected Itemexpiration itemexpiration;

    /**
     * Gets the value of the quantity property.
     * 
     * @return possible object is {@link String }
     */
    public String getQuantity()
    {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setQuantity(String value)
    {
        this.quantity = value;
    }

    /**
     * Gets the value of the serialnoOrLotno property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the serialnoOrLotno property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSerialnoOrLotno().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Serialno }
     * {@link Lotno }
     */
    public List<Object> getSerialnoOrLotno()
    {
        if (serialnoOrLotno == null)
        {
            serialnoOrLotno = new ArrayList<Object>();
        }
        return this.serialnoOrLotno;
    }

    /**
     * Gets the value of the aisle property.
     * 
     * @return possible object is {@link String }
     */
    public String getAisle()
    {
        return aisle;
    }

    /**
     * Sets the value of the aisle property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAisle(String value)
    {
        this.aisle = value;
    }

    /**
     * Gets the value of the row property.
     * 
     * @return possible object is {@link String }
     */
    public String getRow()
    {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRow(String value)
    {
        this.row = value;
    }

    /**
     * Gets the value of the bin property.
     * 
     * @return possible object is {@link String }
     */
    public String getBin()
    {
        return bin;
    }

    /**
     * Sets the value of the bin property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBin(String value)
    {
        this.bin = value;
    }

    /**
     * Gets the value of the itemexpiration property.
     * 
     * @return possible object is {@link Itemexpiration }
     */
    public Itemexpiration getItemexpiration()
    {
        return itemexpiration;
    }

    /**
     * Sets the value of the itemexpiration property.
     * 
     * @param value allowed object is {@link Itemexpiration }
     */
    public void setItemexpiration(Itemexpiration value)
    {
        this.itemexpiration = value;
    }

}
