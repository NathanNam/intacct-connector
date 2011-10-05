
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

