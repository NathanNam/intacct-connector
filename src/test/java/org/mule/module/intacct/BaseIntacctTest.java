/*
 * Mule Intacct Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.intacct;

import org.mule.api.processor.MessageProcessor;
import org.mule.tck.FunctionalTestCase;

/** abstract class for connectors tests */
public abstract class BaseIntacctTest extends FunctionalTestCase
{
    protected MessageProcessor lookupFlowConstruct(final String name)
    {
        return (MessageProcessor) muleContext.getRegistry().lookupFlowConstruct(name);
    }
    

}


