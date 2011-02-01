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

import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.module.intacct.impl.SystemOutIntacctFacade;
import org.mule.module.intacct.schema.request.Authentication;
import org.mule.module.intacct.schema.request.Content;
import org.mule.module.intacct.schema.request.Control;
import org.mule.module.intacct.schema.request.Function;
import org.mule.module.intacct.schema.request.Login;
import org.mule.module.intacct.schema.request.Operation;
import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.schema.response.Response;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.apache.commons.lang.UnhandledException;

public class IntacctCloudConnector implements Initialisable
{
    
    
    private String senderId;
    private String controlPassword;
    private String controlid;
    private String uniqueid;
    private String userid;
    private String userPassword;
    private String companyid;
    private IntacctFacade intacctImplementation;

    
    @Override
    public void initialise() throws InitialisationException
    {
        
    }

    
    public String getSenderId()
    {
        return senderId;
    }


    public void setSenderId(String senderId)
    {
        this.senderId = senderId;
    }

    public Response sendRequest(final Request request) throws JAXBException 
    {
        return intacctImplementation.executeOperation(request);
    }
    
    /** Reconoce la operacion con valores default setteados en el config */
    public Response operation(final Function function) throws JAXBException 
    {
        final Request request = new Request();
        final Control control = new Control();
        control.setSenderid(senderId);
        control.setPassword(controlPassword);
        control.setControlid(controlid);
        control.setUniqueid(uniqueid);
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
        return sendRequest(request);
        //return operation(request);
        
    }
    
    /** Reconoce la operacion con valores default setteados en el config */
    public Response operation(final Request req) throws JAXBException 
    {
        return sendRequest(req);
    }
    
  


    public void setControlPassword(String controlPassword)
    {
        this.controlPassword = controlPassword;
    }


    public String getControlPassword()
    {
        return controlPassword;
    }


    public void setControlid(String controlid)
    {
        this.controlid = controlid;
    }


    public String getControlid()
    {
        return controlid;
    }


    public void setUniqueid(String uniqueid)
    {
        this.uniqueid = uniqueid;
    }


    public String getUniqueid()
    {
        return uniqueid;
    }


    public void setUserid(String userid)
    {
        this.userid = userid;
    }


    public String getUserid()
    {
        return userid;
    }


    public void setUserPassword(String userPassword)
    {
        this.userPassword = userPassword;
    }


    public String getUserPassword()
    {
        return userPassword;
    }


    public void setCompanyid(String companyid)
    {
        this.companyid = companyid;
    }


    public String getCompanyid()
    {
        return companyid;
    }


    public void setIntacctImplementation(IntacctFacade intacctImplementation)
    {
        this.intacctImplementation = intacctImplementation;
    }


    public IntacctFacade getIntacctImplementation()
    {
        return intacctImplementation;
    }
}
