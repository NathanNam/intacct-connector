/*
 * Mule Intacct Cloud Connector
 *
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
 * This recieves a collection of XmlFilter and applies them. It uses the priority of
 * each filter to know which of them to apply
 */
public class FilterCollectionFilter extends XMLFilterImpl
{
    private XmlFilter namespaceUri;
    private XmlFilter qName;
    private XmlFilter localName;
    private XmlFilter atts;
    private boolean addedNamespace = false;

    public FilterCollectionFilter(XmlFilter... filters)
    {
        int actualPriority = -1;
        for (XmlFilter filter : filters)
        {
            if (filter.getPriority() > actualPriority)
            {
                actualPriority = filter.getPriority();
                replaceAllFields(filter);
            }
            else
            {
                if (namespaceUri == null && filter.isUriPresent())
                {
                    namespaceUri = filter;
                }
                if (qName == null && filter.isQNamePresent())
                {
                    qName = filter;
                }
                if (localName == null && filter.isLocalNamePresent())
                {
                    localName = filter;
                }
                if (atts == null && filter.areAttsPresent())
                {
                    atts = filter;
                }
            }
        }
    }

    private void replaceAllFields(XmlFilter filter)
    {
        if (filter.isUriPresent())
        {
            namespaceUri = filter;
        }
        if (filter.isQNamePresent())
        {
            qName = filter;
        }
        if (filter.isLocalNamePresent())
        {
            localName = filter;
        }
        if (filter.areAttsPresent())
        {
            atts = filter;
        }
    }

    @Override
    public void startDocument() throws SAXException
    {
        super.startDocument();
    }

    @Override
    public void startElement(String arg0, String arg1, String arg2, Attributes arg3) throws SAXException
    {
        super.startElement(namespaceUri == null ? arg0 : namespaceUri.getUri(arg0),
            localName == null ? arg1 : localName.getLocalName(arg1), qName == null
                                                                                  ? arg2
                                                                                  : qName.getqName(arg2),
            atts == null ? arg3 : atts.getAtts(arg3));
    }

    @Override
    public void endElement(String arg0, String arg1, String arg2) throws SAXException
    {
        super.endElement(namespaceUri == null ? arg0 : namespaceUri.getUri(arg0),
            localName == null ? arg1 : localName.getLocalName(arg1), qName == null
                                                                                  ? arg2
                                                                                  : qName.getqName(arg2));
    }

    @Override
    public void startPrefixMapping(String prefix, String url) throws SAXException
    {

        if (namespaceUri != null)
        {
            this.startControlledPrefixMapping(url);
        }
    }

    private void startControlledPrefixMapping(String url) throws SAXException
    {

        if (namespaceUri != null && !addedNamespace)
        {
            super.startPrefixMapping("", namespaceUri.getUri(url));
            addedNamespace = true;
        }
    }

}
