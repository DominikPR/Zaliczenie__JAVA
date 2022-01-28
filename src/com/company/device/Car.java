package com.company.device;

public class Car extends Device{

    final String producer;
    final String model;
    final String YearOfProduction;
    public Double value;
    public Double engineVolume;
    String colour;
    String plates;
    String owner;

    public Car(String producer, String model, String yearOfProduction, String colour, String plates,String owner){
        super(producer,model,yearOfProduction,colour,plates,owner);
        this.producer = producer;
        this.model = model;
        YearOfProduction = yearOfProduction;
        this.colour = colour;
        this.plates = plates;
        this.owner = owner;
        this.value = 0.0;
        this.engineVolume = 3.0;
    }

    @Override
    public void turnOn() {
        System.out.println("Wkładam kluczyk do auta");
        System.out.println("Wciskam przycisk Start Stop i sie odpala ");
        System.out.println("Chodzi na wolnych obrotach");
    }

    @Override
    public String toString(){
        return "Producent: " + this.producer+ " model: "+ this.model + " rok produkcji: "+ this.YearOfProduction+ "Kolor: " + this.colour + "Tablice rejestracyjne: "+this.plates;
    }

}
