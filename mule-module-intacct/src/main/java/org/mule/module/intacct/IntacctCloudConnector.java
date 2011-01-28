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
    public static final JAXBContext REQUEST_JAXB_CTX = loadJaxBCtx(Request.class.getPackage().getName());
    
    private IntacctFacade inttactFacade;
    private String senderId;

    
    @Override
    public void initialise() throws InitialisationException
    {
//        inttactFacade = new JerseyIntacctFacade("https://www.intacct.com/ia/xml/xmlgw.phtml");
        inttactFacade = new SystemOutIntacctFacade();

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
        return inttactFacade.executeOperation(request);
    }
    
    public Response operation(final Function function) throws JAXBException 
    {
        final Request request = new Request();
        final Control control = new Control();
        control.setSenderid("intacct_dev");
        control.setPassword("babbage");
        control.setControlid("id");
        control.setUniqueid("false");
        request.setControl(control);
        final Operation operation = new Operation();
        request.getOperation().add(operation);
        final Authentication authentication = new Authentication();
        final Login login = new Login();
        login.setUserid("xmluser");
        login.setPassword("babbage");
        login.setCompanyid("XML Sample");
        authentication.getLoginOrSessionid().add(login);
        operation.setAuthentication(authentication);
        final Content content = new Content();
        content.getFunction().add(function);
        operation.getContent().add(content);

        return sendRequest(request);
    }
    
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
}
