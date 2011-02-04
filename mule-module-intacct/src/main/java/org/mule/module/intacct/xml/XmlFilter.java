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
 * This interface is used for an XmlFilter. This filter is used before or after using
 * JaxB or some marshaller/unmarshaller
 */
public interface XmlFilter
{
    /**
     * Gets the Uri of an element or null if not provided
     */
    String getUri(String uri);

    /**
     * Returns if the namespace is preesnt
     */
    boolean isUriPresent();

    /**
     * Returns if the local name is present
     */
    boolean isLocalNamePresent();

    /**
     * Returns if the qname is present
     */
    boolean isQNamePresent();

    /**
     * Returns if the atts are present
     */
    boolean areAttsPresent();

    /**
     * Gets the local name of an element or null if not provided
     */
    String getLocalName(String localName);

    /**
     * Gets the qName of the element or null if not provided
     */
    String getqName(String qName);

    /**
     * Gets the attributes of the element or null if not provided
     */
    Attributes getAtts(Attributes atts);

    /**
     * Gets the priority of this filter against another filter. No priority is 0
     */
    int getPriority();

}
