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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"authentication", "preferences", "content"})
@XmlRootElement(name = "operation")
public class Operation
{

    @XmlAttribute(name = "transaction")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transaction;
    @XmlElement(required = true)
    protected Authentication authentication;
    protected List<Preferences> preferences;
    protected List<Content> content;

    /**
     * Gets the value of the transaction property.
     * 
     * @return possible object is {@link String }
     */
    public String getTransaction()
    {
        if (transaction == null)
        {
            return "false";
        }
        else
        {
            return transaction;
        }
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTransaction(String value)
    {
        this.transaction = value;
    }

    /**
     * Gets the value of the authentication property.
     * 
     * @return possible object is {@link Authentication }
     */
    public Authentication getAuthentication()
    {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value allowed object is {@link Authentication }
     */
    public void setAuthentication(Authentication value)
    {
        this.authentication = value;
    }

    /**
     * Gets the value of the preferences property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the preferences property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getPreferences().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Preferences }
     */
    public List<Preferences> getPreferences()
    {
        if (preferences == null)
        {
            preferences = new ArrayList<Preferences>();
        }
        return this.preferences;
    }

    /**
     * Gets the value of the content property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the content property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getContent().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Content }
     */
    public List<Content> getContent()
    {
        if (content == null)
        {
            content = new ArrayList<Content>();
        }
        return this.content;
    }

}