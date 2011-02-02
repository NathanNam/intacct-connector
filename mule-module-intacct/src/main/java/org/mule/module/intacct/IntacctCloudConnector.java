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
import org.mule.module.intacct.exception.IntacctException;
import org.mule.module.intacct.impl.JerseySslIntacctFacade;
import org.mule.module.intacct.schema.request.Authentication;
import org.mule.module.intacct.schema.request.Content;
import org.mule.module.intacct.schema.request.Control;
import org.mule.module.intacct.schema.request.Function;
import org.mule.module.intacct.schema.request.Login;
import org.mule.module.intacct.schema.request.Operation;
import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.schema.response.Response;

import javax.xml.bind.JAXBException;

/**
 * This is the real cloud connector for intacct
 */
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
    private static final String URL = "https://www.intacct.com/ia/xml/xmlgw.phtml";

    @Override
    public void initialise() throws InitialisationException
    {
        // As the intacct implementation is optional, if no ref is passed we set a
        // default to Jersey SSL with the url
        if (intacctImplementation == null)
        {
            intacctImplementation = new JerseySslIntacctFacade(URL);
        }
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

    /** Given the function we create the request with the parameters for default given in the config */
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
        return operation(request);

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
