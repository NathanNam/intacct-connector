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
@XmlType(name = "functionType", propOrder = {"cmd"})
@XmlRootElement(name = "function")
public class Function
{

    @XmlAttribute(name = "controlid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String controlid;
    @XmlElements({
        @XmlElement(name = "create_apaccountlabel", required = true, type = CreateApaccountlabel.class),
        @XmlElement(name = "create_apadjustment", required = true, type = CreateApadjustment.class),
        @XmlElement(name = "create_apadjustmentbatch", required = true, type = CreateApadjustmentbatch.class),
        @XmlElement(name = "create_araccountlabel", required = true, type = CreateAraccountlabel.class),
        @XmlElement(name = "create_aradjustment", required = true, type = CreateAradjustment.class),
        @XmlElement(name = "create_aradjustmentbatch", required = true, type = CreateAradjustmentbatch.class),
        @XmlElement(name = "create_arpayment", required = true, type = CreateArpayment.class),
        @XmlElement(name = "create_arpaymentbatch", required = true, type = CreateArpaymentbatch.class),
        @XmlElement(name = "create_bill", required = true, type = CreateBill.class),
        @XmlElement(name = "create_recurringbill", required = true, type = CreateRecurringbill.class),
        @XmlElement(name = "create_billbatch", required = true, type = CreateBillbatch.class),
        @XmlElement(name = "create_checkingaccount", required = true, type = CreateCheckingaccount.class),
        @XmlElement(name = "create_savingsaccount", required = true, type = CreateSavingsaccount.class),
        @XmlElement(name = "update_checkingaccount", required = true, type = UpdateCheckingaccount.class),
        @XmlElement(name = "update_savingsaccount", required = true, type = UpdateSavingsaccount.class),
        @XmlElement(name = "delete_checkingaccount", required = true, type = DeleteCheckingaccount.class),
        @XmlElement(name = "delete_savingsaccount", required = true, type = DeleteSavingsaccount.class),
        @XmlElement(name = "create_contact", required = true, type = CreateContact.class),
        @XmlElement(name = "create_customer", required = true, type = CreateCustomer.class),
        @XmlElement(name = "create_department", required = true, type = CreateDepartment.class),
        @XmlElement(name = "create_employee", required = true, type = CreateEmployee.class),
        @XmlElement(name = "create_expensereport", required = true, type = CreateExpensereport.class),
        @XmlElement(name = "create_expensereportbatch", required = true, type = CreateExpensereportbatch.class),
        @XmlElement(name = "create_expensetype", required = true, type = CreateExpensetype.class),
        @XmlElement(name = "create_glaccount", required = true, type = CreateGlaccount.class),
        @XmlElement(name = "create_statglaccount", required = true, type = CreateStatglaccount.class),
        @XmlElement(name = "create_gltransaction", required = true, type = CreateGltransaction.class),
        @XmlElement(name = "delete_gltransaction", required = true, type = DeleteGltransaction.class),
        @XmlElement(name = "create_recurringgltransaction", required = true, type = CreateRecurringgltransaction.class),
        @XmlElement(name = "delete_recurringgltransaction", required = true, type = DeleteRecurringgltransaction.class),
        @XmlElement(name = "create_statgltransaction", required = true, type = CreateStatgltransaction.class),
        @XmlElement(name = "create_recurringstatgltrans", required = true, type = CreateRecurringstatgltrans.class),
        @XmlElement(name = "delete_recurringstatgltrans", required = true, type = DeleteRecurringstatgltrans.class),
        @XmlElement(name = "create_invoice", required = true, type = CreateInvoice.class),
        @XmlElement(name = "create_recurringinvoice", required = true, type = CreateRecurringinvoice.class),
        @XmlElement(name = "create_invoicebatch", required = true, type = CreateInvoicebatch.class),
        @XmlElement(name = "create_journal", required = true, type = CreateJournal.class),
        @XmlElement(name = "create_location", required = true, type = CreateLocation.class),
        @XmlElement(name = "create_statjournal", required = true, type = CreateStatjournal.class),
        @XmlElement(name = "create_project", required = true, type = CreateProject.class),
        @XmlElement(name = "update_project", required = true, type = UpdateProject.class),
        @XmlElement(name = "delete_project", required = true, type = DeleteProject.class),
        @XmlElement(name = "create_class", required = true, type = CreateClass.class),
        @XmlElement(name = "delete_class", required = true, type = DeleteClass.class),
        @XmlElement(name = "create_vendor", required = true, type = CreateVendor.class),
        @XmlElement(name = "delete_apaccountlabel", required = true, type = DeleteApaccountlabel.class),
        @XmlElement(name = "delete_apadjustment", required = true, type = DeleteApadjustment.class),
        @XmlElement(name = "create_locationgroup", required = true, type = CreateLocationgroup.class),
        @XmlElement(name = "delete_araccountlabel", required = true, type = DeleteAraccountlabel.class),
        @XmlElement(name = "delete_aradjustment", required = true, type = DeleteAradjustment.class),
        @XmlElement(name = "delete_bill", required = true, type = DeleteBill.class),
        @XmlElement(name = "delete_recurringbill", required = true, type = DeleteRecurringbill.class),
        @XmlElement(name = "delete_contact", required = true, type = DeleteContact.class),
        @XmlElement(name = "delete_customer", required = true, type = DeleteCustomer.class),
        @XmlElement(name = "delete_department", required = true, type = DeleteDepartment.class),
        @XmlElement(name = "delete_employee", required = true, type = DeleteEmployee.class),
        @XmlElement(name = "delete_expensereport", required = true, type = DeleteExpensereport.class),
        @XmlElement(name = "delete_expensetype", required = true, type = DeleteExpensetype.class),
        @XmlElement(name = "delete_glaccount", required = true, type = DeleteGlaccount.class),
        @XmlElement(name = "delete_statglaccount", required = true, type = DeleteStatglaccount.class),
        @XmlElement(name = "delete_invoice", required = true, type = DeleteInvoice.class),
        @XmlElement(name = "delete_recurringinvoice", required = true, type = DeleteRecurringinvoice.class),
        @XmlElement(name = "delete_journal", required = true, type = DeleteJournal.class),
        @XmlElement(name = "delete_statjournal", required = true, type = DeleteStatjournal.class),
        @XmlElement(name = "delete_location", required = true, type = DeleteLocation.class),
        @XmlElement(name = "delete_vendor", required = true, type = DeleteVendor.class),
        @XmlElement(name = "get", required = true, type = Get.class),
        @XmlElement(name = "get_accountbalances", required = true, type = GetAccountbalances.class),
        @XmlElement(name = "get_accountgroupdetails", required = true, type = GetAccountgroupdetails.class),
        @XmlElement(name = "get_apadjustment", required = true, type = GetApadjustment.class),
        @XmlElement(name = "get_aradjustment", required = true, type = GetAradjustment.class),
        @XmlElement(name = "get_bill", required = true, type = GetBill.class),
        @XmlElement(name = "get_expensereport", required = true, type = GetExpensereport.class),
        @XmlElement(name = "get_invoice", required = true, type = GetInvoice.class),
        @XmlElement(name = "get_list", required = true, type = GetList.class),
        @XmlElement(name = "get_trialbalance", required = true, type = GetTrialbalance.class),
        @XmlElement(name = "get_myclients", required = true, type = GetMyclients.class),
        @XmlElement(name = "init_session", required = true, type = InitSession.class),
        @XmlElement(name = "update_apaccountlabel", required = true, type = UpdateApaccountlabel.class),
        @XmlElement(name = "update_araccountlabel", required = true, type = UpdateAraccountlabel.class),
        @XmlElement(name = "update_contact", required = true, type = UpdateContact.class),
        @XmlElement(name = "update_customer", required = true, type = UpdateCustomer.class),
        @XmlElement(name = "update_department", required = true, type = UpdateDepartment.class),
        @XmlElement(name = "update_invoice", required = true, type = UpdateInvoice.class),
        @XmlElement(name = "update_bill", required = true, type = UpdateBill.class),
        @XmlElement(name = "update_apadjustment", required = true, type = UpdateApadjustment.class),
        @XmlElement(name = "update_aradjustment", required = true, type = UpdateAradjustment.class),
        @XmlElement(name = "update_employee", required = true, type = UpdateEmployee.class),
        @XmlElement(name = "update_expensereport", required = true, type = UpdateExpensereport.class),
        @XmlElement(name = "update_expensetype", required = true, type = UpdateExpensetype.class),
        @XmlElement(name = "update_glaccount", required = true, type = UpdateGlaccount.class),
        @XmlElement(name = "update_statglaccount", required = true, type = UpdateStatglaccount.class),
        @XmlElement(name = "update_journal", required = true, type = UpdateJournal.class),
        @XmlElement(name = "update_location", required = true, type = UpdateLocation.class),
        @XmlElement(name = "update_vendor", required = true, type = UpdateVendor.class),
        @XmlElement(name = "create_paymentrequest", required = true, type = CreatePaymentrequest.class),
        @XmlElement(name = "reclassify_bill", required = true, type = ReclassifyBill.class),
        @XmlElement(name = "reclassify_invoice", required = true, type = ReclassifyInvoice.class),
        @XmlElement(name = "delete_paymentrequest", required = true, type = DeletePaymentrequest.class),
        @XmlElement(name = "create_appayment", required = true, type = CreateAppayment.class),
        @XmlElement(name = "create_stkittransaction", required = true, type = CreateStkittransaction.class),
        @XmlElement(name = "create_ictransaction", required = true, type = CreateIctransaction.class),
        @XmlElement(name = "update_ictransaction", required = true, type = UpdateIctransaction.class),
        @XmlElement(name = "create_sotransaction", required = true, type = CreateSotransaction.class),
        @XmlElement(name = "update_sotransaction", required = true, type = UpdateSotransaction.class),
        @XmlElement(name = "create_recursotransaction", required = true, type = CreateRecursotransaction.class),
        @XmlElement(name = "delete_recursotransaction", required = true, type = DeleteRecursotransaction.class),
        @XmlElement(name = "create_potransaction", required = true, type = CreatePotransaction.class),
        @XmlElement(name = "update_potransaction", required = true, type = UpdatePotransaction.class),
        @XmlElement(name = "get_salestotals", required = true, type = GetSalestotals.class),
        @XmlElement(name = "get_icitemtotals", required = true, type = GetIcitemtotals.class),
        @XmlElement(name = "record_cctransaction", required = true, type = RecordCctransaction.class),
        @XmlElement(name = "record_wucctransactions", required = true, type = RecordWucctransactions.class),
        @XmlElement(name = "record_wureceipts", required = true, type = RecordWureceipts.class),
        @XmlElement(name = "record_wudisbursements", required = true, type = RecordWudisbursements.class),
        @XmlElement(name = "record_wuadjjournalentries", required = true, type = RecordWuadjjournalentries.class),
        @XmlElement(name = "record_wujournalentries", required = true, type = RecordWujournalentries.class),
        @XmlElement(name = "get_companyprefs", required = true, type = GetCompanyprefs.class),
        @XmlElement(name = "set_companyprefs", required = true, type = SetCompanyprefs.class),
        @XmlElement(name = "get_applications", required = true, type = GetApplications.class),
        @XmlElement(name = "record_otherreceipt", required = true, type = RecordOtherreceipt.class),
        @XmlElement(name = "record_deposit", required = true, type = RecordDeposit.class),
        @XmlElement(name = "create_territory", required = true, type = CreateTerritory.class),
        @XmlElement(name = "delete_territory", required = true, type = DeleteTerritory.class),
        @XmlElement(name = "update_territory", required = true, type = UpdateTerritory.class),
        @XmlElement(name = "apply_arpayment", required = true, type = ApplyArpayment.class),
        @XmlElement(name = "delete_sotransaction", required = true, type = DeleteSotransaction.class),
        @XmlElement(name = "delete_potransaction", required = true, type = DeletePotransaction.class),
        @XmlElement(name = "delete_ictransaction", required = true, type = DeleteIctransaction.class),
        @XmlElement(name = "create_item", required = true, type = CreateItem.class),
        @XmlElement(name = "update_item", required = true, type = UpdateItem.class),
        @XmlElement(name = "delete_item", required = true, type = DeleteItem.class),
        @XmlElement(name = "create_sopricelist", required = true, type = CreateSopricelist.class),
        @XmlElement(name = "delete_sopricelist", required = true, type = DeleteSopricelist.class),
        @XmlElement(name = "update_sopricelist", required = true, type = UpdateSopricelist.class),
        @XmlElement(name = "create_popricelist", required = true, type = CreatePopricelist.class),
        @XmlElement(name = "delete_popricelist", required = true, type = DeletePopricelist.class),
        @XmlElement(name = "update_popricelist", required = true, type = UpdatePopricelist.class),
        @XmlElement(name = "create_vsoepricelist", required = true, type = CreateVsoepricelist.class),
        @XmlElement(name = "update_vsoepricelist", required = true, type = UpdateVsoepricelist.class),
        @XmlElement(name = "delete_vsoepricelist", required = true, type = DeleteVsoepricelist.class),
        @XmlElement(name = "create_vsoeitempricelist", required = true, type = CreateVsoeitempricelist.class),
        @XmlElement(name = "update_vsoeitempricelist", required = true, type = UpdateVsoeitempricelist.class),
        @XmlElement(name = "delete_vsoeitempricelist", required = true, type = DeleteVsoeitempricelist.class),
        @XmlElement(name = "create_invpricelistentry", required = true, type = CreateInvpricelistentry.class),
        @XmlElement(name = "delete_invpricelistentry", required = true, type = DeleteInvpricelistentry.class),
        @XmlElement(name = "update_invpricelistentry", required = true, type = UpdateInvpricelistentry.class),
        @XmlElement(name = "get_closedbooksdate", required = true, type = GetClosedbooksdate.class),
        @XmlElement(name = "get_araging", required = true, type = GetAraging.class),
        @XmlElement(name = "delete_arpayment", required = true, type = DeleteArpayment.class),
        @XmlElement(name = "create_customerachinfo", required = true, type = CreateCustomerachinfo.class),
        @XmlElement(name = "update_customerachinfo", required = true, type = UpdateCustomerachinfo.class),
        @XmlElement(name = "delete_customerachinfo", required = true, type = DeleteCustomerachinfo.class),
        @XmlElement(name = "create_customerchargecard", required = true, type = CreateCustomerchargecard.class),
        @XmlElement(name = "update_customerchargecard", required = true, type = UpdateCustomerchargecard.class),
        @XmlElement(name = "delete_customerchargecard", required = true, type = DeleteCustomerchargecard.class),
        @XmlElement(name = "create_customerbankaccount", required = true, type = CreateCustomerbankaccount.class),
        @XmlElement(name = "update_customerbankaccount", required = true, type = UpdateCustomerbankaccount.class),
        @XmlElement(name = "delete_customerbankaccount", required = true, type = DeleteCustomerbankaccount.class),
        @XmlElement(name = "create_taxdetail", required = true, type = CreateTaxdetail.class),
        @XmlElement(name = "update_taxdetail", required = true, type = UpdateTaxdetail.class),
        @XmlElement(name = "delete_taxdetail", required = true, type = DeleteTaxdetail.class),
        @XmlElement(name = "create_taxschedule", required = true, type = CreateTaxschedule.class),
        @XmlElement(name = "update_taxschedule", required = true, type = UpdateTaxschedule.class),
        @XmlElement(name = "delete_taxschedule", required = true, type = DeleteTaxschedule.class),
        @XmlElement(name = "create_taxscheduledetail", required = true, type = CreateTaxscheduledetail.class),
        @XmlElement(name = "delete_taxscheduledetail", required = true, type = DeleteTaxscheduledetail.class),
        @XmlElement(name = "create_contacttaxgroup", required = true, type = CreateContacttaxgroup.class),
        @XmlElement(name = "delete_contacttaxgroup", required = true, type = DeleteContacttaxgroup.class),
        @XmlElement(name = "create_itemtaxgroup", required = true, type = CreateItemtaxgroup.class),
        @XmlElement(name = "delete_itemtaxgroup", required = true, type = DeleteItemtaxgroup.class),
        @XmlElement(name = "create_taxschedulemap", required = true, type = CreateTaxschedulemap.class),
        @XmlElement(name = "delete_taxschedulemap", required = true, type = DeleteTaxschedulemap.class),
        @XmlElement(name = "describe", required = true, type = Describe.class),
        @XmlElement(name = "reconcile_bank", required = true, type = ReconcileBank.class),
        @XmlElement(name = "reverse_bill", required = true, type = ReverseBill.class),
        @XmlElement(name = "reverse_appayment", required = true, type = ReverseAppayment.class),
        @XmlElement(name = "create_apterm", required = true, type = CreateApterm.class),
        @XmlElement(name = "update_apterm", required = true, type = UpdateApterm.class),
        @XmlElement(name = "delete_apterm", required = true, type = DeleteApterm.class),
        @XmlElement(name = "create_arterm", required = true, type = CreateArterm.class),
        @XmlElement(name = "update_arterm", required = true, type = UpdateArterm.class),
        @XmlElement(name = "delete_arterm", required = true, type = DeleteArterm.class),
        @XmlElement(name = "create_timesheet", required = true, type = CreateTimesheet.class),
        @XmlElement(name = "update_timesheet", required = true, type = UpdateTimesheet.class),
        @XmlElement(name = "delete_timesheet", required = true, type = DeleteTimesheet.class),
        @XmlElement(name = "create_task", required = true, type = CreateTask.class),
        @XmlElement(name = "update_task", required = true, type = UpdateTask.class),
        @XmlElement(name = "delete_task", required = true, type = DeleteTask.class),
        @XmlElement(name = "create_allocation", required = true, type = CreateAllocation.class),
        @XmlElement(name = "update_allocation", required = true, type = UpdateAllocation.class),
        @XmlElement(name = "delete_allocation", required = true, type = DeleteAllocation.class),
        @XmlElement(name = "update_cctransaction", required = true, type = UpdateCctransaction.class),
        @XmlElement(name = "reverse_cctransaction", required = true, type = ReverseCctransaction.class)})
    protected List<Object> cmd;

    /**
     * Gets the value of the controlid property.
     * 
     * @return possible object is {@link String }
     */
    public String getControlid()
    {
        return controlid;
    }

    /**
     * Sets the value of the controlid property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setControlid(String value)
    {
        this.controlid = value;
    }

    /**
     * Gets the value of the
     * createApaccountlabelOrCreateApadjustmentOrCreateApadjustmentbatchOrCreateAraccountlabelOrCreateAradjustmentOrCreateAradjustmentbatchOrCreateArpaymentOrCreateArpaymentbatchOrCreateBillOrCreateRecurringbillOrCreateBillbatchOrCreateCheckingaccountOrCreateSavingsaccountOrUpdateCheckingaccountOrUpdateSavingsaccountOrDeleteCheckingaccountOrDeleteSavingsaccountOrCreateContactOrCreateCustomerOrCreateDepartmentOrCreateEmployeeOrCreateExpensereportOrCreateExpensereportbatchOrCreateExpensetypeOrCreateGlaccountOrCreateStatglaccountOrCreateGltransactionOrDeleteGltransactionOrCreateRecurringgltransactionOrDeleteRecurringgltransactionOrCreateStatgltransactionOrCreateRecurringstatgltransOrDeleteRecurringstatgltransOrCreateInvoiceOrCreateRecurringinvoiceOrCreateInvoicebatchOrCreateJournalOrCreateLocationOrCreateStatjournalOrCreateProjectOrUpdateProjectOrDeleteProjectOrCreateClassOrDeleteClassOrCreateVendorOrDeleteApaccountlabelOrDeleteApadjustmentOrCreateLocationgroupOrDeleteAraccountlabelOrDeleteAradjustmentOrDeleteBillOrDeleteRecurringbillOrDeleteContactOrDeleteCustomerOrDeleteDepartmentOrDeleteEmployeeOrDeleteExpensereportOrDeleteExpensetypeOrDeleteGlaccountOrDeleteStatglaccountOrDeleteInvoiceOrDeleteRecurringinvoiceOrDeleteJournalOrDeleteStatjournalOrDeleteLocationOrDeleteVendorOrGetOrGetAccountbalancesOrGetAccountgroupdetailsOrGetApadjustmentOrGetAradjustmentOrGetBillOrGetExpensereportOrGetInvoiceOrGetListOrGetTrialbalanceOrGetMyclientsOrInitSessionOrUpdateApaccountlabelOrUpdateAraccountlabelOrUpdateContactOrUpdateCustomerOrUpdateDepartmentOrUpdateInvoiceOrUpdateBillOrUpdateApadjustmentOrUpdateAradjustmentOrUpdateEmployeeOrUpdateExpensereportOrUpdateExpensetypeOrUpdateGlaccountOrUpdateStatglaccountOrUpdateJournalOrUpdateLocationOrUpdateVendorOrCreatePaymentrequestOrReclassifyBillOrReclassifyInvoiceOrDeletePaymentrequestOrCreateAppaymentOrCreateStkittransactionOrCreateIctransactionOrUpdateIctransactionOrCreateSotransactionOrUpdateSotransactionOrCreateRecursotransactionOrDeleteRecursotransactionOrCreatePotransactionOrUpdatePotransactionOrGetSalestotalsOrGetIcitemtotalsOrRecordCctransactionOrRecordWucctransactionsOrRecordWureceiptsOrRecordWudisbursementsOrRecordWuadjjournalentriesOrRecordWujournalentriesOrGetCompanyprefsOrSetCompanyprefsOrGetApplicationsOrRecordOtherreceiptOrRecordDepositOrCreateTerritoryOrDeleteTerritoryOrUpdateTerritoryOrApplyArpaymentOrDeleteSotransactionOrDeletePotransactionOrDeleteIctransactionOrCreateItemOrUpdateItemOrDeleteItemOrCreateSopricelistOrDeleteSopricelistOrUpdateSopricelistOrCreatePopricelistOrDeletePopricelistOrUpdatePopricelistOrCreateVsoepricelistOrUpdateVsoepricelistOrDeleteVsoepricelistOrCreateVsoeitempricelistOrUpdateVsoeitempricelistOrDeleteVsoeitempricelistOrCreateInvpricelistentryOrDeleteInvpricelistentryOrUpdateInvpricelistentryOrGetClosedbooksdateOrGetAragingOrDeleteArpaymentOrCreateCustomerachinfoOrUpdateCustomerachinfoOrDeleteCustomerachinfoOrCreateCustomerchargecardOrUpdateCustomerchargecardOrDeleteCustomerchargecardOrCreateCustomerbankaccountOrUpdateCustomerbankaccountOrDeleteCustomerbankaccountOrCreateTaxdetailOrUpdateTaxdetailOrDeleteTaxdetailOrCreateTaxscheduleOrUpdateTaxscheduleOrDeleteTaxscheduleOrCreateTaxscheduledetailOrDeleteTaxscheduledetailOrCreateContacttaxgroupOrDeleteContacttaxgroupOrCreateItemtaxgroupOrDeleteItemtaxgroupOrCreateTaxschedulemapOrDeleteTaxschedulemapOrDescribeOrReconcileBankOrReverseBillOrReverseAppaymentOrCreateAptermOrUpdateAptermOrDeleteAptermOrCreateArtermOrUpdateArtermOrDeleteArtermOrCreateTimesheetOrUpdateTimesheetOrDeleteTimesheetOrCreateTaskOrUpdateTaskOrDeleteTaskOrCreateAllocationOrUpdateAllocationOrDeleteAllocationOrUpdateCctransactionOrReverseCctransaction
     * property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the
     * createApaccountlabelOrCreateApadjustmentOrCreateApadjustmentbatchOrCreateAraccountlabelOrCreateAradjustmentOrCreateAradjustmentbatchOrCreateArpaymentOrCreateArpaymentbatchOrCreateBillOrCreateRecurringbillOrCreateBillbatchOrCreateCheckingaccountOrCreateSavingsaccountOrUpdateCheckingaccountOrUpdateSavingsaccountOrDeleteCheckingaccountOrDeleteSavingsaccountOrCreateContactOrCreateCustomerOrCreateDepartmentOrCreateEmployeeOrCreateExpensereportOrCreateExpensereportbatchOrCreateExpensetypeOrCreateGlaccountOrCreateStatglaccountOrCreateGltransactionOrDeleteGltransactionOrCreateRecurringgltransactionOrDeleteRecurringgltransactionOrCreateStatgltransactionOrCreateRecurringstatgltransOrDeleteRecurringstatgltransOrCreateInvoiceOrCreateRecurringinvoiceOrCreateInvoicebatchOrCreateJournalOrCreateLocationOrCreateStatjournalOrCreateProjectOrUpdateProjectOrDeleteProjectOrCreateClassOrDeleteClassOrCreateVendorOrDeleteApaccountlabelOrDeleteApadjustmentOrCreateLocationgroupOrDeleteAraccountlabelOrDeleteAradjustmentOrDeleteBillOrDeleteRecurringbillOrDeleteContactOrDeleteCustomerOrDeleteDepartmentOrDeleteEmployeeOrDeleteExpensereportOrDeleteExpensetypeOrDeleteGlaccountOrDeleteStatglaccountOrDeleteInvoiceOrDeleteRecurringinvoiceOrDeleteJournalOrDeleteStatjournalOrDeleteLocationOrDeleteVendorOrGetOrGetAccountbalancesOrGetAccountgroupdetailsOrGetApadjustmentOrGetAradjustmentOrGetBillOrGetExpensereportOrGetInvoiceOrGetListOrGetTrialbalanceOrGetMyclientsOrInitSessionOrUpdateApaccountlabelOrUpdateAraccountlabelOrUpdateContactOrUpdateCustomerOrUpdateDepartmentOrUpdateInvoiceOrUpdateBillOrUpdateApadjustmentOrUpdateAradjustmentOrUpdateEmployeeOrUpdateExpensereportOrUpdateExpensetypeOrUpdateGlaccountOrUpdateStatglaccountOrUpdateJournalOrUpdateLocationOrUpdateVendorOrCreatePaymentrequestOrReclassifyBillOrReclassifyInvoiceOrDeletePaymentrequestOrCreateAppaymentOrCreateStkittransactionOrCreateIctransactionOrUpdateIctransactionOrCreateSotransactionOrUpdateSotransactionOrCreateRecursotransactionOrDeleteRecursotransactionOrCreatePotransactionOrUpdatePotransactionOrGetSalestotalsOrGetIcitemtotalsOrRecordCctransactionOrRecordWucctransactionsOrRecordWureceiptsOrRecordWudisbursementsOrRecordWuadjjournalentriesOrRecordWujournalentriesOrGetCompanyprefsOrSetCompanyprefsOrGetApplicationsOrRecordOtherreceiptOrRecordDepositOrCreateTerritoryOrDeleteTerritoryOrUpdateTerritoryOrApplyArpaymentOrDeleteSotransactionOrDeletePotransactionOrDeleteIctransactionOrCreateItemOrUpdateItemOrDeleteItemOrCreateSopricelistOrDeleteSopricelistOrUpdateSopricelistOrCreatePopricelistOrDeletePopricelistOrUpdatePopricelistOrCreateVsoepricelistOrUpdateVsoepricelistOrDeleteVsoepricelistOrCreateVsoeitempricelistOrUpdateVsoeitempricelistOrDeleteVsoeitempricelistOrCreateInvpricelistentryOrDeleteInvpricelistentryOrUpdateInvpricelistentryOrGetClosedbooksdateOrGetAragingOrDeleteArpaymentOrCreateCustomerachinfoOrUpdateCustomerachinfoOrDeleteCustomerachinfoOrCreateCustomerchargecardOrUpdateCustomerchargecardOrDeleteCustomerchargecardOrCreateCustomerbankaccountOrUpdateCustomerbankaccountOrDeleteCustomerbankaccountOrCreateTaxdetailOrUpdateTaxdetailOrDeleteTaxdetailOrCreateTaxscheduleOrUpdateTaxscheduleOrDeleteTaxscheduleOrCreateTaxscheduledetailOrDeleteTaxscheduledetailOrCreateContacttaxgroupOrDeleteContacttaxgroupOrCreateItemtaxgroupOrDeleteItemtaxgroupOrCreateTaxschedulemapOrDeleteTaxschedulemapOrDescribeOrReconcileBankOrReverseBillOrReverseAppaymentOrCreateAptermOrUpdateAptermOrDeleteAptermOrCreateArtermOrUpdateArtermOrDeleteArtermOrCreateTimesheetOrUpdateTimesheetOrDeleteTimesheetOrCreateTaskOrUpdateTaskOrDeleteTaskOrCreateAllocationOrUpdateAllocationOrDeleteAllocationOrUpdateCctransactionOrReverseCctransaction
     * property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getCreateApaccountlabelOrCreateApadjustmentOrCreateApadjustmentbatchOrCreateAraccountlabelOrCreateAradjustmentOrCreateAradjustmentbatchOrCreateArpaymentOrCreateArpaymentbatchOrCreateBillOrCreateRecurringbillOrCreateBillbatchOrCreateCheckingaccountOrCreateSavingsaccountOrUpdateCheckingaccountOrUpdateSavingsaccountOrDeleteCheckingaccountOrDeleteSavingsaccountOrCreateContactOrCreateCustomerOrCreateDepartmentOrCreateEmployeeOrCreateExpensereportOrCreateExpensereportbatchOrCreateExpensetypeOrCreateGlaccountOrCreateStatglaccountOrCreateGltransactionOrDeleteGltransactionOrCreateRecurringgltransactionOrDeleteRecurringgltransactionOrCreateStatgltransactionOrCreateRecurringstatgltransOrDeleteRecurringstatgltransOrCreateInvoiceOrCreateRecurringinvoiceOrCreateInvoicebatchOrCreateJournalOrCreateLocationOrCreateStatjournalOrCreateProjectOrUpdateProjectOrDeleteProjectOrCreateClassOrDeleteClassOrCreateVendorOrDeleteApaccountlabelOrDeleteApadjustmentOrCreateLocationgroupOrDeleteAraccountlabelOrDeleteAradjustmentOrDeleteBillOrDeleteRecurringbillOrDeleteContactOrDeleteCustomerOrDeleteDepartmentOrDeleteEmployeeOrDeleteExpensereportOrDeleteExpensetypeOrDeleteGlaccountOrDeleteStatglaccountOrDeleteInvoiceOrDeleteRecurringinvoiceOrDeleteJournalOrDeleteStatjournalOrDeleteLocationOrDeleteVendorOrGetOrGetAccountbalancesOrGetAccountgroupdetailsOrGetApadjustmentOrGetAradjustmentOrGetBillOrGetExpensereportOrGetInvoiceOrGetListOrGetTrialbalanceOrGetMyclientsOrInitSessionOrUpdateApaccountlabelOrUpdateAraccountlabelOrUpdateContactOrUpdateCustomerOrUpdateDepartmentOrUpdateInvoiceOrUpdateBillOrUpdateApadjustmentOrUpdateAradjustmentOrUpdateEmployeeOrUpdateExpensereportOrUpdateExpensetypeOrUpdateGlaccountOrUpdateStatglaccountOrUpdateJournalOrUpdateLocationOrUpdateVendorOrCreatePaymentrequestOrReclassifyBillOrReclassifyInvoiceOrDeletePaymentrequestOrCreateAppaymentOrCreateStkittransactionOrCreateIctransactionOrUpdateIctransactionOrCreateSotransactionOrUpdateSotransactionOrCreateRecursotransactionOrDeleteRecursotransactionOrCreatePotransactionOrUpdatePotransactionOrGetSalestotalsOrGetIcitemtotalsOrRecordCctransactionOrRecordWucctransactionsOrRecordWureceiptsOrRecordWudisbursementsOrRecordWuadjjournalentriesOrRecordWujournalentriesOrGetCompanyprefsOrSetCompanyprefsOrGetApplicationsOrRecordOtherreceiptOrRecordDepositOrCreateTerritoryOrDeleteTerritoryOrUpdateTerritoryOrApplyArpaymentOrDeleteSotransactionOrDeletePotransactionOrDeleteIctransactionOrCreateItemOrUpdateItemOrDeleteItemOrCreateSopricelistOrDeleteSopricelistOrUpdateSopricelistOrCreatePopricelistOrDeletePopricelistOrUpdatePopricelistOrCreateVsoepricelistOrUpdateVsoepricelistOrDeleteVsoepricelistOrCreateVsoeitempricelistOrUpdateVsoeitempricelistOrDeleteVsoeitempricelistOrCreateInvpricelistentryOrDeleteInvpricelistentryOrUpdateInvpricelistentryOrGetClosedbooksdateOrGetAragingOrDeleteArpaymentOrCreateCustomerachinfoOrUpdateCustomerachinfoOrDeleteCustomerachinfoOrCreateCustomerchargecardOrUpdateCustomerchargecardOrDeleteCustomerchargecardOrCreateCustomerbankaccountOrUpdateCustomerbankaccountOrDeleteCustomerbankaccountOrCreateTaxdetailOrUpdateTaxdetailOrDeleteTaxdetailOrCreateTaxscheduleOrUpdateTaxscheduleOrDeleteTaxscheduleOrCreateTaxscheduledetailOrDeleteTaxscheduledetailOrCreateContacttaxgroupOrDeleteContacttaxgroupOrCreateItemtaxgroupOrDeleteItemtaxgroupOrCreateTaxschedulemapOrDeleteTaxschedulemapOrDescribeOrReconcileBankOrReverseBillOrReverseAppaymentOrCreateAptermOrUpdateAptermOrDeleteAptermOrCreateArtermOrUpdateArtermOrDeleteArtermOrCreateTimesheetOrUpdateTimesheetOrDeleteTimesheetOrCreateTaskOrUpdateTaskOrDeleteTaskOrCreateAllocationOrUpdateAllocationOrDeleteAllocationOrUpdateCctransactionOrReverseCctransaction().add(
     *     newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreateApaccountlabel } {@link CreateApadjustment }
     * {@link CreateApadjustmentbatch } {@link CreateAraccountlabel }
     * {@link CreateAradjustment } {@link CreateAradjustmentbatch }
     * {@link CreateArpayment } {@link CreateArpaymentbatch } {@link CreateBill }
     * {@link CreateRecurringbill } {@link CreateBillbatch }
     * {@link CreateCheckingaccount } {@link CreateSavingsaccount }
     * {@link UpdateCheckingaccount } {@link UpdateSavingsaccount }
     * {@link DeleteCheckingaccount } {@link DeleteSavingsaccount }
     * {@link CreateContact } {@link CreateCustomer } {@link CreateDepartment }
     * {@link CreateEmployee } {@link CreateExpensereport }
     * {@link CreateExpensereportbatch } {@link CreateExpensetype }
     * {@link CreateGlaccount } {@link CreateStatglaccount }
     * {@link CreateGltransaction } {@link DeleteGltransaction }
     * {@link CreateRecurringgltransaction } {@link DeleteRecurringgltransaction }
     * {@link CreateStatgltransaction } {@link CreateRecurringstatgltrans }
     * {@link DeleteRecurringstatgltrans } {@link CreateInvoice }
     * {@link CreateRecurringinvoice } {@link CreateInvoicebatch }
     * {@link CreateJournal } {@link CreateLocation } {@link CreateStatjournal }
     * {@link CreateProject } {@link UpdateProject } {@link DeleteProject }
     * {@link CreateClass } {@link DeleteClass } {@link CreateVendor }
     * {@link DeleteApaccountlabel } {@link DeleteApadjustment }
     * {@link CreateLocationgroup } {@link DeleteAraccountlabel }
     * {@link DeleteAradjustment } {@link DeleteBill } {@link DeleteRecurringbill }
     * {@link DeleteContact } {@link DeleteCustomer } {@link DeleteDepartment }
     * {@link DeleteEmployee } {@link DeleteExpensereport } {@link DeleteExpensetype }
     * {@link DeleteGlaccount } {@link DeleteStatglaccount } {@link DeleteInvoice }
     * {@link DeleteRecurringinvoice } {@link DeleteJournal } {@link DeleteStatjournal }
     * {@link DeleteLocation } {@link DeleteVendor } {@link Get }
     * {@link GetAccountbalances } {@link GetAccountgroupdetails }
     * {@link GetApadjustment } {@link GetAradjustment } {@link GetBill }
     * {@link GetExpensereport } {@link GetInvoice } {@link GetList }
     * {@link GetTrialbalance } {@link GetMyclients } {@link InitSession }
     * {@link UpdateApaccountlabel } {@link UpdateAraccountlabel }
     * {@link UpdateContact } {@link UpdateCustomer } {@link UpdateDepartment }
     * {@link UpdateInvoice } {@link UpdateBill } {@link UpdateApadjustment }
     * {@link UpdateAradjustment } {@link UpdateEmployee } {@link UpdateExpensereport }
     * {@link UpdateExpensetype } {@link UpdateGlaccount } {@link UpdateStatglaccount }
     * {@link UpdateJournal } {@link UpdateLocation } {@link UpdateVendor }
     * {@link CreatePaymentrequest } {@link ReclassifyBill } {@link ReclassifyInvoice }
     * {@link DeletePaymentrequest } {@link CreateAppayment }
     * {@link CreateStkittransaction } {@link CreateIctransaction }
     * {@link UpdateIctransaction } {@link CreateSotransaction }
     * {@link UpdateSotransaction } {@link CreateRecursotransaction }
     * {@link DeleteRecursotransaction } {@link CreatePotransaction }
     * {@link UpdatePotransaction } {@link GetSalestotals } {@link GetIcitemtotals }
     * {@link RecordCctransaction } {@link RecordWucctransactions }
     * {@link RecordWureceipts } {@link RecordWudisbursements }
     * {@link RecordWuadjjournalentries } {@link RecordWujournalentries }
     * {@link GetCompanyprefs } {@link SetCompanyprefs } {@link GetApplications }
     * {@link RecordOtherreceipt } {@link RecordDeposit } {@link CreateTerritory }
     * {@link DeleteTerritory } {@link UpdateTerritory } {@link ApplyArpayment }
     * {@link DeleteSotransaction } {@link DeletePotransaction }
     * {@link DeleteIctransaction } {@link CreateItem } {@link UpdateItem }
     * {@link DeleteItem } {@link CreateSopricelist } {@link DeleteSopricelist }
     * {@link UpdateSopricelist } {@link CreatePopricelist } {@link DeletePopricelist }
     * {@link UpdatePopricelist } {@link CreateVsoepricelist }
     * {@link UpdateVsoepricelist } {@link DeleteVsoepricelist }
     * {@link CreateVsoeitempricelist } {@link UpdateVsoeitempricelist }
     * {@link DeleteVsoeitempricelist } {@link CreateInvpricelistentry }
     * {@link DeleteInvpricelistentry } {@link UpdateInvpricelistentry }
     * {@link GetClosedbooksdate } {@link GetAraging } {@link DeleteArpayment }
     * {@link CreateCustomerachinfo } {@link UpdateCustomerachinfo }
     * {@link DeleteCustomerachinfo } {@link CreateCustomerchargecard }
     * {@link UpdateCustomerchargecard } {@link DeleteCustomerchargecard }
     * {@link CreateCustomerbankaccount } {@link UpdateCustomerbankaccount }
     * {@link DeleteCustomerbankaccount } {@link CreateTaxdetail }
     * {@link UpdateTaxdetail } {@link DeleteTaxdetail } {@link CreateTaxschedule }
     * {@link UpdateTaxschedule } {@link DeleteTaxschedule }
     * {@link CreateTaxscheduledetail } {@link DeleteTaxscheduledetail }
     * {@link CreateContacttaxgroup } {@link DeleteContacttaxgroup }
     * {@link CreateItemtaxgroup } {@link DeleteItemtaxgroup }
     * {@link CreateTaxschedulemap } {@link DeleteTaxschedulemap } {@link Describe }
     * {@link ReconcileBank } {@link ReverseBill } {@link ReverseAppayment }
     * {@link CreateApterm } {@link UpdateApterm } {@link DeleteApterm }
     * {@link CreateArterm } {@link UpdateArterm } {@link DeleteArterm }
     * {@link CreateTimesheet } {@link UpdateTimesheet } {@link DeleteTimesheet }
     * {@link CreateTask } {@link UpdateTask } {@link DeleteTask }
     * {@link CreateAllocation } {@link UpdateAllocation } {@link DeleteAllocation }
     * {@link UpdateCctransaction } {@link ReverseCctransaction }
     */
    public List<Object> getCmd()
    {
        if (cmd == null)
        {
            cmd = new ArrayList<Object>();
        }
        return this.cmd;
    }
}
