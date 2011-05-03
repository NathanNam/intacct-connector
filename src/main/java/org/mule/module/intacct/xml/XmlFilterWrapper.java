/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.intacct.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

/**
 * This xml filter wraps an {@link XmlFilter} and implements {@link XMLFilterImpl} so
 * that it can be used with the JaxB Marshaller
 */
public class XmlFilterWrapper extends XMLFilterImpl
{

    private final XmlFilter filter;
    private boolean addedNamespace = false;

    public XmlFilterWrapper(XmlFilter filter)
    {
        this.filter = filter;

    }

    @Override
    public void startDocument() throws SAXException
    {
        super.startDocument();
    }

    private <T> T getNotNull(T... elements)
    {
        for (int i = 0; i < elements.length; i++)
        {
            if (elements[i] != null)
            {
                return elements[i];
            }
        }
        return null;
    }

    @Override
    public void startElement(String arg0, String arg1, String arg2, Attributes arg3) throws SAXException
    {
        super.startElement(getNotNull(filter.getUri(arg0), arg0),
            getNotNull(filter.getLocalName(arg1), arg1), getNotNull(filter.getqName(arg2), arg2), getNotNull(
                filter.getAtts(arg3), arg3));
    }

    @Override
    public void endElement(String arg0, String arg1, String arg2) throws SAXException
    {
        super.endElement(getNotNull(filter.getUri(arg0), arg0), getNotNull(filter.getLocalName(arg1), arg1),
            getNotNull(filter.getqName(arg2), arg2));
    }

    @Override
    public void startPrefixMapping(String prefix, String url) throws SAXException
    {
        if (filter.getUri(url) != null)
        {
            this.startControlledPrefixMapping(url);
        }
    }

    private void startControlledPrefixMapping(String url) throws SAXException
    {
        if (filter.getUri(url) != null && !addedNamespace)
        {
            super.startPrefixMapping("", filter.getUri(url));
            addedNamespace = true;
        }
    }

}
