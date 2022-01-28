package com.company.device;

public abstract class Device {
    public String producer;
    public String model;
    public String yearOfProduction;
    public String colour;
    public String plates;
    public String owner;
    public Double engineVolume;

    public Device(String producer, String model, String yearOfProduction, String colour, String plates, String owner) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.colour = colour;
        this.plates = plates;
        this.owner = owner;
        this.engineVolume = 3.0;
    }
    public abstract void turnOn();

    public String toString(){
        return "";
    }
}


