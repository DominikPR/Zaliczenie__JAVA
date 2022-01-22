package com.company;

public class Phone {
    final String Producer;
    final String model;
    final Integer YearOfProduction;
    String os;
    String Colour;
    final Double SizeScreen;
    final private Integer ramSize;


    public Phone(String producer, String model, Integer yearOfProduction, Double sizeScreen, Integer ramSize) {
        this.Producer = producer;
        this.model = model;
        this.YearOfProduction = yearOfProduction;
        this.SizeScreen = sizeScreen;
        this.ramSize = ramSize;
    }

    public Phone(String producer, String model, Integer yearOfProduction, String os, String colour, Double size, Double sizeScreen, Integer ramSize) {
        this.Producer = producer;
        this.model = model;
        this.YearOfProduction = yearOfProduction;
        this.os = os;
        this.Colour = colour;
        this.SizeScreen = sizeScreen;
        this.ramSize = ramSize;
    }

        public  String getRamSize(){
        return this.ramSize + "GB" ;
        }

    @Override
    public String toString() {
        return "Phone{" +
                "Producer='" + Producer + '\'' +
                ", model='" + model + '\'' +
                ", YearOfProduction=" + YearOfProduction +
                ", os='" + os + '\'' +
                ", Colour='" + Colour + '\'' +
                ", SizeScreen=" + SizeScreen +
                ", ramSize=" + ramSize +
                '}';
    }
}
