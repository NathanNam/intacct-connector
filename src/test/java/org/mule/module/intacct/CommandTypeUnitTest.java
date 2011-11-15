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

import static org.junit.Assert.*;

import org.mule.module.intacct.schema.request.CreateApadjustment;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
public class CommandTypeUnitTest
{

    @Test
    public void testNewInstance()
    {
        assertSame(CommandType.CreateApadjustment.getRequestType(), CreateApadjustment.class);
    }

}


