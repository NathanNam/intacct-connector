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

import static java.util.Arrays.asList;

import org.mule.module.intacct.IntacctCloudConnector;
import org.mule.module.intacct.schema.request.Function;
import org.mule.module.intacct.schema.request.Request;
import org.mule.processor.InvokerMessageProcessor;
import org.mule.util.CollectionUtils;

import java.util.Collection;
import java.util.List;

import edu.emory.mathcs.backport.java.util.Collections;

import org.apache.commons.collections.Transformer;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.FactoryBeanNotInitializedException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Creates a {@link DTOEvaluationInvokerMessageProcessor}
 */
public class DTOEvaluationInvokerMessageProcessorFactoryBean
    implements FactoryBean<InvokerMessageProcessor>, ApplicationContextAware
{
    private ApplicationContext appContext;
    private List<Object> arguments = Collections.emptyList();
    
    @Override
    public void setApplicationContext(final ApplicationContext applicationContext)
    {
        this.appContext = applicationContext;
        
    }

    @Override
    public InvokerMessageProcessor getObject() throws Exception
    {
        if (arguments == null)
        {
            throw new FactoryBeanNotInitializedException("Function is missing");
        }
        final InvokerMessageProcessor invokerMessageProcessor = 
            new DTOEvaluationInvokerMessageProcessor(Request.class.getPackage());
        invokerMessageProcessor.setArguments(arguments);
        invokerMessageProcessor.setMethodName("operation");
        invokerMessageProcessor.setArgumentTypes(createArrayFromList(arguments));
        invokerMessageProcessor.setObject(appContext.getBean(IntacctCloudConnector.class));
        return invokerMessageProcessor;
    }
    
    private Class<?>[] createArrayFromList(List<Object> collection) {
        Class<?>[] ret = new Class<?>[collection.size()];
        int i = 0;
        for(Object elem: collection) {
            ret[i] = elem.getClass();
            i++;
        }
        return ret;
    }
    
    

    @Override
    public Class<?> getObjectType()
    {
        return InvokerMessageProcessor.class;
    }

    @Override
    public boolean isSingleton()
    {
        return false;
    }

    public List<Object> getArguments()
    {
        return arguments;
    }

    public void setArguments(List<Object> arguments)
    {
        this.arguments = arguments;
    }

    
}
