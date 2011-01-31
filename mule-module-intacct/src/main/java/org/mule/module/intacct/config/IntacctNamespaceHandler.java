/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.intacct.config;

import org.mule.config.spring.handlers.AbstractMuleNamespaceHandler;
import org.mule.config.spring.parsers.generic.OrphanDefinitionParser;
import org.mule.module.intacct.IntacctCloudConnector;

public class IntacctNamespaceHandler extends AbstractMuleNamespaceHandler
{

    public void init()
    {
        registerMuleBeanDefinitionParser("config", 
            new OrphanDefinitionParser(IntacctCloudConnector.class, true));
        
        registerMuleBeanDefinitionParser("executeFunction", 
            new DTOChildDefinitionParser("messageProcessor",
                DTOEvaluationInvokerMessageProcessorFactoryBean.class, "arguments"));
        
        registerMuleBeanDefinitionParser("executeRequest", 
            new DTOChildDefinitionParser("messageProcessor",
                DTOEvaluationInvokerMessageProcessorFactoryBean.class, "arguments"));
    }
}
