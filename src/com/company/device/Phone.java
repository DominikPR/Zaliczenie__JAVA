package com.company.device;

public class Phone extends Device{
    final String Producer;
    final String model;
    final String YearOfProduction;
    public String Colour;
    final String SizeScreen;
    final private String ramSize;


    public Phone(String producer,String model, String yearOfProduction, String sizeScreen, String ramSize,String Colour) {
        super(producer,model,yearOfProduction,sizeScreen,ramSize,Colour);

        this.Producer = producer;
        this.model = model;
        this.YearOfProduction = yearOfProduction;
        this.SizeScreen = sizeScreen;
        this.ramSize = ramSize;
        this.Colour = Colour;
    }



    public  String getRamSize(){
        return this.ramSize + "GB" ;
        }

    @Override
    public void turnOn() {
        System.out.println("Włączanie");
        System.out.println("Czarny ekran");
        System.out.println("Trwa ładowanie");
        System.out.println("...");
        System.out.println("Uruchomiono urządzenie, na ekranie pojawilo sie 'Witaj'");
    }

    @Override
    public String toString() {
        return "Phone" +
                "Producer= '" + Producer + '\'' +
                ", model= '" + model + '\'' +
                ", YearOfProduction= " + YearOfProduction +
                ", SizeScreen= " + SizeScreen +
                ", ramSize= " + ramSize +"GB";
    }
}

