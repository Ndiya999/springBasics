package com.ndiya.xml.config;

/**
 * Created by ndiyakholwa on 2016/01/24.
 */
public class Engine {
    private double capacity;
    private int cylinders;
    private String manufacturer;


    public void print(){
        System.out.println(String.format("Printing engine with %s cylinders," +
                        " %sL capacity & manufactured by %s",
                this.cylinders, this.capacity, this.manufacturer));
    }

    public String toString(){
        return String.format("V%s made by: %s", this.cylinders, this.manufacturer);
    }
    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
