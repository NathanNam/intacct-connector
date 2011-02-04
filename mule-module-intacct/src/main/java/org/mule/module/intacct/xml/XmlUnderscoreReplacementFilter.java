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
 * This is the underscore filter
 */
public class XmlUnderscoreReplacementFilter implements XmlFilter
{

    @Override
    public boolean areAttsPresent()
    {
        return true;
    }

    @Override
    public Attributes getAtts(Attributes atts)
    {
        return atts;
    }

    @Override
    public String getLocalName(String localName)
    {
        return localName.replace("-", "_").intern();
    }

    @Override
    public int getPriority()
    {
        return 0;
    }

    @Override
    public String getUri(String uri)
    {
        return null;
    }

    @Override
    public String getqName(String qName)
    {
        return qName.replace("-", "_").intern();
    }

    @Override
    public boolean isLocalNamePresent()
    {
        return true;
    }

    @Override
    public boolean isQNamePresent()
    {
        return true;
    }

    @Override
    public boolean isUriPresent()
    {
        return false;
    }

    

}


