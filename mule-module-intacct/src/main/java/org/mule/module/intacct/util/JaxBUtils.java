/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.intacct.util;

import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.schema.response.Response;
import org.mule.module.intacct.xml.FilterCollectionFilter;
import org.mule.module.intacct.xml.XmlNamespaceFilter;
import org.mule.module.intacct.xml.XmlUnderscoreReplacementFilter;

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

    public static final JAXBContext REQUEST_JAXB_CTX = loadJaxBCtx(Request.class.getPackage().getName());

    public static final JAXBContext RESPONSE_JAXB_CTX = loadJaxBCtx(Response.class.getPackage().getName());

    /** loads JAXB context */
    private static JAXBContext loadJaxBCtx(final String pkg)
    {
        JAXBContext ctx;
        try
        {
            ctx = JAXBContext.newInstance(pkg);
        }
        catch (final JAXBException e)
        {
            throw new UnhandledException(e);
        }
        return ctx;
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
