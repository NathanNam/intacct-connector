/**
 * Mule Intacct Cloud Connector
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package org.mule.module.intacct.xml;

import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.schema.response.Response;

import java.io.StringWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.lang.UnhandledException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * Holds the JAXB Context for parsing Intacct XML request and response
 */
public final class JaxBUtils
{
    /** utility class */
    private JaxBUtils()
    {
        // nothing to do
    }



    /**
     * This uses {@link XMLWriter} with a filter to remove the namespace when
     * marshalling and then returns a {@link StringWriter} so that the XML can be
     * gotten
     */
    public static Writer marshallWithoutNamespaceAndUnderscoreReplacement(Object objectToMarshall, JAXBContext c)
        throws JAXBException
    {
        FilterCollectionFilter coll = new FilterCollectionFilter(new XmlNamespaceFilter(null),
            new XmlUnderscoreReplacementFilter());
        OutputFormat format = new OutputFormat();
        format.setIndent(true);
        format.setNewlines(true);
        final StringWriter writer = new StringWriter();
        XMLWriter xmlWriter = new XMLWriter(writer, format);
        coll.setContentHandler(xmlWriter);
        Marshaller m = c.createMarshaller();
        m.marshal(objectToMarshall, coll);
        return writer;
    }

}
