package com.ndiya.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by ndiyakholwa on 2016/01/20.
 */
@Aspect
public class LoggingAspect {

    /**
     * <p>
     *   Before advice: Advice that executes before a
     *   join point, but which does not have the ability
     *   to prevent execution flow proceeding to the join
     *   point (unless it throws an exception).
     * </p>
     */
    @Before("execution(public void print())")
    public void logBeforeAdvice() {
        System.out.println("Logging @Before from advice.");
    }

    /**
     * <p>
     *   After returning advice: Advice to be executed after
     *   a join point completes normally: for example, if a
     *   method returns without throwing an exception.
     * </p>
     */
    @AfterReturning("execution( String get*())")
    public void logBeforeWildcardAdvice() {
        System.out.println("Logging @Before(\"execution( String get*())\") from advice. ");
    }

    /**
     * <p>
     *   After throwing advice: Advice to be executed
     *   if a method exits by throwing an exception.
     * </p>
     */
    @AfterThrowing("withinPointcut()")
    public void logAfterThrowingAdvice() {
        System.out.println("Logging @AfterThrowing(\"within(com.ndiya.model))\") from advice. ");
    }

    @Pointcut("within(com.ndiya.model.*)")
    public void withinPointcut(){}

    /**
     * <p>
     *  After (finally) advice: Advice to be executed
     *  regardless of the means by which a join point
     *  exits (normal or exceptional return).
     * </p>
     * @param make
     */
    @After("args(make)")
    public void logMakeAdvice(String make) {
        System.out.println(String.format("Logging %s from @After advice.", make));
    }
}
