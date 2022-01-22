package com.company;

public class Car {

    final String producer;
    final String model;
    final Integer YearOfProduction;
    String colour;
    Double engineVolume;
    String Plates;

    public Car(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        YearOfProduction = yearOfProduction;
    }
    public String toString(){
        return "Producent: " + this.producer+ " model: "+ this.model + " rok produkcji: "+ this.YearOfProduction;
    }

}
