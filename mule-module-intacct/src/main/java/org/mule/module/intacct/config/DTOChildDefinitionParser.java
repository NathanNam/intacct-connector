package org.mule.module.intacct.config;

import org.mule.config.spring.MuleHierarchicalBeanDefinitionParserDelegate;
import org.mule.config.spring.parsers.generic.ChildDefinitionParser;
import org.mule.module.intacct.IntacctCloudConnector;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.lang.UnhandledException;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * <p>
 * Extension of {@link ChildDefinitionParser} that treats all the child node elements as  
 * DTO that are unmarshalled with JAXB instead of the default parsing schema.
 * </p>
 * <p>Handy to use to create a DTOEvaluationInvokerMessageProcessorFactoryBean.</p>
 * 
 */
public class DTOChildDefinitionParser extends ChildDefinitionParser
{
    private final String clazzProperty;

    public DTOChildDefinitionParser(String parentSetterMethod, Class<?> clazz, 
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
    protected AbstractBeanDefinition parseInternal(final Element element, final ParserContext parserContext)
    {
        final AbstractBeanDefinition bd = super.parseInternal(element, parserContext);
        // we handle all the node child, reading them with JAXB
        bd.setAttribute(MuleHierarchicalBeanDefinitionParserDelegate.MULE_NO_RECURSE, Boolean.TRUE);
        final NodeList nodeList = element.getChildNodes();
        final List<Object> arguments = new ArrayList<Object>();
        
        Unmarshaller um = null;
        for (int i = 0; i < nodeList.getLength(); i++)
        {
            final Node node = nodeList.item(i);
            if (Node.ELEMENT_NODE == node.getNodeType())
            {
                try
                {
                    if (um == null) 
                    {
                        um = IntacctCloudConnector.REQUEST_JAXB_CTX.createUnmarshaller();
                    }
                    arguments.add(um.unmarshal(node));
                }
                catch (JAXBException e)
                {
                    throw new UnhandledException(e);
                }
            }
        }
        if (!arguments.isEmpty()) 
        {
            bd.getPropertyValues().add(clazzProperty, arguments);
        }
        return bd;
    }
}
