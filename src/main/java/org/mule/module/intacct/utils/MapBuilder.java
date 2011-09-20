
/*
 * Copyright (c) 2011 Zauber S.A.  -- All rights reserved
 */
	
package org.mule.module.intacct.utils;

import java.util.HashMap;
import java.util.Map;


/**
 * Map Builder.
 * <p>
 * Builder for a HashMap.
 * 
 * 
 * @author Gaston Ponti
 * @since Sep 20, 2011
 */

public class MapBuilder
{
    private Map<String, Object> map = new HashMap<String, Object>();
    
    /**
     * Creates the QuickBooksModule.EntityBuilder.
     *
     */
               
    public MapBuilder with(String propertyName, Object property)
    {
        map.put(propertyName, property);
        return this;
    }
   
    public Map<String, Object> build()
    {
        return map;
    }
}
	