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
 * This is the underscore filter Throuout this class methods we use the
 * {@link String#intern()} method so as to get from a String the cached version. JaxB
 * uses == instead of {@link Object#equals(Object)} to compare Strings, so they must
 * be the same instance so as to work. As the String used to compare is the one in
 * the annotation which already exists in the memory, we use intern to instruct the
 * JVM to use that one so that the == comparation returrs true
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
