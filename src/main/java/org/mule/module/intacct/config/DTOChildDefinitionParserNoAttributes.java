/**
 * Mule Intacct Cloud Connector
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package org.mule.module.intacct.config;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.lang.UnhandledException;
import org.mule.config.spring.MuleHierarchicalBeanDefinitionParserDelegate;
import org.mule.config.spring.parsers.assembly.BeanAssembler;
import org.mule.config.spring.parsers.generic.ChildDefinitionParser;
import org.mule.module.intacct.xml.XmlFilterWrapper;
import org.mule.module.intacct.xml.XmlUnderscoreReplacementFilter;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

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
                    
                    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                    Source xmlSource = new DOMSource(element);
                    StreamResult outputTarget = new StreamResult(outputStream);
                    TransformerFactory.newInstance().newTransformer().transform(xmlSource, outputTarget);
                    
                    InputStream in = new ByteArrayInputStream(outputStream.toByteArray());
                    um = IntacctNamespaceHandler.REQUEST_JAXB_CTX.createUnmarshaller();
                    XMLReader reader;
                    reader = XMLReaderFactory.createXMLReader();
                    
                    XmlFilterWrapper underscoreFilter = new XmlFilterWrapper(new XmlUnderscoreReplacementFilter());
                    underscoreFilter.setParent(reader);
                    InputSource is = new InputSource(in);
                    SAXSource source = new SAXSource(underscoreFilter, is);
                    arguments.add(um.unmarshal(source));
                }
                
            }
            catch (JAXBException e)
            {
                throw new UnhandledException(e);
            }
            catch (TransformerConfigurationException e)
            {
                throw new UnhandledException(e);
            }
            catch (TransformerException e)
            {
                throw new UnhandledException(e);
            }
            catch (TransformerFactoryConfigurationError e)
            {
                throw new UnhandledException(e);
            }
            catch (SAXException e)
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
