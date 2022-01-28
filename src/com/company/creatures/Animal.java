package com.company.creatures;

import com.company.salleable;

public abstract class Animal implements salleable, Feedable {
    public static final double DEFAULT_DOG_WEIGHT = 10.0;
    public static final double DEFAULT_WEIGHT_FELIS = 2.0;
    public static final double DEFAULT_WEIGHT = 1.0;
    public static final double DEFAULT_FOOD_WEIGHT = 1.0;
    public Double weight;
    String species;
    public Boolean isAlive;


    public Animal(String species) {
        this.isAlive = true;
        this.species = species;
        if (this.species.equals("canis")) {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (this.species.equals("felis")) {
            this.weight = DEFAULT_WEIGHT_FELIS;
        } else {
            this.weight = DEFAULT_WEIGHT;
        }

    }

    public Animal() {

    }

    public void feed() {
        this.feed(DEFAULT_FOOD_WEIGHT);
        System.out.println("Zwierze zostalo nakarmione jedną porcją");
    }

    @Override
    public void feed(Double foodWeight) {
        if (this.isAlive) {
            this.weight += foodWeight;
            System.out.println("Dzięki za jedzenie :D ");
            System.out.println("Zwierze zostalo nakarmione, " + foodWeight + "kg");
        } else {
            System.out.println("too late :/");
        }
    }

    void takeForWalk() {
        if (this.isAlive) {
            this.weight -= 1;
            System.out.println("nice walk :)");
            if (this.weight <= 0) {
                this.isAlive = false;
            }

        } else {
            System.out.println("HALO POLICJA");
        }
    }


    @Override
    public void Sale(Human seller, Human buyer, Double price) {
         if (buyer.cash < price){
            System.out.println("Nie masz wystarczająco pieniędzy");
        } else if (seller.pet != this){
            System.out.println("Nie masz takiego zwierzęcia");
        } else if(seller.pet.species.equals("homo sapiens")){
            System.out.println("Nie można handlować ludzmi w Europie :(");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.pet = null;
            buyer.pet = this;
            System.out.println("Udalo sie sprzedac zwierze za " + price + " zł");
        }
    }


    public String toString() {
        return "Gatunek: " + species + " Waga: " + weight + " KG";
    }

}






