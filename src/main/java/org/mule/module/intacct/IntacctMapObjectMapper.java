
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

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mule.module.intacct.schema.request.Function;
import org.mule.modules.utils.mom.CxfMapObjectMappers;

import ar.com.zauber.commons.mom.MapObjectMapper;

/**
 * TODO: Description of the class, Comments in english by default
 * 
 * @author Gaston Ponti
 * @since Sep 28, 2011
 */
public class IntacctMapObjectMapper
{   
    private MapObjectMapper mom = CxfMapObjectMappers.default_("org.mule.module.intacct.schema");


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
