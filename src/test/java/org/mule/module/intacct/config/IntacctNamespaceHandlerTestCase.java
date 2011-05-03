
package org.mule.module.intacct.config;

import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.construct.SimpleFlowConstruct;
import org.mule.module.client.MuleClient;
import org.mule.module.intacct.BaseIntacctTest;
import org.mule.module.intacct.impl.MockIntacctFacade;
import org.mule.module.intacct.schema.request.Login;
import org.mule.module.intacct.schema.request.Operation;
import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.schema.response.Response;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

public class IntacctNamespaceHandlerTestCase extends BaseIntacctTest
{
    @Override
    protected String getConfigResources()
    {
        return "intacct-namespace-config.xml";
    }
    
    
    public void testFunctionWithExchHandling() throws Exception
    {
        final Map<String, String> payload = new HashMap<String, String>();
        payload.put("key", "1234");
        payload.put("controlid", "controlid!");
        payload.put("accountnoLower", "500");
        SimpleFlowConstruct flow = lookupFlowConstruct("functionFlowWithExHandling");
        final MuleEvent event = getTestEvent(payload);
        final MuleEvent responseEvent = flow.process(event);
    }
    
    
    public void testGetListEvent() throws Exception
    {
        final Map<String, String> payload = new HashMap<String, String>();
        payload.put("key", "1234");
        payload.put("controlid", "controlid!");
        payload.put("accountnoLower", "500");
        SimpleFlowConstruct flow = lookupFlowConstruct("getListFlow");
        final MuleEvent event = getTestEvent(payload);
        flow.process(event);
        
    }
    
    public void testGetEvent() throws Exception
    {
        final Map<String, String> payload = new HashMap<String, String>();
        payload.put("key", "1234");
        payload.put("controlid", "controlid!");
        payload.put("accountnoLower", "500");
        SimpleFlowConstruct flow = lookupFlowConstruct("getFlow");
        final MuleEvent event = getTestEvent(payload);
        flow.process(event);
        
    }
    public void testSendMessageFunctionToFlow() throws Exception
    {
        /*
         * This test case tests your Mule integration. To test your flow directly
         * (i.e. without any inbound endpoints, declare a flow in
         * intacct-namespace-config.xml and put the element from your cloud
         * connector's namespace that you want to test into it. A proper example was
         * put into intacct-namespace-config.xml Now you can send data to your test
         * flow from the unit test:
         */
        final Map<String, String> payload = new HashMap<String, String>();
        payload.put("key", "1234");
        payload.put("controlid", "controlid!");
        payload.put("accountnoLower", "500");
        SimpleFlowConstruct flow = lookupFlowConstruct("functionFlow");
        final MuleEvent event = getTestEvent(payload);
        final MuleEvent responseEvent = flow.process(event);
        MockIntacctFacade intacct = muleContext.getRegistry().get("sysoIntacct");
        Request requestCreated = intacct.getRequest();
        // Valido las cosas del request segun el XML de prueba
        Assert.assertEquals("12345", requestCreated.getControl().getSenderid());
        Assert.assertEquals("password Control", requestCreated.getControl().getPassword());
        Assert.assertEquals("mi id", requestCreated.getControl().getControlid());
        Assert.assertEquals("false", requestCreated.getControl().getUniqueid());
        Operation operation = requestCreated.getOperation().get(0);
        Assert.assertNotNull(operation);
        Object loginObject = operation.getAuthentication().getLoginOrSessionid().get(0);
        Assert.assertNotNull(loginObject);
        Assert.assertTrue(loginObject instanceof Login);
        Login login = (Login) loginObject;
        Assert.assertEquals("usuario", login.getUserid());
        Assert.assertEquals("miPass", login.getPassword());
        Assert.assertEquals("compId", login.getCompanyid());
        Assert.assertTrue(responseEvent.getMessage().getPayload() instanceof Response);
    }

    /**
     * This tests the request flow and checks that all the parameters from the config are overriden
     */
    public void testSendMessageRequestToFlow() throws Exception
    {

        final Map<String, String> payload = new HashMap<String, String>();
        payload.put("key", "1234");
        payload.put("controlid", "controlid!");
        payload.put("accountnoLower", "500");
        SimpleFlowConstruct flow = lookupFlowConstruct("requestFlow");
        final MuleEvent event = getTestEvent(payload);
        final MuleEvent responseEvent = flow.process(event);
        MockIntacctFacade intacct = muleContext.getRegistry().get("sysoIntacct");
        Request requestCreated = intacct.getRequest();
        // Now i check that what was sent is NOT what was in config. It must be overriden
           
        Assert.assertEquals("intacct-dev", requestCreated.getControl().getSenderid());
        Assert.assertEquals("babbage", requestCreated.getControl().getPassword());
        Assert.assertEquals("XML Sample", requestCreated.getControl().getControlid());
        Assert.assertEquals(null, requestCreated.getControl().getUniqueid());
        Operation operation = requestCreated.getOperation().get(0);
        Assert.assertNotNull(operation);
        Object loginObject = operation.getAuthentication().getLoginOrSessionid().get(0);
        Assert.assertNotNull(loginObject);
        Assert.assertTrue(loginObject instanceof Login);
        Login login = (Login) loginObject;
        Assert.assertEquals("xmluser", login.getUserid());
        Assert.assertEquals("abc123", login.getPassword());
        Assert.assertEquals("XML Sample", login.getCompanyid());
        Assert.assertTrue(responseEvent.getMessage().getPayload() instanceof Response);
    }
    
    /**
     * Tests another flow with the queue in memory (vm transport)
     */
    public void testFunctionFlowWithQueue() throws Exception
    {
        
        final Map<String, String> payload = new HashMap<String, String>();
        payload.put("key", "1234");
        payload.put("controlid", "controlid!");
        payload.put("accountnoLower", "500");
        MuleClient client = new MuleClient(muleContext);
        MuleMessage result = client.send("vm://realFlow", payload, null);
        Assert.assertNotNull(result);
     
    }

   
}
