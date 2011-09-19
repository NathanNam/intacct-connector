/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.intacct;

import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.schema.response.Response;

/**
 * Facade for Intacct's Connection layer
 */
public interface IntacctFacade
{

    /** executes an API operation synchronously */
    Response executeOperation(Request request);
    
    /*Response createSotransaction(String transactiontype, Map<String, Object> datecreated, 
                                 String createdfrom, Map<String, Object> customerid, 
                                 String documentno, String referenceno, Termname termname,
                                 Map<String, Object> datedue, String message,
                                 String shippingmethod, Map<String, Object> shipto,
                                 Map<String, Object> billto, String externalid,
                                 String basecurr, String currency,
                                 Map<String, Object> exchratedateOrExchratetypeOrExchrate,
                                 String vsoepricelist, Map<String, Object> customfields, 
                                 Map<String, Object> sotransitems, Subtotals subtotals
                                 ) throws JAXBException;

    Response getList(String object, String start, String maxitems, String showprivate, 
                     Map<String, Object> filter, Map<String, Object> sorts, 
                     Map<String, Object> fields) throws JAXBException;
    
    Response get(String object, String key, String externalkey, Map<String, Object> fields
                 ) throws JAXBException;*/
}


