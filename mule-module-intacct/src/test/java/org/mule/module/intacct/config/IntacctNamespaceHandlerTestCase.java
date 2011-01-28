package org.mule.module.intacct.config;

import org.mule.api.MuleEvent;
import org.mule.construct.SimpleFlowConstruct;
import org.mule.tck.FunctionalTestCase;

import java.util.HashMap;
import java.util.Map;

public class IntacctNamespaceHandlerTestCase extends FunctionalTestCase
{
    @Override
    protected String getConfigResources()
    {
        return "intacct-namespace-config.xml";
    }

    public void testSendMessageToFlow() throws Exception
    {
        /*
            This test case tests your Mule integration.
            
            To test your flow directly (i.e. without any inbound endpoints, declare a flow in
            intacct-namespace-config.xml and put the element from your
            cloud connector's namespace that you want to test into it.
            A proper example was put into intacct-namespace-config.xml

            Now you can send data to your test flow from the unit test:
        */
            final Map<String, String> payload = new HashMap<String, String>();
            payload.put("key", "1234");
            payload.put("controlid", "controlid!");
            payload.put("accountnoLower", "500");
            SimpleFlowConstruct flow = lookupFlowConstruct("theFlow");
            final MuleEvent event = getTestEvent(payload);
            final MuleEvent responseEvent = flow.process(event);
            System.out.println(responseEvent.getMessage().getPayload());
//            assertEquals("", responseEvent.getMessage().getPayloadAsString());
    }

    private SimpleFlowConstruct lookupFlowConstruct(String name)
    {
        return (SimpleFlowConstruct) muleContext.getRegistry().lookupFlowConstruct(name);
    }
}
