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
@XmlType(name = "", propOrder = {"accountgroupname", "headingtitle", "totaltitle", "normalbalance",
    "memberstype", "iskpi"})
@XmlRootElement(name = "accountgroup")
public class Accountgroup
{

    protected String accountgroupname;
    protected String headingtitle;
    protected String totaltitle;
    protected String normalbalance;
    protected String memberstype;
    protected String iskpi;

    /**
     * Gets the value of the accountgroupname property.
     * 
     * @return possible object is {@link String }
     */
    public String getAccountgroupname()
    {
        return accountgroupname;
    }

    /**
     * Sets the value of the accountgroupname property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAccountgroupname(String value)
    {
        this.accountgroupname = value;
    }

    /**
     * Gets the value of the headingtitle property.
     * 
     * @return possible object is {@link String }
     */
    public String getHeadingtitle()
    {
        return headingtitle;
    }

    /**
     * Sets the value of the headingtitle property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setHeadingtitle(String value)
    {
        this.headingtitle = value;
    }

    /**
     * Gets the value of the totaltitle property.
     * 
     * @return possible object is {@link String }
     */
    public String getTotaltitle()
    {
        return totaltitle;
    }

    /**
     * Sets the value of the totaltitle property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTotaltitle(String value)
    {
        this.totaltitle = value;
    }

    /**
     * Gets the value of the normalbalance property.
     * 
     * @return possible object is {@link String }
     */
    public String getNormalbalance()
    {
        return normalbalance;
    }

    /**
     * Sets the value of the normalbalance property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setNormalbalance(String value)
    {
        this.normalbalance = value;
    }

    /**
     * Gets the value of the memberstype property.
     * 
     * @return possible object is {@link String }
     */
    public String getMemberstype()
    {
        return memberstype;
    }

    /**
     * Sets the value of the memberstype property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setMemberstype(String value)
    {
        this.memberstype = value;
    }

    /**
     * Gets the value of the iskpi property.
     * 
     * @return possible object is {@link String }
     */
    public String getIskpi()
    {
        return iskpi;
    }

    /**
     * Sets the value of the iskpi property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setIskpi(String value)
    {
        this.iskpi = value;
    }

}
