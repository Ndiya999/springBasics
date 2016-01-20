package com.ndiya.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by ndiyakholwa on 2016/01/20.
 */
@Aspect
public class LoggingAspect {

    @Before("execution(public void print())")
    public void log() {
        System.out.println("Loggin from aspect");
    }
}
