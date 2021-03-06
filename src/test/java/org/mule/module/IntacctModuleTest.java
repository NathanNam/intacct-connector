/**
 * Mule Intacct Cloud Connector
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

/**
 * This file was automatically generated by the Mule Development Kit
 */
package org.mule.module;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.mule.api.MuleEvent;
import org.mule.api.processor.MessageProcessor;
import org.mule.tck.AbstractMuleTestCase;
import org.mule.tck.FunctionalTestCase;

public class IntacctModuleTest extends FunctionalTestCase
{
    @Override
    protected String getConfigResources()
    {
        return "intacct-namespace-config.xml";
    }

    @Test
    public void testFlow() throws Exception
    {
        MessageProcessor flow = lookupFlowConstruct("testFlow");
        Map payload = new HashMap<String, Object>();
        MuleEvent event = AbstractMuleTestCase.getTestEvent(payload);
        MuleEvent responseEvent = flow.process(event);

        //assertEquals(expect, responseEvent.getMessage().getPayload());
        //runFlowAndExpect("testFlow", "Another string");
    }

    /**
    * Run the flow specified by name and assert equality on the expected output
    *
    * @param flowName The name of the flow to run
    * @param expect The expected output
    */
    protected <T> void runFlowAndExpect(String flowName, T expect) throws Exception
    {
        MessageProcessor flow = lookupFlowConstruct(flowName);
        MuleEvent event = AbstractMuleTestCase.getTestEvent(null);
        MuleEvent responseEvent = flow.process(event);

        assertEquals(expect, responseEvent.getMessage().getPayload());
    }

    /**
    * Run the flow specified by name using the specified payload and assert
    * equality on the expected output
    *
    * @param flowName The name of the flow to run
    * @param expect The expected output
    * @param payload The payload of the input event
    */
    protected <T, U> void runFlowWithPayloadAndExpect(String flowName, T expect, U payload) throws Exception
    {
        MessageProcessor flow = lookupFlowConstruct(flowName);
        MuleEvent event = AbstractMuleTestCase.getTestEvent(payload);
        MuleEvent responseEvent = flow.process(event);

        assertEquals(expect, responseEvent.getMessage().getPayload());
    }

    /**
     * Retrieve a flow by name from the registry
     *
     * @param name Name of the flow to retrieve
     */
    protected MessageProcessor lookupFlowConstruct(String name)
    {
        return (MessageProcessor) AbstractMuleTestCase.muleContext.getRegistry().lookupFlowConstruct(name);
    }
}
