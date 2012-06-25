/**
 * Mule Intacct Cloud Connector
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package org.mule.module.intacct;

import static org.apache.commons.lang.StringUtils.deleteWhitespace;

import org.hamcrest.Description;
import org.mockito.ArgumentMatcher;

public class StringMatchWithXml extends ArgumentMatcher<String>
{

    private final String xml;

    public StringMatchWithXml(String xml)
    {
        this.xml = xml;
    }

    @Override
    public boolean matches(Object actual)
    {
        return actual != null && equalsXml(((String) actual));
    }

    private boolean equalsXml(String otherXml)
    {
        return deleteWhitespace(xml).equalsIgnoreCase(deleteWhitespace(otherXml));
    }

    @Override
    public void describeTo(Description description)
    {
        description.appendText("xmlMatchWith(\"" + deleteWhitespace(xml) + "\"");
    }
    
    
}


