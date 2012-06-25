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
import org.xml.sax.helpers.AttributesImpl;

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
        AttributesImpl ai = new AttributesImpl(atts);
        for (int i = 0; i < ai.getLength(); i++)
        {
            String lname = ai.getLocalName(i).replace('-', '_').intern();
            String qname = ai.getQName(i).replace('-', '_').intern();
            ai.setLocalName(i, lname);
            ai.setQName(i, qname);
        }
        return ai;
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
