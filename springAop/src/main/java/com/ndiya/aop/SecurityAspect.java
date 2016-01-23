package com.ndiya.aop;

/**
 * Created by ndiyakholwa on 2016/01/22.
 */
public class SecurityAspect {

    public void logMakeAdvice(String make) {
        System.out.println(String.format("Logging %s from xml SecurityAspect. ", make));
    }

    public void xmlConf() {
        System.out.println("XML");
    }
}
