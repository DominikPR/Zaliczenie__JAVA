package com.company;

public class Car {

    final String producer;
    final String model;
    final String YearOfProduction;
    public Double value;
    String colour;
    String plates;
    String owner;

    public Car(String producer, String model, String yearOfProduction, String colour, String plates,String owner){
        this.producer = producer;
        this.model = model;
        YearOfProduction = yearOfProduction;
        this.colour = colour;
        this.plates = plates;
        this.owner = owner;
        this.value = 0.0;
    }
    public String toString(){
        return "Producent: " + this.producer+ " model: "+ this.model + " rok produkcji: "+ this.YearOfProduction+ "Kolor: " + this.colour + "Tablice rejestracyjne: "+this.plates;
    }

}
