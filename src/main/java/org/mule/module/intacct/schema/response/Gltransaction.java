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
@XmlType(name = "", propOrder = {"journalid", "batchno", "datecreated", "description", "customfields",
    "gltransactionentries"})
@XmlRootElement(name = "gltransaction")
public class Gltransaction
{

    protected String journalid;
    protected String batchno;
    protected Datecreated datecreated;
    protected String description;
    protected Customfields customfields;
    protected Gltransactionentries gltransactionentries;

    /**
     * Gets the value of the journalid property.
     * 
     * @return possible object is {@link String }
     */
    public String getJournalid()
    {
        return journalid;
    }

    /**
     * Sets the value of the journalid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setJournalid(String value)
    {
        this.journalid = value;
    }

    /**
     * Gets the value of the batchno property.
     * 
     * @return possible object is {@link String }
     */
    public String getBatchno()
    {
        return batchno;
    }

    /**
     * Sets the value of the batchno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBatchno(String value)
    {
        this.batchno = value;
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
     * Gets the value of the description property.
     * 
     * @return possible object is {@link String }
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDescription(String value)
    {
        this.description = value;
    }

    /**
     * Gets the value of the customfields property.
     * 
     * @return possible object is {@link Customfields }
     */
    public Customfields getCustomfields()
    {
        return customfields;
    }

    /**
     * Sets the value of the customfields property.
     * 
     * @param value allowed object is {@link Customfields }
     */
    public void setCustomfields(Customfields value)
    {
        this.customfields = value;
    }

    /**
     * Gets the value of the gltransactionentries property.
     * 
     * @return possible object is {@link Gltransactionentries }
     */
    public Gltransactionentries getGltransactionentries()
    {
        return gltransactionentries;
    }

    /**
     * Sets the value of the gltransactionentries property.
     * 
     * @param value allowed object is {@link Gltransactionentries }
     */
    public void setGltransactionentries(Gltransactionentries value)
    {
        this.gltransactionentries = value;
    }

}
