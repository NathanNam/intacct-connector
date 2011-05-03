/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.intacct.config;

import org.mule.config.spring.handlers.AbstractMuleNamespaceHandler;
import org.mule.config.spring.parsers.generic.OrphanDefinitionParser;
import org.mule.module.intacct.IntacctCloudConnector;
import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.schema.response.Response;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.apache.commons.lang.UnhandledException;

/**
 * This namespace handler for spring for intacct
 */
public class IntacctNamespaceHandler extends AbstractMuleNamespaceHandler
{
    
    public static final JAXBContext REQUEST_JAXB_CTX = loadJaxBCtx(Request.class.getPackage().getName());

    public static final JAXBContext RESPONSE_JAXB_CTX = loadJaxBCtx(Response.class.getPackage().getName());

    /** loads JAXB context */
    private static JAXBContext loadJaxBCtx(final String pkg)
    {
        JAXBContext ctx;
        try
        {
            ctx = JAXBContext.newInstance(pkg);
        }
        catch (final JAXBException e)
        {
            throw new UnhandledException(e);
        }
        return ctx;
    }

    private static final String [] API_FUNCTIONS = {
        "request",
        "function",
        "create-apaccountlabel",
        "create-apadjustment",
        "create-apadjustmentbatch",
        "create-araccountlabel",
        "create-aradjustment",
        "create-aradjustmentbatch",
        "create-arpayment",
        "create-arpaymentbatch",
        "create-bill",
        "create-recurringbill",
        "create-billbatch",
        "create-checkingaccount",
        "create-savingsaccount",
        "update-checkingaccount",
        "update-savingsaccount",
        "delete-checkingaccount",
        "delete-savingsaccount",
        "create-contact",
        "create-customer",
        "create-department",
        "create-employee",
        "create-expensereport",
        "create-expensereportbatch",
        "create-expensetype",
        "create-glaccount",
        "create-statglaccount",
        "create-gltransaction",
        "delete-gltransaction",
        "create-recurringgltransaction",
        "delete-recurringgltransaction",
        "create-statgltransaction",
        "create-recurringstatgltrans",
        "delete-recurringstatgltrans",
        "create-invoice",
        "create-recurringinvoice",
        "create-invoicebatch",
        "create-journal",
        "create-location",
        "create-statjournal",
        "create-project",
        "update-project",
        "delete-project",
        "create-class",
        "delete-class",
        "create-vendor",
        "delete-apaccountlabel",
        "delete-apadjustment",
        "create-locationgroup",
        "delete-araccountlabel",
        "delete-aradjustment",
        "delete-bill",
        "delete-recurringbill",
        "delete-contact",
        "delete-customer",
        "delete-department",
        "delete-employee",
        "delete-expensereport",
        "delete-expensetype",
        "delete-glaccount",
        "delete-statglaccount",
        "delete-invoice",
        "delete-recurringinvoice",
        "delete-journal",
        "delete-statjournal",
        "delete-location",
        "delete-vendor",
        "get",
        "get-accountbalances",
        "get-accountgroupdetails",
        "get-apadjustment",
        "get-aradjustment",
        "get-bill",
        "get-expensereport",
        "get-invoice",
        "get-list",
        "get-trialbalance",
        "get-myclients",
        "init-session",
        "update-apaccountlabel",
        "update-araccountlabel",
        "update-contact",
        "update-customer",
        "update-department",
        "update-invoice",
        "update-bill",
        "update-apadjustment",
        "update-aradjustment",
        "update-employee",
        "update-expensereport",
        "update-expensetype",
        "update-glaccount",
        "update-statglaccount",
        "update-journal",
        "update-location",
        "update-vendor",
        "create-paymentrequest",
        "reclassify-bill",
        "reclassify-invoice",
        "delete-paymentrequest",
        "create-appayment",
        "create-stkittransaction",
        "create-ictransaction",
        "update-ictransaction",
        "create-sotransaction",
        "update-sotransaction",
        "create-recursotransaction",
        "delete-recursotransaction",
        "create-potransaction",
        "update-potransaction",
        "get-salestotals",
        "get-icitemtotals",
        "record-cctransaction",
        "record-wucctransactions",
        "record-wureceipts",
        "record-wudisbursements",
        "record-wuadjjournalentries",
        "record-wujournalentries",
        "get-companyprefs",
        "set-companyprefs",
        "get-applications",
        "record-otherreceipt",
        "record-deposit",
        "create-territory",
        "delete-territory",
        "update-territory",
        "apply-arpayment",
        "delete-sotransaction",
        "delete-potransaction",
        "delete-ictransaction",
        "create-item",
        "update-item",
        "delete-item",
        "create-sopricelist",
        "delete-sopricelist",
        "update-sopricelist",
        "create-popricelist",
        "delete-popricelist",
        "update-popricelist",
        "create-vsoepricelist",
        "update-vsoepricelist",
        "delete-vsoepricelist",
        "create-vsoeitempricelist",
        "update-vsoeitempricelist",
        "delete-vsoeitempricelist",
        "create-invpricelistentry",
        "delete-invpricelistentry",
        "update-invpricelistentry",
        "get-closedbooksdate",
        "get-araging",
        "delete-arpayment",
        "create-customerachinfo",
        "update-customerachinfo",
        "delete-customerachinfo",
        "create-customerchargecard",
        "update-customerchargecard",
        "delete-customerchargecard",
        "create-customerbankaccount",
        "update-customerbankaccount",
        "delete-customerbankaccount",
        "create-taxdetail",
        "update-taxdetail",
        "delete-taxdetail",
        "create-taxschedule",
        "update-taxschedule",
        "delete-taxschedule",
        "create-taxscheduledetail",
        "delete-taxscheduledetail",
        "create-contacttaxgroup",
        "delete-contacttaxgroup",
        "create-itemtaxgroup",
        "delete-itemtaxgroup",
        "create-taxschedulemap",
        "delete-taxschedulemap",
        "describe",
        "reconcile-bank",
        "reverse-bill",
        "reverse-appayment",
        "create-apterm",
        "update-apterm",
        "delete-apterm",
        "create-arterm",
        "update-arterm",
        "delete-arterm",
        "create-timesheet",
        "update-timesheet",
        "delete-timesheet",
        "create-task",
        "update-task",
        "delete-task",
        "create-allocation",
        "update-allocation",
        "delete-allocation",
        "update-cctransaction",
        "reverse-cctransaction",
        "get_list"
        };
    
    public void init()
    {
        registerMuleBeanDefinitionParser("config", 
            new OrphanDefinitionParser(IntacctCloudConnector.class, true));
        
        for (String method : API_FUNCTIONS)
        {
            registerMuleBeanDefinitionParser(method, new DTOChildDefinitionParserNoAttributes(
                "messageProcessor", DTOEvaluationInvokerMessageProcessorFactoryBean.class, "arguments"));
        }

    }
}
