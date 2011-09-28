
/*
 * Copyright (c) 2011 Zauber S.A.  -- All rights reserved
 */

package org.mule.module.intacct;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO: Description of the class, Comments in english by default
 * 
 * @author Gaston Ponti
 * @since Sep 28, 2011
 */
public class MapObjectMapper extends ar.com.zauber.commons.mom.MapObjectMapper
{

    public MapObjectMapper(String packageName)
    {
        super(packageName);
    }


    public Map<String,Object> nullifyEmptyListWrapper(final String propertyName,
                                       final List<Map<String, Object>> value,
                                       final Class<?> clazz)
    {
        if(value.isEmpty())
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
        return (List<Object>) Arrays.asList(toArray(componentType, value));
    }

}
