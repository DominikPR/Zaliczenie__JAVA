package com.company.device;


import com.company.salleable;
import com.company.creatures.Human;

import java.security.PublicKey;

public abstract class Device implements salleable {
    public String producer;
    public String model;
    public String yearOfProduction;
    public String colour;
    public String plates;
    public String owner;
    public Double engineVolume;
    public Double value;

    public Device(String producer, String model, String yearOfProduction, String colour, String plates, String owner) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.colour = colour;
        this.plates = plates;
        this.owner = owner;
        this.engineVolume = 3.0;
        this.value = 0.0;
    }

    public Device(String producer, String model, String yearOfProduction, String colour) {

    }

    public abstract void turnOn();

    public String toString(){
        return "";
    }

    @Override
    public void Sale(Human seller, Human buyer, Double price) {

    }
}


