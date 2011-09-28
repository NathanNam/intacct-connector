/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.intacct;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.*;

import org.mule.module.intacct.schema.request.Lineitem;

import ar.com.zauber.commons.mom.MapObjectMapper;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class MomNullifyerUnitTest
{

    @SuppressWarnings({"serial", "unchecked"})
    @Test
    public void testAnswersNonNullForNonEmptyList()
    {
        Map<String, Object> map = nullifyer().nullifyEmptyListWrapper("lineitem", 
            Arrays.<Map<String, Object>>asList(new HashMap<String, Object>() {{
               put("memo", "foo"); 
        }}), Lineitem.class);
        
        assertNotNull(map);
        assertTrue(map.containsKey("lineitem"));
        assertEquals("foo",((List<Lineitem>)map.get("lineitem")).get(0).getMemo());
    }
    
    @SuppressWarnings({"unchecked"})
    @Test
    public void testAnswersNullEmptyList()
    {
        Map<String, Object> map = nullifyer().nullifyEmptyListWrapper("lineitem", 
            Arrays.<Map<String, Object>>asList(), Lineitem.class);
        assertNull(map);
    }

    private MomNullifyer nullifyer()
    {
        return new MomNullifyer(new MapObjectMapper("org.mule.module.intacct.schema"));
    }

}


