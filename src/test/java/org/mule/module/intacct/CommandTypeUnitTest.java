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


