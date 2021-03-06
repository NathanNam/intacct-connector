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

import org.mule.module.intacct.schema.request.Exchrate;
import org.mule.module.intacct.schema.request.Exchratedate;
import org.mule.module.intacct.schema.request.Exchratetype;

/**
 * Diferents types of saving an exchange rate.
 * @author Gaston Ponti
 */

public enum ExchType implements EnumType
{
    /**
     * Exchange rate that represents a date.
     */
    ExchRateDate(Exchratedate.class),
    
    /**
     * Exchange rate type
     */
    ExchRateType(Exchratetype.class),
    
    /**
     * Exchange rate
     */
    ExchRate(Exchrate.class);
    
    private Class<?> requestType;

    private ExchType(Class<?> requestType)
    {
        this.requestType = requestType;
    }

    @Override
    public Class<?> getRequestType()
    {
        return requestType;
    }
}

