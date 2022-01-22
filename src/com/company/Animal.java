package com.company;

public class Animal {
    public static final double DEFAULT_DOG_WEIGHT = 10.0;
    public static final double DEFAULT_WEIGHT_FELIS = 2.0;
    public static final double DEFAULT_WEIGHT = 1.0;
    final String species;
    Double weight;
    String name;
    Boolean isAlive;


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

    void feed() {
        if (this.isAlive) {

            this.weight += 1;
            System.out.println("thx for food");

        } else {
            System.out.println("too late");
        }
    }

    void takeForWalk() {
        if (this.isAlive) {
            this.weight-=1;
            System.out.println("nice walk");
            if (this.weight <= 0 )
            {
                this.isAlive = false;
            }

        }
    else {



            System.out.println("HALO POLICE");



            }
        }


}




