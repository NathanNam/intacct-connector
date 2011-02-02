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

import org.mule.config.spring.MuleHierarchicalBeanDefinitionParserDelegate;
import org.mule.config.spring.parsers.assembly.BeanAssembler;
import org.mule.config.spring.parsers.generic.ChildDefinitionParser;
import org.mule.module.intacct.util.JaxBUtils;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.lang.UnhandledException;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * <p>
 * Extension of {@link ChildDefinitionParser} that treats all the child node elements
 * as DTO that are unmarshalled with JAXB instead of the default parsing schema.
 * This one doesn't set the attributes
 * </p>
 * <p>
 * Handy to use to create a DTOEvaluationInvokerMessageProcessorFactoryBean.
 * </p>
 */
public class DTOChildDefinitionParserNoAttributes extends ChildDefinitionParser
{
    private final String clazzProperty;

    public DTOChildDefinitionParserNoAttributes(String parentSetterMethod,
                                                Class<?> clazz,
                                                final String clazzProperty)
    {
        super(parentSetterMethod, clazz);

        // Mule should exclude setting the attribute called starting with "xml".
        addIgnored("xmlns");
        this.clazzProperty = clazzProperty;
    }

    @Override
    protected Class<?> getBeanClass(Element element)
    {
        return DTOEvaluationInvokerMessageProcessorFactoryBean.class;
    }

    @Override
    protected void processProperty(Attr attribute, BeanAssembler assembler)
    {
        // This is overriden so that the properties of the object are not set. We
        // only want to set the arguments and the rest are atttributes of the XML to
        // be unmarshalled

    }

    @Override
    protected AbstractBeanDefinition parseInternal(final Element element, final ParserContext parserContext)
    {
        final AbstractBeanDefinition bd = super.parseInternal(element, parserContext);
        // we handle all the node child, reading them with JAXB
        bd.setAttribute(MuleHierarchicalBeanDefinitionParserDelegate.MULE_NO_RECURSE, Boolean.TRUE);
        final List<Object> arguments = new ArrayList<Object>();

        Unmarshaller um = null;
        if (Node.ELEMENT_NODE == element.getNodeType())
        {
            try
            {
                if (um == null)
                {
                    um = JaxBUtils.REQUEST_JAXB_CTX.createUnmarshaller();
                }
                arguments.add(um.unmarshal(element));
            }
            catch (JAXBException e)
            {
                throw new UnhandledException(e);
            }
        }
        if (!arguments.isEmpty())
        {
            bd.getPropertyValues().add(clazzProperty, arguments);
        }
        return bd;
    }
}
