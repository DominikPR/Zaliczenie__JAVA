package com.company.device;

public class LPG extends Car{
    public LPG(String producer, String model, String yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);

    }

    @Override
    public void Refuel() {
        this.gas  = 60.0;
        System.out.println("Napelniono zbiornik gazem w samochodzie " + gas + " l");
    }
}
