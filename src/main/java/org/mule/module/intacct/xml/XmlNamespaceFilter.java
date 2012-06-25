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
        return false;
    }

}
