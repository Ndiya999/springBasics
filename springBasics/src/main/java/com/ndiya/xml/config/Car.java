package com.ndiya.xml.config;

/**
 * Created by ndiyakholwa on 2016/01/24.
 */
public class Car {
    private Engine eng;
    private String make;
    private String model;
    private int maxSpeed;

    /**
     * Implemented using {@code constructor-arg} with {@code type} attrib.
     * @param eng
     * @param model
     * @param maxSpeed
     */
    public Car(Engine eng, String model, int maxSpeed) {
        this.eng = eng;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Implemented using {@code constructor-arg} with {@code index} attrib.
     * @param eng
     * @param maxSpeed
     * @param model
     */
    public Car(Engine eng, int maxSpeed, String model) {
        this.eng = eng;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    /**
     * Default constructor
     */
    public Car(){/*Do nothing...*/}

    public void drive(){
        System.out.println(String.format("Driving an %s with engine: %s at %skm/s", this.model, eng.toString(), this.maxSpeed));
    }

    public Engine getEng() {
        return eng;
    }

    public void setEng(Engine eng) {
        this.eng = eng;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


}
