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

import org.mule.module.intacct.schema.request.Authentication;
import org.mule.module.intacct.schema.request.Clientid;
import org.mule.module.intacct.schema.request.Content;
import org.mule.module.intacct.schema.request.Control;
import org.mule.module.intacct.schema.request.Function;
import org.mule.module.intacct.schema.request.Locationid;
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
    private String clientId;
    private String locationId;

    public RequestFactory(String senderId,
                          String controlPassword,
                          String controlId,
                          String uniqueId,
                          String userId,
                          String userPassword,
                          String companyId,
                          String clientId,
                          String locationId)
    {
        super();
        this.senderId = senderId;
        this.controlPassword = controlPassword;
        this.controlId = controlId;
        this.uniqueId = uniqueId;
        this.userId = userId;
        this.userPassword = userPassword;
        this.companyId = companyId;
        this.clientId = clientId;
        this.locationId = locationId;
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
        if (clientId != null)
        {
            Clientid clientId_object = new Clientid();
            clientId_object.setValue(clientId);
            login.getClientidOrLocationid().add(clientId_object);
        }
        if (locationId != null)
        {
            Locationid locationId_object = new Locationid();
            locationId_object.setValue(locationId);
            login.getClientidOrLocationid().add(locationId_object);
        }
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
