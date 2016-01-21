package com.ndiya.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.JoinPoint;

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
    public void logBeforeAdvice(JoinPoint joinPoint) {
        System.out.println("Logging @Before from advice. " + joinPoint.toString());
    }

    /**
     * <p>
     *   After returning advice: Advice to be executed after
     *   a join point completes normally: for example, if a
     *   method returns without throwing an exception.
     *
     *   N.B You cannot modify  {@code returnValue}
     * </p>
     */
    @AfterReturning(pointcut = "execution( String get*())", returning = "returnValue")
    public void logBeforeWildcardAdvice(String returnValue) {
        System.out.println("Logging @AfterReturning(\"execution( String" +
                " get*())\") from advice. " + returnValue);
    }

    /**
     * <p>
     *   After throwing advice: Advice to be executed
     *   if a method exits by throwing an exception.
     * </p>
     */
    @AfterThrowing(pointcut = "withinPointcut()", throwing = "ex")
    public void logAfterThrowingAdvice(Exception ex) {
        System.out.println("Logging @AfterThrowing(\"within(com.ndiya.model))\") from advice. " + ex.getMessage());
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

    /**
     * <p>
     *   {@code args} sequence must match bellow and calling joinPoint
     *   i.e. The calling function which is being advised.
     * </p>
     * @param make
     * @param speed
     * @param count
     */
    @After("args(make, speed, count)")
    public void logMultiArgsAdvice(String make, String speed, int count) {
        System.out.println(String.format("Logging %s from @After advice. Count %s & Speed %s", make, count, speed));
    }

    @Around("allGetters()")
    private Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {

        Object returnVal = null;
        try {
            System.out.println("Before advice.");
            returnVal = proceedingJoinPoint.proceed(); // execute join point (method)
            System.out.println("After returning.");
        } catch (Throwable throwable) {
            System.out.println("After throwing.");
            throwable.printStackTrace();
        }
        System.out.println("After Finally.");
        return returnVal;
    }
    /**
     * Example pointcuts.
     */
    @Pointcut("execution( String get*())")
    private void allGetters(){}

    @Pointcut("execution(public * *(..))")
    private void anyPublicOperation() {}

    @Pointcut("within(com.xyz.someapp.trading..*)")
    private void inTrading() {}

    @Pointcut("anyPublicOperation() && inTrading()")
    private void tradingOperation() {}
}
