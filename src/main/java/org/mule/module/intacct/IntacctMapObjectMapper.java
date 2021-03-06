/**
 * Mule Intacct Cloud Connector
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */


/*
 * Mule Intacct Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.intacct;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mule.modules.utils.mom.JaxbMapObjectMappers;

import com.zauberlabs.commons.mom.MapObjectMapper;

/**
 * @author Gaston Ponti
 * @since Sep 28, 2011
 */
public class IntacctMapObjectMapper
{   
    private final MapObjectMapper mom = JaxbMapObjectMappers.default_("org.mule.module.intacct.schema");


    public Map<String,Object> nullifyEmptyListWrapper(final String propertyName,
                                       final List<Map<String, Object>> value,
                                       final Class<?> clazz)
    {
        if(value == null || value.isEmpty())
            return null;
        
        return wrapList(propertyName, value, clazz);         
    }

    @SuppressWarnings("serial")
    public Map<String, Object> wrapList(final String propertyName,
                                         final List<Map<String, Object>> value,
                                         final Class<?> clazz)
    {
        return new HashMap<String, Object>(){{
           put(propertyName, toList(clazz, value)); 
        }};
    }

    @SuppressWarnings("unchecked")
    public List<Object> toList(final Class<?> componentType, final List<Map<String, Object>> value)
    {
        return (List<Object>) mom.unmap(value, componentType);
    }


    public <T> T toObject(Class<T> type, Map<String, Object> value)
    {
        return (T) mom.unmap(value, type);
    }

    public Map<String, Object> toMap(Object function)
    {
        return (Map<String, Object>) mom.map(function);
    }

}
