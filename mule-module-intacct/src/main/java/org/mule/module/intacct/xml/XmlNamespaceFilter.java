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

/**
 *  This is the namespace filter
 */
public class XmlNamespaceFilter implements XmlFilter
{

    private final String namespace;

    /**
     * The namespace to choose or null otherwise
     */
    public XmlNamespaceFilter(String namespace)
    {
        this.namespace = namespace;

    }

    @Override
    public Attributes getAtts(Attributes atts)
    {
        return null;
    }

    @Override
    public String getLocalName(String localName)
    {
        return null;
    }

    @Override
    public int getPriority()
    {
        return 1;
    }

    @Override
    public String getUri(String uri)
    {
        return namespace;
    }

    @Override
    public String getqName(String qName)
    {
        return null;
    }

    @Override
    public boolean areAttsPresent()
    {
        return false;
    }

    @Override
    public boolean isLocalNamePresent()
    {
        return false;
    }

    @Override
    public boolean isQNamePresent()
    {
        return false;
    }

    @Override
    public boolean isUriPresent()
    {
        return true;
    }

}
