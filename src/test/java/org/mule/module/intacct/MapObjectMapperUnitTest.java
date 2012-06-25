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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.mule.module.intacct.schema.request.Lineitem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class MapObjectMapperUnitTest
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

    private IntacctMapObjectMapper nullifyer()
    {
        return new IntacctMapObjectMapper();
    }

}


