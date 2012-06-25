/**
 * Mule Intacct Cloud Connector
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package org.mule.module.intacct.config;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.processor.InvokerMessageProcessor;

import java.lang.reflect.Field;

import org.apache.commons.lang.UnhandledException;
import org.apache.commons.lang.Validate;

/**
 * <p>
 * Extension of {@link InvokerMessageProcessor} that enables resolving the evaluation
 * of expressions in DTO objects (not just {@link Collection}, {@link Map} and {@link String}).
 * </p>
 * <p>
 * Use this implementation with DTOs: the implementation visit all the DTO tree trying
 * to evaluate any expression available.
 * </p> 
 */
public class DTOEvaluationInvokerMessageProcessor extends InvokerMessageProcessor
{
    private final Package dtoPackage;
    
    /** @param dtoPackage DTOs java package */
    public DTOEvaluationInvokerMessageProcessor(final Package dtoPackage) 
    {
        Validate.notNull(dtoPackage);
        
        this.dtoPackage = dtoPackage;
    }
    
    @Override
    protected Object evaluateExpressionCandidate(final Object expressionCandidate, final MuleMessage message)
        throws TransformerException
    {
        final Object after = super.evaluateExpressionCandidate(expressionCandidate, message);
        // if super don't know how to handle this, we try handle
        if (after == expressionCandidate && after != null && dtoPackage.equals(after.getClass().getPackage())) 
        {
            evaluate(after, message);
        }
        return after;
    }
    
    /** Recursive evaluation */
    protected void evaluate(final Object o, final MuleMessage message) throws TransformerException 
    {
        for (final Field field : o.getClass().getDeclaredFields()) 
        {
            try 
            {
                field.setAccessible(true);
                final Object before = field.get(o);
                final Object after = super.evaluateExpressionCandidate(before, message);
                if (after == before && after != null && dtoPackage.equals(after.getClass().getPackage())) 
                {
                    evaluate(after, message);
                    
                }
                else 
                {
                    field.set(o, after);
                }
            }
            catch (final IllegalArgumentException e)
            {
                throw new UnhandledException(e);
            }
            catch (final IllegalAccessException e)
            {
                throw new UnhandledException(e);
            } 
            finally 
            {
                field.setAccessible(false);
            }
        }
    }
}
