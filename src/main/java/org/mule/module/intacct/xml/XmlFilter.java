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
