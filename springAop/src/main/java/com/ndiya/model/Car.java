package com.ndiya.model;

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
    private void stop() {
        System.out.println("Car stopped !!");
    }

    public void throwException() {
        String i = null;
        if(i == null) {
            throw new NullPointerException("Car has no brakes !!");
        }
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
