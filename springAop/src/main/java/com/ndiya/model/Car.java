package com.ndiya.model;

import com.ndiya.aop.Loggable;

/**
 * Created by ndiyakholwa on 2016/01/20.
 */
public class Car {
    private String model;
    private String make;
    private String maxSpead;

    public void drive() {
        System.out.println(String.format("Driving car model: %s at spead: %s", this.make, this.maxSpead));
    }
    public String stop(String make) {
        return String.format("The car: %s has stopped.", make);
    }

    public void multiArgs(String make, String speed, int count) {
        System.out.println(String.format("The car: %s has count: %s and Speed: %s",
                make, count, speed));

    }

    public void throwException() {
        String i = null;
        if(i == null) {
            throw new NullPointerException("Car has no brakes !!");
        }
    }

    /**
     * <p>
     *   This method is advised by an advice that makes use
     *   of the @annotation pointcut contruct.
     * </p>
     */
    @Loggable
    public void annotatedJoinpoint() {
        System.out.println("Annotted Joinpoint.");
    }

    public void xmlJoinpoint() {
        System.out.println("XML config Joinpoint.");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaxSpead() {
        return maxSpead;
    }

    public void setMaxSpead(String maxSpead) {
        this.maxSpead = maxSpead;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
