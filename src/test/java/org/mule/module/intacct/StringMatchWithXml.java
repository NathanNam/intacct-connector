/**
 * Mule Intacct Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
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


