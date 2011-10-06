/**
 * Mule Development Kit
 * Copyright 2010-2011 (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * This file was automatically generated by the Mule Development Kit
 */
package org.mule.module.intacct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBException;

import org.apache.commons.lang.Validate;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.Module;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.param.Optional;
import org.mule.module.intacct.exception.IntacctException;
import org.mule.module.intacct.impl.JerseySslIntacctFacade;
import org.mule.module.intacct.schema.request.Authentication;
import org.mule.module.intacct.schema.request.Content;
import org.mule.module.intacct.schema.request.Control;
import org.mule.module.intacct.schema.request.CreateAradjustment;
import org.mule.module.intacct.schema.request.CreateInvoice;
import org.mule.module.intacct.schema.request.CreateInvoicebatch;
import org.mule.module.intacct.schema.request.CreateSotransaction;
import org.mule.module.intacct.schema.request.Customfield;
import org.mule.module.intacct.schema.request.Field;
import org.mule.module.intacct.schema.request.Filter;
import org.mule.module.intacct.schema.request.Function;
import org.mule.module.intacct.schema.request.Get;
import org.mule.module.intacct.schema.request.GetList;
import org.mule.module.intacct.schema.request.Lineitem;
import org.mule.module.intacct.schema.request.Login;
import org.mule.module.intacct.schema.request.Operation;
import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.schema.request.Sortfield;
import org.mule.module.intacct.schema.request.Sotransitem;
import org.mule.module.intacct.schema.request.Subtotal;
import org.mule.module.intacct.schema.response.Response;
import org.mule.module.intacct.utils.MapBuilder;

import ar.com.zauber.commons.mom.CXFStyle;

/**
 * Cloud Connector Facade for <a href="http://us.intacct.com/">Intacct</a> 
 * @author jcodagnone
 */
@SuppressWarnings("serial")
@Module(name = "intacct",
        namespace = "http://repository.mulesoft.org/releases/org/mule/modules/mule-module-intacct",
        schemaLocation = "http://repository.mulesoft.org/releases/org/mule/modules/mule-module-intacct/1.0-SNAPSHOT/mule-intacct.xsd")
public class IntacctCloudConnector
{
    /**
     * Intacct-registered Web Services username.
     */
    @Configurable
    private String senderId;
    
    /**
     * Registered Web Services password
     */
    @Configurable
    private String controlPassword;
    
    /**
     * Used by the sender to match a request to its response. This is especially 
     * useful during asynchronous requests. The following illustrates the syntax 
     * for a request element.
     */
    @Configurable
    private String controlid;
    
    /**
     * The Intacct system guarantees transaction idempotence through the use of the uniqueid. 
     * The default setting for the uniqueid element is "true" with all lower-case characters.
     * If the uniqueid element value is set to "true", the designated function will be 
     * performed only once. Before a function is executed, the controlid attribute of the 
     * function tag is checked for uniqueness. If a function is submitted twice under the 
     * same controlid and sender, the function will not be re-executed. However, a failed 
     * request may be re-submitted under the same controlid and sender.

     */
    @Configurable
    private String uniqueid;
    
    /**
     * The login information specifies the user's Intacct identity. 
     * This is the same information you see when you log onto the Intacct system.
     */
    @Configurable
    private String userid;
    
    /**
     * The login information specifies the user's Intacct password. 
     * This is the same information you see when you log onto the Intacct system.

     */
    @Configurable
    private String userPassword;
    
    /**
     * The login information specifies the user's Intacct company. 
     * This is the same information you see when you log onto the Intacct system.
     */
    @Configurable
    private String companyid;
    
    /**
     * Intacct Client implementation. By default: {@link JerseySslIntacctFacade}
     */
    @Configurable
    @Optional
    private IntacctFacade intacctImplementation;
    
    private MapObjectMapper mom =  new MapObjectMapper("org.mule.module.intacct.schema");
    

    private static final String URL = "https://www.intacct.com/ia/xml/xmlgw.phtml";

    /**
     * Given the function we create the request with the parameters for default given in the config 
     * @deprecated use {@link #execute(CommandType, List)} instead
     * 
     * {@sample.xml ../../../doc/mule-module-intacct.xml.sample intacct:operation}
     *
     * @param function function
     * @return {@Response}
     * @throws JAXBException
     */
    @Deprecated
    @Processor
    public Response operation(final Map<String, Object> function) throws JAXBException
    {
        Function realFunction = mom.toObject(Function.class, function);

        return operationWithRequest(inicializeRequest(realFunction));
    }
    
    
    /**
     * Batch executes a list of commands of the given CommandType.
     * 
     * Example 1:
     * {@sample.xml ../../../doc/mule-module-intacct.xml.sample intacct:execute1}
     * 
     * Example 2:
     * {@sample.xml ../../../doc/mule-module-intacct.xml.sample intacct:create-invoice}
     *
     * Example 3:
     * {@sample.xml ../../../doc/mule-module-intacct.xml.sample intacct:create-invoice}
     * 
     * @param type the type of commands to execute
     * @param commands the commands list
     * @return the {@link Response}
     */
    @Processor
    public Response execute(final CommandType type, final List<Map<String, Object>> commands) throws JAXBException
    {
        return operation(mom.wrapList("cmd", commands, type.getRequestType()));
    }
    

    /**
     * Creates an {@link org.mule.module.intacct.schema.response.Invoice}
     * 
     * {@sample.xml ../../../doc/mule-module-intacct.xml.sample intacct:create-invoice}
     *
     * @param functionControlId String. Is used by the sender to match a request to 
     *                          its response for the function that will be created 
     *                          for this operation. This is especially useful during 
     *                          asynchronous requests.
     * @param customerId the customerId
     * @param dateCreated the dateCreated
     * @param datePosted the datePosted
     * @param dateDue the dateDue
     * @param termName the termName
     * @param batchKey the batchKey
     * @param invoiceNo the invoiceNo
     * @param poNumber the poNumber
     * @param description the description
     * @param externalId the externalId
     * @param billToContactType the billToContactType
     * @param billTo the billTo
     * @param shipToContactType the shipToContactType
     * @param shipTo the shipTo
     * @param baseCurr the baseCurr
     * @param currency the currency
     * @param exchType the exchType
     * @param exchRateDateOrExchRateTypeOrExchRate the exchRateDateOrExchRateTypeOrExchRate
     * @param nogl the nogl
     * @param customFields the customFields
     * @param invoiceItems the invoiceItems
     * @return {@link Response}
     * @throws JAXBException
     */
    @Processor
    public Response createInvoice(String functionControlId,
                                  String customerId,
                                  Map<String, Object> dateCreated,
                                  @Optional Map<String, Object> datePosted,
                                  @Optional Map<String, Object> dateDue,
                                  @Optional String termName,
                                  @Optional String batchKey,
                                  @Optional String invoiceNo,
                                  @Optional String poNumber,
                                  @Optional String description,
                                  @Optional String externalId,
                                  @Optional ContactType billToContactType,
                                  @Optional List<Map<String, Object>> billTo,
                                  @Optional ContactType shipToContactType,
                                  @Optional List<Map<String, Object>> shipTo,
                                  @Optional String baseCurr,
                                  @Optional String currency,
                                  @Optional ExchType exchType,
                                  @Optional List<Map<String, Object>> exchRateDateOrExchRateTypeOrExchRate,
                                  @Optional String nogl,
                                  @Optional List<Map<String, Object>> customFields,
                                  List<Map<String, Object>> invoiceItems) throws JAXBException
    {   
        Validate.notEmpty(dateCreated);
        Object invoiceItemsAux = nullifyEmptyListWrapper("lineitem", invoiceItems, Lineitem.class);
        Validate.notNull(invoiceItemsAux);
        
        List<Object> exchRateDateOrExchRateTypeOrExchRateAux = new ArrayList<Object>();
        if (exchRateDateOrExchRateTypeOrExchRate != null && exchType != null)
        {
            for (Map<String, Object> exch : exchRateDateOrExchRateTypeOrExchRate)
            {
                exchRateDateOrExchRateTypeOrExchRateAux.add(mom.toObject(exchType.getRequestType(), exch));
            }
        }
        
        CreateInvoice createInvoice = mom.toObject(CreateInvoice.class, 
            new MapBuilder().with("customerid", fromSingleValue(customerId))
                            .with("datecreated", dateCreated)
                            .with("dateposted", datePosted)
                            .with("datedue", dateDue)
                            .with("termname", fromSingleValue(termName))
                            .with("batchkey", fromSingleValue(batchKey))
                            .with("invoiceno", invoiceNo)
                            .with("ponumber", poNumber)
                            .with("description", description)
                            .with("externalid", externalId)
                            .with("shipto", nullifyEmptyListWrapper("contactOrContactname", shipTo, nullifyEnumType(shipToContactType)))
                            .with("billto", nullifyEmptyListWrapper("contactOrContactname", billTo, nullifyEnumType(billToContactType)))
                            .with("basecurr", baseCurr)
                            .with("currency", currency)
                            .with("exchratedateOrExchratetypeOrExchrate", coalesceList(exchRateDateOrExchRateTypeOrExchRateAux))
                            .with("nogl", nogl)
                            .with("customfields", nullifyEmptyListWrapper("customfield", customFields, Customfield.class))
                            .with("invoiceitems", invoiceItemsAux)
                            .build());

        Function function = new Function();
        function.getCmd().add(createInvoice);
        function.setControlid(functionControlId);
        
        return operationWithRequest(inicializeRequest(function));
    }
    
    /**
     * Creates an {@link org.mule.module.intacct.schema.response.Invoicebatch}
     * 
     * {@sample.xml ../../../doc/mule-module-intacct.xml.sample intacct:create-invoicebatch}
     *
     * @param functionControlId String. Is used by the sender to match a request to 
     *                          its response for the function that will be created 
     *                          for this operation. This is especially useful during 
     *                          asynchronous requests.
     * @param batchTitle the batchTitle
     * @param dateCreated the dateCreated
     * @param createInvoiceList the createInvoiceList
     * @return {@link Response}
     * @throws JAXBException
     */
    @Processor
    public Response createInvoicebatch(String functionControlId,
                                       String batchTitle,
                                       @Optional Map<String, Object> dateCreated,
                                       @Optional List<Map<String, Object>> createInvoiceList
                                       ) throws JAXBException
    {
        List<CreateInvoice> createInvoiceListAux = new ArrayList<CreateInvoice>();
        if (createInvoiceList != null)
        {
            for (Map<String, Object> invoice : createInvoiceList)
            {
                createInvoiceListAux.add(mom.toObject(CreateInvoice.class, invoice));
            }
        }
        
        CreateInvoicebatch createInvoiceBatch = mom.toObject(CreateInvoicebatch.class, 
            new MapBuilder()
                            .with("batchtitle", batchTitle)
                            .with("datecreated", dateCreated)
                            .with("createInvoice", coalesceList(createInvoiceList))
                            .build()
            );

        Function function = new Function();
        function.getCmd().add(createInvoiceBatch);
        function.setControlid(functionControlId);
        
        return operationWithRequest(inicializeRequest(function));
    }
    
    /**
     * Creates an {@link org.mule.module.intacct.schema.response.Aradjustment}
     * 
     * {@sample.xml ../../../doc/mule-module-intacct.xml.sample intacct:create-aradjustment}
     *
     * @param functionControlId String. Is used by the sender to match a request to 
     *                          its response for the function that will be created 
     *                          for this operation. This is especially useful during 
     *                          asynchronous requests.
     * @param customerId the customerId
     * @param dateCreated the dateCreated
     * @param datePosted the datePosted
     * @param batchKey the batchKey
     * @param adjustmentNo the adjustmentNo
     * @param invoiceNo the invoiceNo
     * @param description the description
     * @param externalId the externalId
     * @param basecurr the basecurr
     * @param currency the currency
     * @param exchType the exchType
     * @param exchRateDateOrExchRateTypeOrExchRate the exchRateDateOrExchRateTypeOrExchRate
     * @param nogl the nogl
     * @param arAdjustmentItems the arAdjustmentItems
     * @return {@link Response}
     * @throws JAXBException
     */
    @Processor
    public Response createAradjustment(String functionControlId,
                                       String customerId,
                                       Map<String, Object> dateCreated,
                                       @Optional Map<String, Object> datePosted,
                                       @Optional String batchKey,
                                       @Optional String adjustmentNo,
                                       @Optional String invoiceNo,
                                       @Optional String description,
                                       @Optional String externalId,
                                       @Optional String basecurr,
                                       @Optional String currency,
                                       @Optional ExchType exchType,
                                       @Optional List<Map<String, Object>> exchRateDateOrExchRateTypeOrExchRate,
                                       @Optional String nogl,
                                       List<Map<String, Object>> arAdjustmentItems
                                       ) throws JAXBException
    {
        Validate.notEmpty(dateCreated);
        Object arAdjustmentItemsAux = nullifyEmptyListWrapper("lineitem", arAdjustmentItems, Lineitem.class);
        Validate.notNull(arAdjustmentItemsAux);
        
        List<Object> exchRateDateOrExchRateTypeOrExchRateAux = new ArrayList<Object>();
        if (exchRateDateOrExchRateTypeOrExchRate != null && exchType != null)
        {
            for (Map<String, Object> exch : exchRateDateOrExchRateTypeOrExchRate)
            {
                exchRateDateOrExchRateTypeOrExchRateAux.add(mom.toObject(exchType.getRequestType(), exch));
            }
        }
        CreateAradjustment createArAdjustment = mom.toObject(CreateAradjustment.class, 
            new MapBuilder().with("customerid", fromSingleValue(customerId))
                            .with("datecreated", dateCreated)
                            .with("dateposted", datePosted)
                            .with("batchkey", fromSingleValue(batchKey))
                            .with("invoiceno", invoiceNo)
                            .with("description", description)
                            .with("externalid", externalId)
                            .with("currency", currency)
                            .with("exchratedateOrExchratetypeOrExchrate", coalesceList(exchRateDateOrExchRateTypeOrExchRateAux))
                            .with("nogl", nogl)
                            .with("aradjustmentitems", arAdjustmentItemsAux)
                            .build()
            );

        Function function = new Function();
        function.getCmd().add(createArAdjustment);
        function.setControlid(functionControlId);
        
        return operationWithRequest(inicializeRequest(function));
    }
    
    /**
     * Creates an {@link org.mule.module.intacct.schema.response.Sotransaction}
     * 
     * {@sample.xml ../../../doc/mule-module-intacct.xml.sample intacct:create-sotransaction}
     *
     * @param functionControlId String. Is used by the sender to match a request to 
     *                          its response for the function that will be created 
     *                          for this operation. This is especially useful during 
     *                          asynchronous requests.
     * @param transactionType the transactionType
     * @param dateCreated the dateCreated
     * @param createdFrom the createdFrom
     * @param customerId the customerId
     * @param documentNo the documentNo
     * @param referenceNo the referenceNo
     * @param termName the termName
     * @param dateDue the dateDue
     * @param message the message
     * @param shippingMethod the shippingMethod
     * @param billToContactType the billToContactType
     * @param billTo the billTo
     * @param shipToContactType the shipToContactType
     * @param shipTo the shipTo
     * @param externalId the externalId
     * @param baseCurr the baseCurr
     * @param currency the currency
     * @param exchType the exchType
     * @param exchRateDateOrExchRateTypeOrExchRate the exchRateDateOrExchRateTypeOrExchRate
     * @param vsoePriceList the vsoePriceList
     * @param customFields the customFields
     * @param soTransItems the soTransItems
     * @param subTotals the subTotals
     * @return {@link Response}
     * @throws JAXBException
     */
    @Processor
    public Response createSotransaction(String functionControlId,
                                        String transactionType,
                                        Map<String, Object> dateCreated, 
                                        @Optional String createdFrom,
                                        String customerId, 
                                        @Optional String documentNo,
                                        @Optional String referenceNo,
                                        @Optional String termName,
                                        @Optional Map<String, Object> dateDue,
                                        @Optional String message,
                                        @Optional String shippingMethod,
                                        @Optional ContactType billToContactType,
                                        @Optional List<Map<String, Object>> billTo,
                                        @Optional ContactType shipToContactType,
                                        @Optional List<Map<String, Object>> shipTo,
                                        @Optional String externalId,
                                        @Optional String baseCurr,
                                        @Optional String currency,
                                        @Optional ExchType exchType,
                                        @Optional List<Map<String, Object>> exchRateDateOrExchRateTypeOrExchRate,
                                        @Optional String vsoePriceList,
                                        @Optional List<Map<String, Object>> customFields,
                                        List<Map<String, Object>> soTransItems,
                                        @Optional List<Map<String, Object>> subTotals
                                        ) throws JAXBException
    {
        Validate.notEmpty(dateCreated);
        Object soTransItemsAux = nullifyEmptyListWrapper("sotransitem", soTransItems, Sotransitem.class);
        Validate.notNull(soTransItemsAux);
        
        List<Object> exchRateDateOrExchRateTypeOrExchRateAux = new ArrayList<Object>();
        if (exchRateDateOrExchRateTypeOrExchRate != null && exchType != null)
        {
            for (Map<String, Object> exch : exchRateDateOrExchRateTypeOrExchRate)
            {
                exchRateDateOrExchRateTypeOrExchRateAux.add(mom.toObject(exchType.getRequestType(), exch));
            }
        }
        
        CreateSotransaction createSotransaction = mom.toObject(CreateSotransaction.class, 
            new MapBuilder().with("transactiontype", transactionType)
                            .with("datecreated", dateCreated)
                            .with("createdfrom", createdFrom)
                            .with("customerid", fromSingleValue(customerId))
                            .with("documentno", documentNo)
                            .with("referenceno", referenceNo)
                            .with("termname", fromSingleValue(termName))
                            .with("datedue", dateDue)
                            .with("message", message)
                            .with("shippingmethod", shippingMethod)
                            .with("shipto", nullifyEmptyListWrapper("contactOrContactname", shipTo, nullifyEnumType(shipToContactType)))
                            .with("billto", nullifyEmptyListWrapper("contactOrContactname", billTo, nullifyEnumType(billToContactType)))
                            .with("externalid", externalId)
                            .with("basecurr", baseCurr)
                            .with("currency", currency)
                            .with("exchratedateOrExchratetypeOrExchrate", coalesceList(exchRateDateOrExchRateTypeOrExchRateAux))
                            .with("vsoepricelist", vsoePriceList)
                            .with("customfields", nullifyEmptyListWrapper("customfield", customFields, Customfield.class))
                            .with("sotransitems", soTransItemsAux)
                            .with("subtotals", nullifyEmptyListWrapper("subtotal", subTotals, Subtotal.class))
                            .build()
            );

        Function function = new Function();
        function.getCmd().add(createSotransaction);
        function.setControlid(functionControlId);
        
        return operationWithRequest(inicializeRequest(function));
    }
    
    protected Map<String, Object> fromSingleValue(final Object value)
    {
        return value == null ? null : Collections.singletonMap("value", value);
    }
    
    /**
     * Allows you to retrieve a list object with optional filter and/or sort specifications.
     * Filters can be simple or complex with logical groupings for AND and OR filtering.
     * 
     * {@sample.xml ../../../doc/mule-module-intacct.xml.sample intacct:get-list}
     *
     * @param functionControlId String. Is used by the sender to match a request to 
     *                          its response for the function that will be created 
     *                          for this operation. This is especially useful during 
     *                          asynchronous requests.
     * @param obj String. The object on which to perform the query. <p>
     *            A list of valid objects is provided:<p>
     *            accountgroup, adjjournal, apaccountlabel, apadjustment, apadjustmentbatch,
     *            appayment, appaymentrequest, apterm, araccountlabel, aradjustment,
     *            aradjustmentbatch, arpayment, arpaymentbatch, arterm, artransactiondef,
     *            bankaccount, bill, billbatch, class, company_info, contact, contacttaxgroup,
     *            csnhistory, custglgroup, customer, customerachinfo, customerbankaccount,
     *            customerchargecard, customerppackage, department, employee, expensereport,
     *            expensereportbatch, expensetypes, glaccount, glbudget, glbudgetitem,
     *            glentry, gltransaction, icitem, ictotal, ictransaction, ictransactiondef,
     *            invoice, invoicebatch, itemglgroup, itemtaxgroup, journal, location,
     *            locationentity, locationgroup, popricelist, potransaction, potransactiondef,
     *            pricelistitem, productline, project, renewalmacro, reportingperiod,
     *            revrecschedule, revrecscheduleentry, revrectemplate, smarteventlog,
     *            sopricelist, sotransaction, sotransactiondef, statglaccount, statjournal,
     *            stkittransaction, subscription, taxdetail, taxschedule, taxscheduledetail,
     *            taxschedulemap, territory, trxcurrencies, uom, vendglgroup, vendor,
     *            vsoeitempricelist, vsoepricelist, warehouse.
     * @param start Optionl. During a list query you can specify the start record of the 
     *              list of objects to return to increase performance. This attribute defaults 
     *              to zero.
     * @param maxItems Optional. During a list query, you can specify the maximum number of 
     *                 objects to return to increase performance. By combining this with the 
     *                 Start attribute above you can loop through the objects in groups for 
     *                 better performance.
     * @param showPrivate Optional. In Multi-entity Shared implementations, some objects may
     *                    be owned by a subsidiary entity, but are visible at the root. If 
     *                    showprivate is set to "true", the getlist method will return all 
     *                    records visible in the current multi-entity context. If showprivate 
     *                    is left unset or is "false", getlist will only return those records 
     *                    owned by the current multi-entity context.
     * @param filter Optional. A collection of filtering expressions to apply to the query.
     * @param sorts Optional. A collection of fields to sort by.
     * @param fields Optional. A collection of fields to retrieve in the query. The fields 
     *               will be returned in the order requested. If the request does not include 
     *               a fields element, the web service will return the default set of fields.
     * @return {@link Response}
     * @throws JAXBException
     */
    @Processor
    public Response getList(String functionControlId,
                            String obj,
                            @Optional String start,
                            @Optional String maxItems, 
                            @Optional String showPrivate,
                            @Optional List<Object> filter,
                            @Optional List<Map<String, Object>> sorts,
                            @Optional List<Map<String, Object>> fields
                            ) throws JAXBException
    {
        Filter filterAux = null;
        if (coalesceList(filter) != null)
        {
            filterAux = new Filter();
            filterAux.getLogicalOrExpression().addAll(filter);
        }
        
        GetList getList = mom.toObject(GetList.class, 
            new MapBuilder().with("object", obj)
                            .with("start", start)
                            .with("maxitems", maxItems)
                            .with("showprivate", showPrivate)
                            .with("filter", filterAux)
                            .with("sorts", nullifyEmptyListWrapper("sortfield", sorts, Sortfield.class))
                            .with("fields", nullifyEmptyListWrapper("field", fields, Field.class))
                            .build()
            );

        Function function = new Function();
        function.getCmd().add(getList);
        function.setControlid(functionControlId);
        
        return operationWithRequest(inicializeRequest(function));
    }
    
    /**
     * Allows you to retrieve all of the information about a single instance of an 
     * Intacct object.
     * <p>
     * Additional options for manipulating the return fields allow you to retrieve 
     * only the information that you need.
     * 
     * {@sample.xml ../../../doc/mule-module-intacct.xml.sample intacct:get}
     *
     * @param functionControlId String. Is used by the sender to match a request to 
     *                          its response for the function that will be created 
     *                          for this operation. This is especially useful during 
     *                          asynchronous requests.
     * @param obj String. The object on which to perform the query. <p>
     *            A list of valid objects is provided:<p>
     *            accountgroup, apaccountlabel, appaymentrequest, apterm, araccountlabel,
     *            arterm, bankaccount, bill, class, company_info, contact, csnhistory,
     *            customer, customerachinfo, customerbankaccount, customerchargecard,
     *            department, employee, expensetypes, glaccount, icitem, ictransaction,
     *            invoice, journal, location, locationentity, locationgroup, popricelist,
     *            potransaction, pricelistitem, productline, project, recurbill, 
     *            recurinvoice, renewalmacro, reportingperiod, revrecschedule, 
     *            revrecscheduleentry, sopricelist, sotransaction, statglaccount,
     *            stkittransaction, subscription, taxdetail, taxschedule, taxscheduledetail,
     *            taxschedulemap, territory, trxcurrencies, vendor, vsoepricelist, warehouse.
     * @param key The unique ID or key of the object instance to be retrieved.
     * @param externalKey Optional. Every object in the Intacct system is allowed to have an 
     *                    External ID, which allows users to assign a unique ID outside of 
     *                    the Intacct system. For example, if a partner application has its 
     *                    own numbering scheme for bills, during bill creation each individual 
     *                    bill can be assigned an External ID which would identify it in the 
     *                    partner system. Later on, while using the Get and Delete functions 
     *                    of the Intacct Gateway, the partner can then specify the External ID 
     *                    rather than the Intacct ID. This way, the partner is not required to 
     *                    store the Intacct ID of each object created in the Intacct system.
     * @param fields Optional. A collection of Maps that represents fields to retrieve in the 
     *               query. If the request does not include a fields element, the gateway will 
     *               return the default set of fields, including custom fields for any 
     *               objects that have them.
     * @return {@link Response}
     *
     * @throws JAXBException
     */
    @Processor
    public Response get(String functionControlId,
                        String obj,
                        String key, 
                        @Optional String externalKey,
                        @Optional List<Map<String, Object>> fields
                        ) throws JAXBException
    {
        Get get = mom.toObject(Get.class, 
            new MapBuilder().with("object", obj)
                            .with("key", key)
                            .with("externalkey", externalKey)
                            .with("fields", nullifyEmptyListWrapper("field", fields, Field.class))
                            .build()
            );

        Function function = new Function();
        function.getCmd().add(get);
        function.setControlid(functionControlId);
        
        return operationWithRequest(inicializeRequest(function));
    }
    
    public Response sendRequest(final Request request) throws JAXBException
    {
        try
        {
            return intacctImplementation.executeOperation(request);
        }
        // Here we catch everything and we wrap it in our domain exception
        catch (Throwable ex)
        {
            throw new IntacctException("There was an error sending the request to the server."
                                       + " Please check the cause for further information", ex);
        }

    }

    /**
     * Reconoce la operacion con valores default setteados en el config
     * 
     * {@sample.xml ../../../doc/mule-module-intacct.xml.sample intacct:operation-with-request}
     *
     * @param request request
     * @return {@link Response}
     * @throws JAXBException
     */
    @Processor
    public Response operationWithRequest(final Request request) throws JAXBException
    {
        return sendRequest(request);
    }
    
    @PostConstruct
    public void init()
    {
        if (intacctImplementation == null )
        {
            intacctImplementation = new JerseySslIntacctFacade(URL);
        }
        mom.setPropertyStyle(CXFStyle.STYLE);
    }
    
    private Request inicializeRequest(Function function)
    {
        final Request request = new Request();
        final Control control = new Control();
        control.setSenderid(senderId);
        control.setPassword(controlPassword);
        control.setControlid(controlid);
        control.setUniqueid(uniqueid);
        control.setDtdversion("2.1");
        request.setControl(control);
        final Operation operation = new Operation();
        request.getOperation().add(operation);
        final Authentication authentication = new Authentication();
        final Login login = new Login();
        login.setUserid(userid);
        login.setPassword(userPassword);
        login.setCompanyid(companyid);
        authentication.getLoginOrSessionid().add(login);
        operation.setAuthentication(authentication);
        final Content content = new Content();
        content.getFunction().add(function);
        operation.getContent().add(content);
        
        return request;
    }
    
    /**
     * Returns the senderId.
     * 
     * @return  with the senderId.
     */
    public String getSenderId()
    {
        return senderId;
    }

    /**
     * Sets the senderId. 
     *
     * @param senderId  with the senderId.
     */
    
    public void setSenderId(String senderId)
    {
        this.senderId = senderId;
    }

    /**
     * Returns the controlPassword.
     * 
     * @return  with the controlPassword.
     */
    public String getControlPassword()
    {
        return controlPassword;
    }

    /**
     * Sets the controlPassword. 
     *
     * @param controlPassword  with the controlPassword.
     */
    
    public void setControlPassword(String controlPassword)
    {
        this.controlPassword = controlPassword;
    }

    /**
     * Returns the controlid.
     * 
     * @return  with the controlid.
     */
    
    public String getControlid()
    {
        return controlid;
    }

    /**
     * Sets the controlid. 
     *
     * @param controlid  with the controlid.
     */
    
    public void setControlid(String controlid)
    {
        this.controlid = controlid;
    }

    /**
     * Returns the uniqueid.
     * 
     * @return  with the uniqueid.
     */
    
    public String getUniqueid()
    {
        return uniqueid;
    }

    /**
     * Sets the uniqueid. 
     *
     * @param uniqueid  with the uniqueid.
     */
    
    public void setUniqueid(String uniqueid)
    {
        this.uniqueid = uniqueid;
    }

    /**
     * Returns the userid.
     * 
     * @return  with the userid.
     */
    
    public String getUserid()
    {
        return userid;
    }

    /**
     * Sets the userid. 
     *
     * @param userid  with the userid.
     */
    
    public void setUserid(String userid)
    {
        this.userid = userid;
    }

    /**
     * Returns the userPassword.
     * 
     * @return  with the userPassword.
     */
    
    public String getUserPassword()
    {
        return userPassword;
    }

    /**
     * Sets the userPassword. 
     *
     * @param userPassword  with the userPassword.
     */
    
    public void setUserPassword(String userPassword)
    {
        this.userPassword = userPassword;
    }

    /**
     * Returns the companyid.
     * 
     * @return  with the companyid.
     */
    
    public String getCompanyid()
    {
        return companyid;
    }

    /**
     * Sets the companyid. 
     *
     * @param companyid  with the companyid.
     */
    
    public void setCompanyid(String companyid)
    {
        this.companyid = companyid;
    }

    /**
     * Returns the intacctImplementation.
     * 
     * @return  with the intacctImplementation.
     */
    
    public IntacctFacade getIntacctImplementation()
    {
        return intacctImplementation;
    }

    /**
     * Sets the intacctImplementation. 
     *
     * @param intacctImplementation  with the intacctImplementation.
     */
    
    public void setIntacctImplementation(IntacctFacade intacctImplementation)
    {
        this.intacctImplementation = intacctImplementation;
    }
    
    @SuppressWarnings("unchecked")
    private <T> List<T> coalesceList(List<T> list )
    {
        return (List<T>) ((list == null) ? Collections.emptyList() : list);
    }
    
    private Object nullifyEmptyListWrapper(final String propertyName,
                                       final List<Map<String, Object>> value,
                                       final Class<?> clazz)
    {
        if (clazz == null)
        {
            return null;
        }
        return mom.nullifyEmptyListWrapper(propertyName, value, clazz);
    }

    private Class<?> nullifyEnumType(Object enumType)
    {
        if (enumType == null)
        {
            return null;
        }
        return ((EnumType)enumType).getRequestType();
    }
}