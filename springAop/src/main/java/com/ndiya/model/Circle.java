package com.ndiya.model;

/**
 * Created by ndiyakholwa on 2016/01/20.
 */
public class Circle {

    private double radi;
    private double circumference;

    public void print() {
        System.out.println(String.format("Circle has radi: %s & circumference of: %s",
                this.radi, this.circumference));
    }

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }
}
