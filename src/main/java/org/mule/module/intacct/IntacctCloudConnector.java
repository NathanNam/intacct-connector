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
import java.util.HashMap;
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
import org.mule.module.intacct.schema.request.Customerid;
import org.mule.module.intacct.schema.request.Function;
import org.mule.module.intacct.schema.request.GetList;
import org.mule.module.intacct.schema.request.Login;
import org.mule.module.intacct.schema.request.Operation;
import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.schema.request.Termname;
import org.mule.module.intacct.schema.response.Response;
import org.mule.module.intacct.utils.MapBuilder;
import org.springframework.expression.spel.ast.Ternary;

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
    public Response createSotransaction(String functionControlid,
                                        String transactiontype,
                                        Map<String, Object> datecreated, 
                                        @Optional String createdfrom,
                                        String customerid, 
                                        @Optional String documentno,
                                        @Optional String referenceno,
                                        @Optional String termname,
                                        @Optional Map<String, Object> datedue,
                                        @Optional String message,
                                        @Optional String shippingmethod,
                                        @Optional Map<String, Object> shipto,
                                        @Optional Map<String, Object> billto,
                                        @Optional String externalid,
                                        @Optional String basecurr,
                                        @Optional String currency,
                                        @Optional List<Object> exchratedateOrExchratetypeOrExchrate,
                                        @Optional String vsoepricelist,
                                        @Optional Map<String, Object> customfields,
                                        Map<String, Object> sotransitems,
                                        @Optional Map<String, Object> subtotals
                                        ) throws JAXBException
    {
        CreateSotransaction createSotransaction = mom.toObject(CreateSotransaction.class, 
            new MapBuilder().with("transactiontype", transactiontype)
                            .with("datecreated", datecreated)
                            .with("createdfrom", createdfrom)
                            .with("customerid", fromSingleValue(customerid))
                            .with("documentno", documentno)
                            .with("referenceno", referenceno)
                            .with("termname", fromSingleValue(termname))
                            .with("datedue", datedue)
                            .with("message", message)
                            .with("shippingmethod", shippingmethod)
                            .with("shipto", shipto)
                            .with("billto", billto)
                            .with("externalid", externalid)
                            .with("basecurr", basecurr)
                            .with("currency", currency)
                            .with("exchratedateOrExchratetypeOrExchrate", coalesceList(exchratedateOrExchratetypeOrExchrate))
                            .with("vsoepricelist", vsoepricelist)
                            .with("customfields", customfields)
                            .with("sotransitems", sotransitems)
                            .with("subtotals", subtotals)
                            .build()
            );

        Function function = new Function();
        function.getCmd().add(createSotransaction);
        function.setControlid(functionControlid);
        
        return operationWithRequest(inicializeRequest(function));
    }
    
	protected Map<String,Object> fromSingleValue(final Object value){
    	return value == null ? null : Collections.singletonMap("value", value);
    }
    
    
    @Processor
    public Response getList(String functionControlid,
                            String object,
                            @Optional String start,
                            @Optional String maxitems, 
                            @Optional String showprivate, 
                            @Optional Map<String, Object> filter,
                            @Optional Map<String, Object> sorts,
                            @Optional Map<String, Object> fields
                            ) throws JAXBException
    {
        GetList getList = mom.toObject(GetList.class, 
            new MapBuilder().with("object", object)
                            .with("start", start)
                            .with("maxitems", maxitems)
                            .with("filter", filter)
                            .with("sorts", sorts)
                            .with("fields", fields)
                            .build()
            );

        Function function = new Function();
        function.getCmd().add(getList);
        function.setControlid(functionControlid);
        
        return operationWithRequest(inicializeRequest(function));
    }
    
    @Processor
    public Response get(String functionControlid,
                        String object,
                        String key, 
                        @Optional String externalkey,
                        @Optional Map<String, Object> fields
                        ) throws JAXBException
    {
        GetList getList = mom.toObject(GetList.class, 
            new MapBuilder().with("object", object)
                            .with("key", key)
                            .with("externalkey", externalkey)
                            .with("fields", fields)
                            .build()
            );

        Function function = new Function();
        function.getCmd().add(getList);
        function.setControlid(functionControlid);
        
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
    public Response operationWithRequest(final Request req) throws JAXBException
    {
        return sendRequest(req);
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
