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

import org.mule.module.intacct.schema.request.Request;
import org.mule.module.intacct.schema.response.Response;

/**
 * Facade for Intacct's Connection layer
 */
public interface IntacctFacade
{

    /** executes an API operation synchronously */
    Response executeOperation(Request request);
}


