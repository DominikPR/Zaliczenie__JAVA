package com.company.device;

public class Diesel extends Car{
    public Diesel(String producer, String model, String yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);
    }

    @Override
    public void Refuel() {
        this.oil  = 60.0;
        System.out.println("Zalano samochod z olejem napedowym " + oil + " l");
    }
}
