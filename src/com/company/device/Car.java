package com.company.device;

import com.company.creatures.Human;

import java.util.Comparator;

public abstract class Car extends Device{

    public final String producer;
    public final String model;
    public final String YearOfProduction;
    public Double value;
    public Double engineVolume;
    public String colour;
    String plates;
    public Double oil;
    public Double capacitance;
    public Double gas;

    public Car(String producer, String model, String yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);
        this.producer=producer;
        this.model = model;
        this.YearOfProduction = yearOfProduction;
        this.engineVolume = 1.9;
        this.value = 0.0;
        this.plates = "GLE NM44";
        this.oil = 0.0;
        this.capacitance = 0.0;
        this.gas = 0.0;
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

    @Override
    public void Sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price){
            System.out.println("Nie masz wystarczająco pieniędzy");
        } else if (seller.hasCar(this)){
            System.out.println("Nie pij więcej przecież samochodu nie masz!");
        }
        else if (buyer.hasFreeSpace())
        {
            System.out.println("Nie masz miejsca w garażu");
        }
        else{
            seller.cash += price;
            buyer.cash -= price;
            seller.removeCar(this);
            buyer.addCar(this);
            System.out.println("Udalo sie sprzedac samochód za " + price + " zł");
        }
    }

    public abstract void Refuel();
}
