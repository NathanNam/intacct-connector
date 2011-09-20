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

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBException;

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.Module;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.param.Optional;
import org.mule.module.intacct.exception.IntacctException;
import org.mule.module.intacct.impl.JerseySslIntacctFacade;
import org.mule.module.intacct.schema.request.Authentication;
import org.mule.module.intacct.schema.request.Content;
import org.mule.module.intacct.schema.request.Control;
import org.mule.module.intacct.schema.request.CreateSotransaction;
import org.mule.module.intacct.schema.request.Function;
import org.mule.module.intacct.schema.request.GetList;
import org.mule.module.intacct.schema.request.Login;
import org.mule.module.intacct.schema.request.Operation;
import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.schema.response.Response;
import org.mule.module.intacct.utils.MapBuilder;

import ar.com.zauber.commons.mom.CXFStyle;
import ar.com.zauber.commons.mom.MapObjectMapper;

@SuppressWarnings("serial")
@Module(name="intacct",
        namespace="http://repository.mulesoft.org/releases/org/mule/modules/mule-module-intacct",
        schemaLocation="http://repository.mulesoft.org/releases/org/mule/modules/mule-module-intacct/1.0-SNAPSHOT/mule-intacct.xsd")
public class IntacctCloudConnector
{
    @Configurable
    private String senderId;
    
    @Configurable
    private String controlPassword;
    
    @Configurable
    private String controlid;
    
    @Configurable
    private String uniqueid;
    
    @Configurable
    private String userid;
    
    @Configurable
    private String userPassword;
    
    @Configurable
    private String companyid;
    
    @Configurable
    @Optional
    private IntacctFacade intacctImplementation;
    
    private MapObjectMapper mom =  new MapObjectMapper("org.mule.module.intacct.schema");

    private static final String URL = "https://www.intacct.com/ia/xml/xmlgw.phtml";

    /** Given the function we create the request with the parameters for default given in the config */
    @Processor
    public Response operation(final Map<String, Object> function) throws JAXBException
    {
        Function realFunction = mom.toObject(Function.class, function);

        return operationWithRequest(inicializeRequest(realFunction));
    }

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
                                        @Optional Map<String, Object> shipTo,
                                        @Optional Map<String, Object> billTo,
                                        @Optional String externalId,
                                        @Optional String baseCurr,
                                        @Optional String currency,
                                        @Optional List<Object> exchrateDateOrExchrateTypeOrExchrate,
                                        @Optional String vsoePriceList,
                                        @Optional Map<String, Object> customFields,
                                        Map<String, Object> soTransItems,
                                        @Optional Map<String, Object> subTotals
                                        ) throws JAXBException
    {
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
                            .with("shipto", shipTo)
                            .with("billto", billTo)
                            .with("externalid", externalId)
                            .with("basecurr", baseCurr)
                            .with("currency", currency)
                            .with("exchratedateOrExchratetypeOrExchrate", coalesceList(exchrateDateOrExchrateTypeOrExchrate))
                            .with("vsoepricelist", vsoePriceList)
                            .with("customfields", customFields)
                            .with("sotransitems", soTransItems)
                            .with("subtotals", subTotals)
                            .build()
            );

        Function function = new Function();
        function.getCmd().add(createSotransaction);
        function.setControlid(functionControlId);
        
        return operationWithRequest(inicializeRequest(function));
    }
    
	protected Map<String,Object> fromSingleValue(final Object value){
    	return value == null ? null : Collections.singletonMap("value", value);
    }
    
    
    @Processor
    public Response getList(String functionControlId,
                            String object,
                            @Optional String start,
                            @Optional String maxItems, 
                            @Optional String showPrivate, 
                            @Optional Map<String, Object> filter,
                            @Optional Map<String, Object> sorts,
                            @Optional Map<String, Object> fields
                            ) throws JAXBException
    {
        GetList getList = mom.toObject(GetList.class, 
            new MapBuilder().with("object", object)
                            .with("start", start)
                            .with("maxitems", maxItems)
                            .with("filter", filter)
                            .with("sorts", sorts)
                            .with("fields", fields)
                            .build()
            );

        Function function = new Function();
        function.getCmd().add(getList);
        function.setControlid(functionControlId);
        
        return operationWithRequest(inicializeRequest(function));
    }
    
    @Processor
    public Response get(String functionControlId,
                        String object,
                        String key, 
                        @Optional String externalKey,
                        @Optional Map<String, Object> fields
                        ) throws JAXBException
    {
        GetList getList = mom.toObject(GetList.class, 
            new MapBuilder().with("object", object)
                            .with("key", key)
                            .with("externalkey", externalKey)
                            .with("fields", fields)
                            .build()
            );

        Function function = new Function();
        function.getCmd().add(getList);
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
    
    /** Reconoce la operacion con valores default setteados en el config */
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
    
    private <T> List<T> coalesceList(List<T> list )
    {
        return (List<T>) ((list == null) ? Collections.emptyList() : list);
    }
}
