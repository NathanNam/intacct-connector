
	
	/*
	 * Copyright (c) 2011 Zauber S.A.  -- All rights reserved
	 */
	
	package org.mule.module.intacct;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ar.com.zauber.commons.mom.MapObjectMapper;

	
	/**
 * TODO: Description of the class, Comments in english by default  
 * 
 * 
 * @author Gaston Ponti
 * @since Sep 28, 2011
 */

public class MomNullifyer
{
    private final MapObjectMapper mom;
    
    
    /**
     * Creates the MomNullifyer.
     * 
     * @param mom
     */

    public MomNullifyer(MapObjectMapper mom)
    {
        super();
        this.mom = mom;
    }


    /**
     * @param propertyName
     * @param value
     * @param clazz
     * @return
     */
    @SuppressWarnings("serial")
    public Object nullifyEmptyListWrapper(final String propertyName,
                                       final List<Map<String, Object>> value,
                                       final Class<?> clazz)
    {
        if(value.isEmpty())
            return null;
        
        return new HashMap<String, Object>(){{
           put(propertyName, Arrays.asList(mom.toArray(clazz, value))); 
        }};         
    }

}

	