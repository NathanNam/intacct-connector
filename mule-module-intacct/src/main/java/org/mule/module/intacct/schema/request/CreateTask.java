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
@XmlType(name = "", propOrder = {"taskname", "projectid", "pbegindate", "penddate", "itemid", "billable",
    "taskdescription", "ismilestone", "utilized", "priority", "taskno", "taskstatus", "parenttaskname",
    "budgetqty", "estqty", "taskresources", "customfields"})
@XmlRootElement(name = "create_task")
public class CreateTask
{

    @XmlElement(required = true)
    protected String taskname;
    @XmlElement(required = true)
    protected String projectid;
    protected Pbegindate pbegindate;
    protected Penddate penddate;
    protected Itemid itemid;
    protected String billable;
    protected String taskdescription;
    protected String ismilestone;
    protected String utilized;
    protected String priority;
    protected String taskno;
    protected String taskstatus;
    protected String parenttaskname;
    protected String budgetqty;
    protected String estqty;
    protected Taskresources taskresources;
    protected Customfields customfields;

    /**
     * Gets the value of the taskname property.
     * 
     * @return possible object is {@link String }
     */
    public String getTaskname()
    {
        return taskname;
    }

    /**
     * Sets the value of the taskname property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTaskname(String value)
    {
        this.taskname = value;
    }

    /**
     * Gets the value of the projectid property.
     * 
     * @return possible object is {@link String }
     */
    public String getProjectid()
    {
        return projectid;
    }

    /**
     * Sets the value of the projectid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setProjectid(String value)
    {
        this.projectid = value;
    }

    /**
     * Gets the value of the pbegindate property.
     * 
     * @return possible object is {@link Pbegindate }
     */
    public Pbegindate getPbegindate()
    {
        return pbegindate;
    }

    /**
     * Sets the value of the pbegindate property.
     * 
     * @param value allowed object is {@link Pbegindate }
     */
    public void setPbegindate(Pbegindate value)
    {
        this.pbegindate = value;
    }

    /**
     * Gets the value of the penddate property.
     * 
     * @return possible object is {@link Penddate }
     */
    public Penddate getPenddate()
    {
        return penddate;
    }

    /**
     * Sets the value of the penddate property.
     * 
     * @param value allowed object is {@link Penddate }
     */
    public void setPenddate(Penddate value)
    {
        this.penddate = value;
    }

    /**
     * Gets the value of the itemid property.
     * 
     * @return possible object is {@link Itemid }
     */
    public Itemid getItemid()
    {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value allowed object is {@link Itemid }
     */
    public void setItemid(Itemid value)
    {
        this.itemid = value;
    }

    /**
     * Gets the value of the billable property.
     * 
     * @return possible object is {@link String }
     */
    public String getBillable()
    {
        return billable;
    }

    /**
     * Sets the value of the billable property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBillable(String value)
    {
        this.billable = value;
    }

    /**
     * Gets the value of the taskdescription property.
     * 
     * @return possible object is {@link String }
     */
    public String getTaskdescription()
    {
        return taskdescription;
    }

    /**
     * Sets the value of the taskdescription property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTaskdescription(String value)
    {
        this.taskdescription = value;
    }

    /**
     * Gets the value of the ismilestone property.
     * 
     * @return possible object is {@link String }
     */
    public String getIsmilestone()
    {
        return ismilestone;
    }

    /**
     * Sets the value of the ismilestone property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setIsmilestone(String value)
    {
        this.ismilestone = value;
    }

    /**
     * Gets the value of the utilized property.
     * 
     * @return possible object is {@link String }
     */
    public String getUtilized()
    {
        return utilized;
    }

    /**
     * Sets the value of the utilized property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setUtilized(String value)
    {
        this.utilized = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return possible object is {@link String }
     */
    public String getPriority()
    {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPriority(String value)
    {
        this.priority = value;
    }

    /**
     * Gets the value of the taskno property.
     * 
     * @return possible object is {@link String }
     */
    public String getTaskno()
    {
        return taskno;
    }

    /**
     * Sets the value of the taskno property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTaskno(String value)
    {
        this.taskno = value;
    }

    /**
     * Gets the value of the taskstatus property.
     * 
     * @return possible object is {@link String }
     */
    public String getTaskstatus()
    {
        return taskstatus;
    }

    /**
     * Sets the value of the taskstatus property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTaskstatus(String value)
    {
        this.taskstatus = value;
    }

    /**
     * Gets the value of the parenttaskname property.
     * 
     * @return possible object is {@link String }
     */
    public String getParenttaskname()
    {
        return parenttaskname;
    }

    /**
     * Sets the value of the parenttaskname property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setParenttaskname(String value)
    {
        this.parenttaskname = value;
    }

    /**
     * Gets the value of the budgetqty property.
     * 
     * @return possible object is {@link String }
     */
    public String getBudgetqty()
    {
        return budgetqty;
    }

    /**
     * Sets the value of the budgetqty property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setBudgetqty(String value)
    {
        this.budgetqty = value;
    }

    /**
     * Gets the value of the estqty property.
     * 
     * @return possible object is {@link String }
     */
    public String getEstqty()
    {
        return estqty;
    }

    /**
     * Sets the value of the estqty property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setEstqty(String value)
    {
        this.estqty = value;
    }

    /**
     * Gets the value of the taskresources property.
     * 
     * @return possible object is {@link Taskresources }
     */
    public Taskresources getTaskresources()
    {
        return taskresources;
    }

    /**
     * Sets the value of the taskresources property.
     * 
     * @param value allowed object is {@link Taskresources }
     */
    public void setTaskresources(Taskresources value)
    {
        this.taskresources = value;
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

}
