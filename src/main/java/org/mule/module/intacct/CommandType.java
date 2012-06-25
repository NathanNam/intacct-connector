/**
 * Mule Intacct Cloud Connector
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package org.mule.module.intacct;

import org.mule.module.intacct.schema.request.*;

/**
 * {@link CommandType} : enumeration of commands that may be sent to intacct
 * 
 * @author flbulgarelli
 */
public enum CommandType implements EnumType
{
     /**The CreateApaccountlabel command type*/
    CreateApaccountlabel(CreateApaccountlabel.class), 
     /**The CreateApadjustment command type*/
    CreateApadjustment(CreateApadjustment.class), 
     /**The CreateApadjustmentbatch command type*/
    CreateApadjustmentbatch(CreateApadjustmentbatch.class), 
     /**The CreateAraccountlabel command type*/
    CreateAraccountlabel(CreateAraccountlabel.class), 
     /**The CreateAradjustment command type*/
    CreateAradjustment(CreateAradjustment.class), 
     /**The CreateAradjustmentbatch command type*/
    CreateAradjustmentbatch(CreateAradjustmentbatch.class), 
     /**The CreateArpayment command type*/
    CreateArpayment(CreateArpayment.class), 
     /**The CreateArpaymentbatch command type*/
    CreateArpaymentbatch(CreateArpaymentbatch.class), 
     /**The CreateBill command type*/
    CreateBill(CreateBill.class), 
     /**The CreateRecurringbill command type*/
    CreateRecurringbill(CreateRecurringbill.class), 
     /**The CreateBillbatch command type*/
    CreateBillbatch(CreateBillbatch.class), 
     /**The CreateCheckingaccount command type*/
    CreateCheckingaccount(CreateCheckingaccount.class), 
     /**The CreateSavingsaccount command type*/
    CreateSavingsaccount(CreateSavingsaccount.class), 
     /**The UpdateCheckingaccount command type*/
    UpdateCheckingaccount(UpdateCheckingaccount.class), 
     /**The UpdateSavingsaccount command type*/
    UpdateSavingsaccount(UpdateSavingsaccount.class), 
     /**The DeleteCheckingaccount command type*/
    DeleteCheckingaccount(DeleteCheckingaccount.class), 
     /**The DeleteSavingsaccount command type*/
    DeleteSavingsaccount(DeleteSavingsaccount.class), 
     /**The CreateContact command type*/
    CreateContact(CreateContact.class), 
     /**The CreateCustomer command type*/
    CreateCustomer(CreateCustomer.class), 
     /**The CreateDepartment command type*/
    CreateDepartment(CreateDepartment.class), 
     /**The CreateEmployee command type*/
    CreateEmployee(CreateEmployee.class), 
     /**The CreateExpensereport command type*/
    CreateExpensereport(CreateExpensereport.class), 
     /**The CreateExpensereportbatch command type*/
    CreateExpensereportbatch(CreateExpensereportbatch.class), 
     /**The CreateExpensetype command type*/
    CreateExpensetype(CreateExpensetype.class), 
     /**The CreateGlaccount command type*/
    CreateGlaccount(CreateGlaccount.class), 
     /**The CreateStatglaccount command type*/
    CreateStatglaccount(CreateStatglaccount.class), 
     /**The CreateGltransaction command type*/
    CreateGltransaction(CreateGltransaction.class), 
     /**The DeleteGltransaction command type*/
    DeleteGltransaction(DeleteGltransaction.class), 
     /**The CreateRecurringgltransaction command type*/
    CreateRecurringgltransaction(CreateRecurringgltransaction.class), 
     /**The DeleteRecurringgltransaction command type*/
    DeleteRecurringgltransaction(DeleteRecurringgltransaction.class), 
     /**The CreateStatgltransaction command type*/
    CreateStatgltransaction(CreateStatgltransaction.class), 
     /**The CreateRecurringstatgltrans command type*/
    CreateRecurringstatgltrans(CreateRecurringstatgltrans.class), 
     /**The DeleteRecurringstatgltrans command type*/
    DeleteRecurringstatgltrans(DeleteRecurringstatgltrans.class), 
     /**The CreateInvoice command type*/
    CreateInvoice(CreateInvoice.class), 
     /**The CreateRecurringinvoice command type*/
    CreateRecurringinvoice(CreateRecurringinvoice.class), 
     /**The CreateInvoicebatch command type*/
    CreateInvoicebatch(CreateInvoicebatch.class), 
     /**The CreateJournal command type*/
    CreateJournal(CreateJournal.class), 
     /**The CreateLocation command type*/
    CreateLocation(CreateLocation.class), 
     /**The CreateStatjournal command type*/
    CreateStatjournal(CreateStatjournal.class), 
     /**The CreateProject command type*/
    CreateProject(CreateProject.class), 
     /**The UpdateProject command type*/
    UpdateProject(UpdateProject.class), 
     /**The DeleteProject command type*/
    DeleteProject(DeleteProject.class), 
     /**The CreateClass command type*/
    CreateClass(CreateClass.class), 
     /**The DeleteClass command type*/
    DeleteClass(DeleteClass.class), 
     /**The CreateVendor command type*/
    CreateVendor(CreateVendor.class), 
     /**The DeleteApaccountlabel command type*/
    DeleteApaccountlabel(DeleteApaccountlabel.class), 
     /**The DeleteApadjustment command type*/
    DeleteApadjustment(DeleteApadjustment.class), 
     /**The CreateLocationgroup command type*/
    CreateLocationgroup(CreateLocationgroup.class), 
     /**The DeleteAraccountlabel command type*/
    DeleteAraccountlabel(DeleteAraccountlabel.class), 
     /**The DeleteAradjustment command type*/
    DeleteAradjustment(DeleteAradjustment.class), 
     /**The DeleteBill command type*/
    DeleteBill(DeleteBill.class), 
     /**The DeleteRecurringbill command type*/
    DeleteRecurringbill(DeleteRecurringbill.class), 
     /**The DeleteContact command type*/
    DeleteContact(DeleteContact.class), 
     /**The DeleteCustomer command type*/
    DeleteCustomer(DeleteCustomer.class), 
     /**The DeleteDepartment command type*/
    DeleteDepartment(DeleteDepartment.class), 
     /**The DeleteEmployee command type*/
    DeleteEmployee(DeleteEmployee.class), 
     /**The DeleteExpensereport command type*/
    DeleteExpensereport(DeleteExpensereport.class), 
     /**The DeleteExpensetype command type*/
    DeleteExpensetype(DeleteExpensetype.class), 
     /**The DeleteGlaccount command type*/
    DeleteGlaccount(DeleteGlaccount.class), 
     /**The DeleteStatglaccount command type*/
    DeleteStatglaccount(DeleteStatglaccount.class), 
     /**The DeleteInvoice command type*/
    DeleteInvoice(DeleteInvoice.class), 
     /**The DeleteRecurringinvoice command type*/
    DeleteRecurringinvoice(DeleteRecurringinvoice.class), 
     /**The DeleteJournal command type*/
    DeleteJournal(DeleteJournal.class), 
     /**The DeleteStatjournal command type*/
    DeleteStatjournal(DeleteStatjournal.class), 
     /**The DeleteLocation command type*/
    DeleteLocation(DeleteLocation.class), 
     /**The DeleteVendor command type*/
    DeleteVendor(DeleteVendor.class), 
     /**The Get command type*/
    Get(Get.class), 
     /**The GetAccountbalances command type*/
    GetAccountbalances(GetAccountbalances.class), 
     /**The GetAccountgroupdetails command type*/
    GetAccountgroupdetails(GetAccountgroupdetails.class), 
     /**The GetApadjustment command type*/
    GetApadjustment(GetApadjustment.class), 
     /**The GetAradjustment command type*/
    GetAradjustment(GetAradjustment.class), 
     /**The GetBill command type*/
    GetBill(GetBill.class), 
     /**The GetExpensereport command type*/
    GetExpensereport(GetExpensereport.class), 
     /**The GetInvoice command type*/
    GetInvoice(GetInvoice.class), 
     /**The GetList command type*/
    GetList(GetList.class), 
     /**The GetTrialbalance command type*/
    GetTrialbalance(GetTrialbalance.class), 
     /**The GetMyclients command type*/
    GetMyclients(GetMyclients.class), 
     /**The InitSession command type*/
    InitSession(InitSession.class), 
     /**The UpdateApaccountlabel command type*/
    UpdateApaccountlabel(UpdateApaccountlabel.class), 
     /**The UpdateAraccountlabel command type*/
    UpdateAraccountlabel(UpdateAraccountlabel.class), 
     /**The UpdateContact command type*/
    UpdateContact(UpdateContact.class), 
     /**The UpdateCustomer command type*/
    UpdateCustomer(UpdateCustomer.class), 
     /**The UpdateDepartment command type*/
    UpdateDepartment(UpdateDepartment.class), 
     /**The UpdateInvoice command type*/
    UpdateInvoice(UpdateInvoice.class), 
     /**The UpdateBill command type*/
    UpdateBill(UpdateBill.class), 
     /**The UpdateApadjustment command type*/
    UpdateApadjustment(UpdateApadjustment.class), 
     /**The UpdateAradjustment command type*/
    UpdateAradjustment(UpdateAradjustment.class), 
     /**The UpdateEmployee command type*/
    UpdateEmployee(UpdateEmployee.class), 
     /**The UpdateExpensereport command type*/
    UpdateExpensereport(UpdateExpensereport.class), 
     /**The UpdateExpensetype command type*/
    UpdateExpensetype(UpdateExpensetype.class), 
     /**The UpdateGlaccount command type*/
    UpdateGlaccount(UpdateGlaccount.class), 
     /**The UpdateStatglaccount command type*/
    UpdateStatglaccount(UpdateStatglaccount.class), 
     /**The UpdateJournal command type*/
    UpdateJournal(UpdateJournal.class), 
     /**The UpdateLocation command type*/
    UpdateLocation(UpdateLocation.class), 
     /**The UpdateVendor command type*/
    UpdateVendor(UpdateVendor.class), 
     /**The CreatePaymentrequest command type*/
    CreatePaymentrequest(CreatePaymentrequest.class), 
     /**The ReclassifyBill command type*/
    ReclassifyBill(ReclassifyBill.class), 
     /**The ReclassifyInvoice command type*/
    ReclassifyInvoice(ReclassifyInvoice.class), 
     /**The DeletePaymentrequest command type*/
    DeletePaymentrequest(DeletePaymentrequest.class), 
     /**The CreateAppayment command type*/
    CreateAppayment(CreateAppayment.class), 
     /**The CreateStkittransaction command type*/
    CreateStkittransaction(CreateStkittransaction.class), 
     /**The CreateIctransaction command type*/
    CreateIctransaction(CreateIctransaction.class), 
     /**The UpdateIctransaction command type*/
    UpdateIctransaction(UpdateIctransaction.class), 
     /**The CreateSotransaction command type*/
    CreateSotransaction(CreateSotransaction.class), 
     /**The UpdateSotransaction command type*/
    UpdateSotransaction(UpdateSotransaction.class), 
     /**The CreateRecursotransaction command type*/
    CreateRecursotransaction(CreateRecursotransaction.class), 
     /**The DeleteRecursotransaction command type*/
    DeleteRecursotransaction(DeleteRecursotransaction.class), 
     /**The CreatePotransaction command type*/
    CreatePotransaction(CreatePotransaction.class), 
     /**The UpdatePotransaction command type*/
    UpdatePotransaction(UpdatePotransaction.class), 
     /**The GetSalestotals command type*/
    GetSalestotals(GetSalestotals.class), 
     /**The GetIcitemtotals command type*/
    GetIcitemtotals(GetIcitemtotals.class), 
     /**The RecordCctransaction command type*/
    RecordCctransaction(RecordCctransaction.class), 
     /**The RecordWucctransactions command type*/
    RecordWucctransactions(RecordWucctransactions.class), 
     /**The RecordWureceipts command type*/
    RecordWureceipts(RecordWureceipts.class), 
     /**The RecordWudisbursements command type*/
    RecordWudisbursements(RecordWudisbursements.class), 
     /**The RecordWuadjjournalentries command type*/
    RecordWuadjjournalentries(RecordWuadjjournalentries.class), 
     /**The RecordWujournalentries command type*/
    RecordWujournalentries(RecordWujournalentries.class), 
     /**The GetCompanyprefs command type*/
    GetCompanyprefs(GetCompanyprefs.class), 
     /**The SetCompanyprefs command type*/
    SetCompanyprefs(SetCompanyprefs.class), 
     /**The GetApplications command type*/
    GetApplications(GetApplications.class), 
     /**The RecordOtherreceipt command type*/
    RecordOtherreceipt(RecordOtherreceipt.class), 
     /**The RecordDeposit command type*/
    RecordDeposit(RecordDeposit.class), 
     /**The CreateTerritory command type*/
    CreateTerritory(CreateTerritory.class), 
     /**The DeleteTerritory command type*/
    DeleteTerritory(DeleteTerritory.class), 
     /**The UpdateTerritory command type*/
    UpdateTerritory(UpdateTerritory.class), 
     /**The ApplyArpayment command type*/
    ApplyArpayment(ApplyArpayment.class), 
     /**The DeleteSotransaction command type*/
    DeleteSotransaction(DeleteSotransaction.class), 
     /**The DeletePotransaction command type*/
    DeletePotransaction(DeletePotransaction.class), 
     /**The DeleteIctransaction command type*/
    DeleteIctransaction(DeleteIctransaction.class), 
     /**The CreateItem command type*/
    CreateItem(CreateItem.class), 
     /**The UpdateItem command type*/
    UpdateItem(UpdateItem.class), 
     /**The DeleteItem command type*/
    DeleteItem(DeleteItem.class), 
     /**The CreateSopricelist command type*/
    CreateSopricelist(CreateSopricelist.class), 
     /**The DeleteSopricelist command type*/
    DeleteSopricelist(DeleteSopricelist.class), 
     /**The UpdateSopricelist command type*/
    UpdateSopricelist(UpdateSopricelist.class), 
     /**The CreatePopricelist command type*/
    CreatePopricelist(CreatePopricelist.class), 
     /**The DeletePopricelist command type*/
    DeletePopricelist(DeletePopricelist.class), 
     /**The UpdatePopricelist command type*/
    UpdatePopricelist(UpdatePopricelist.class), 
     /**The CreateVsoepricelist command type*/
    CreateVsoepricelist(CreateVsoepricelist.class), 
     /**The UpdateVsoepricelist command type*/
    UpdateVsoepricelist(UpdateVsoepricelist.class), 
     /**The DeleteVsoepricelist command type*/
    DeleteVsoepricelist(DeleteVsoepricelist.class), 
     /**The CreateVsoeitempricelist command type*/
    CreateVsoeitempricelist(CreateVsoeitempricelist.class), 
     /**The UpdateVsoeitempricelist command type*/
    UpdateVsoeitempricelist(UpdateVsoeitempricelist.class), 
     /**The DeleteVsoeitempricelist command type*/
    DeleteVsoeitempricelist(DeleteVsoeitempricelist.class), 
     /**The CreateInvpricelistentry command type*/
    CreateInvpricelistentry(CreateInvpricelistentry.class), 
     /**The DeleteInvpricelistentry command type*/
    DeleteInvpricelistentry(DeleteInvpricelistentry.class), 
     /**The UpdateInvpricelistentry command type*/
    UpdateInvpricelistentry(UpdateInvpricelistentry.class), 
     /**The GetClosedbooksdate command type*/
    GetClosedbooksdate(GetClosedbooksdate.class), 
     /**The GetAraging command type*/
    GetAraging(GetAraging.class), 
     /**The DeleteArpayment command type*/
    DeleteArpayment(DeleteArpayment.class), 
     /**The CreateCustomerachinfo command type*/
    CreateCustomerachinfo(CreateCustomerachinfo.class), 
     /**The UpdateCustomerachinfo command type*/
    UpdateCustomerachinfo(UpdateCustomerachinfo.class), 
     /**The DeleteCustomerachinfo command type*/
    DeleteCustomerachinfo(DeleteCustomerachinfo.class), 
     /**The CreateCustomerchargecard command type*/
    CreateCustomerchargecard(CreateCustomerchargecard.class), 
     /**The UpdateCustomerchargecard command type*/
    UpdateCustomerchargecard(UpdateCustomerchargecard.class), 
     /**The DeleteCustomerchargecard command type*/
    DeleteCustomerchargecard(DeleteCustomerchargecard.class), 
     /**The CreateCustomerbankaccount command type*/
    CreateCustomerbankaccount(CreateCustomerbankaccount.class), 
     /**The UpdateCustomerbankaccount command type*/
    UpdateCustomerbankaccount(UpdateCustomerbankaccount.class), 
     /**The DeleteCustomerbankaccount command type*/
    DeleteCustomerbankaccount(DeleteCustomerbankaccount.class), 
     /**The CreateTaxdetail command type*/
    CreateTaxdetail(CreateTaxdetail.class), 
     /**The UpdateTaxdetail command type*/
    UpdateTaxdetail(UpdateTaxdetail.class), 
     /**The DeleteTaxdetail command type*/
    DeleteTaxdetail(DeleteTaxdetail.class), 
     /**The CreateTaxschedule command type*/
    CreateTaxschedule(CreateTaxschedule.class), 
     /**The UpdateTaxschedule command type*/
    UpdateTaxschedule(UpdateTaxschedule.class), 
     /**The DeleteTaxschedule command type*/
    DeleteTaxschedule(DeleteTaxschedule.class), 
     /**The CreateTaxscheduledetail command type*/
    CreateTaxscheduledetail(CreateTaxscheduledetail.class), 
     /**The DeleteTaxscheduledetail command type*/
    DeleteTaxscheduledetail(DeleteTaxscheduledetail.class), 
     /**The CreateContacttaxgroup command type*/
    CreateContacttaxgroup(CreateContacttaxgroup.class), 
     /**The DeleteContacttaxgroup command type*/
    DeleteContacttaxgroup(DeleteContacttaxgroup.class), 
     /**The CreateItemtaxgroup command type*/
    CreateItemtaxgroup(CreateItemtaxgroup.class), 
     /**The DeleteItemtaxgroup command type*/
    DeleteItemtaxgroup(DeleteItemtaxgroup.class), 
     /**The CreateTaxschedulemap command type*/
    CreateTaxschedulemap(CreateTaxschedulemap.class), 
     /**The DeleteTaxschedulemap command type*/
    DeleteTaxschedulemap(DeleteTaxschedulemap.class), 
     /**The Describe command type*/
    Describe(Describe.class), 
     /**The ReconcileBank command type*/
    ReconcileBank(ReconcileBank.class), 
     /**The ReverseBill command type*/
    ReverseBill(ReverseBill.class), 
     /**The ReverseAppayment command type*/
    ReverseAppayment(ReverseAppayment.class), 
     /**The CreateApterm command type*/
    CreateApterm(CreateApterm.class), 
     /**The UpdateApterm command type*/
    UpdateApterm(UpdateApterm.class), 
     /**The DeleteApterm command type*/
    DeleteApterm(DeleteApterm.class), 
     /**The CreateArterm command type*/
    CreateArterm(CreateArterm.class), 
     /**The UpdateArterm command type*/
    UpdateArterm(UpdateArterm.class), 
     /**The DeleteArterm command type*/
    DeleteArterm(DeleteArterm.class), 
     /**The CreateTimesheet command type*/
    CreateTimesheet(CreateTimesheet.class), 
     /**The UpdateTimesheet command type*/
    UpdateTimesheet(UpdateTimesheet.class), 
     /**The DeleteTimesheet command type*/
    DeleteTimesheet(DeleteTimesheet.class), 
     /**The CreateTask command type*/
    CreateTask(CreateTask.class), 
     /**The UpdateTask command type*/
    UpdateTask(UpdateTask.class), 
     /**The DeleteTask command type*/
    DeleteTask(DeleteTask.class), 
     /**The CreateAllocation command type*/
    CreateAllocation(CreateAllocation.class), 
     /**The UpdateAllocation command type*/
    UpdateAllocation(UpdateAllocation.class), 
     /**The DeleteAllocation command type*/
    DeleteAllocation(DeleteAllocation.class), 
     /**The UpdateCctransaction command type*/
    UpdateCctransaction(UpdateCctransaction.class), 
    /**The ReverseCctransaction command type*/
    ReverseCctransaction(ReverseCctransaction.class);
    
    private Class<?> requestType;

    private CommandType(Class<?> requestType)
    {
        this.requestType = requestType;
    }
    
    @Override
    public Class<?> getRequestType()
    {
        return requestType;
    }

}


