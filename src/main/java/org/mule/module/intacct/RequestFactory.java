/**
 * Mule Intacct Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package org.mule.module.intacct;

import org.mule.module.intacct.schema.request.Authentication;
import org.mule.module.intacct.schema.request.Content;
import org.mule.module.intacct.schema.request.Control;
import org.mule.module.intacct.schema.request.Function;
import org.mule.module.intacct.schema.request.Login;
import org.mule.module.intacct.schema.request.Operation;
import org.mule.module.intacct.schema.request.Request;

public class RequestFactory
{
    private String senderId;
    private String controlPassword;
    private String controlId;
    private String uniqueId;
    private String userId;
    private String userPassword;
    private String companyId;

    public RequestFactory(String senderId,
                          String controlPassword,
                          String controlId,
                          String uniqueId,
                          String userId,
                          String userPassword,
                          String companyId)
    {
        super();
        this.senderId = senderId;
        this.controlPassword = controlPassword;
        this.controlId = controlId;
        this.uniqueId = uniqueId;
        this.userId = userId;
        this.userPassword = userPassword;
        this.companyId = companyId;
    }

    public Request createRequestFromFunction(Function function)
    {
        final Request request = new Request();
        final Control control = new Control();
        control.setSenderid(senderId);
        control.setPassword(controlPassword);
        control.setControlid(controlId);
        control.setUniqueid(uniqueId);
        control.setDtdversion("2.1");
        request.setControl(control);
        final Operation operation = new Operation();
        request.getOperation().add(operation);
        final Authentication authentication = new Authentication();
        final Login login = new Login();
        login.setUserid(userId);
        login.setPassword(userPassword);
        login.setCompanyid(companyId);
        authentication.getLoginOrSessionid().add(login);
        operation.setAuthentication(authentication);
        final Content content = new Content();
        content.getFunction().add(function);
        operation.getContent().add(content);

        return request;
    }

    public Request createRequestFromCommand(String functionControlId, Object command)
    {
        return createRequestFromFunction(createFunction(functionControlId, command));
    }

    protected Function createFunction(String functionControlId, Object command)
    {
        Function function = new Function();
        function.getCmd().add(command);
        function.setControlid(functionControlId);
        return function;
    }
}
