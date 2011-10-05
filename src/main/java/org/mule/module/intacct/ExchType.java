
	
	/*
	 * Copyright (c) 2011 Zauber S.A.  -- All rights reserved
	 */
	
	package org.mule.module.intacct;

import org.mule.module.intacct.schema.request.Exchrate;
import org.mule.module.intacct.schema.request.Exchratedate;
import org.mule.module.intacct.schema.request.Exchratetype;

/**
 * 
 * @author Gaston Ponti
 * @since Sep 28, 2011
 */

public enum ExchType implements EnumType
{
    ExchRateDate(Exchratedate.class),
    ExchRateType(Exchratetype.class),
    ExchRate(Exchrate.class);
    
    private Class<?> requestType;

    private ExchType(Class<?> requestType){
        this.requestType = requestType;
    }

    @Override
    public Class<?> getRequestType()
    {
        return requestType;
    }
}

	