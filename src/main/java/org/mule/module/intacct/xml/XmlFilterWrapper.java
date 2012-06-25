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
