package com.company;

import com.company.creatures.Human;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;

public class Main {

    public static void main(String[] args) {

        /*
        Animal dog = new Animal("dog");
        Animal felis = new Animal("felis");
        Car BMW = new Car("BMW","Serie 3", "2008", "Grey","GLE NM44", "Dominik Keller");
        BMW.value = 50.0;
        Car BMW2 = new Car("BMW","Serie 3", "2014", "Black","GLE UA44", "Dominik Keller");
        BMW2.value = 100.0;
        Phone Iphone = new Phone("Apple","7", "2019","6.7","64","Black");
        Phone Xiaomi = new Phone("Xiaomi","mi 11", "2021","6.67","64","Black");


        Human student = new Human("Dominik","Keller","20");
        Human teacher = new Human("Marcin", "Keller","44");

        Animal homoSapiens = new Animal("homo sapiens");
        */
        Human student = new Human();
        Human teacher = new Human();
        Human homoSapiens = new Human();
        Pet cat = new Pet("Kot");
        Pet dog = new Pet("Pies");
        FarmAnimal cow = new FarmAnimal("Krowa");
        FarmAnimal pig = new FarmAnimal("Świnia");

        System.out.println("Krowa");
        cow.beEaten();
        cow.beEaten();

        System.out.println("Kot");
        cat.feed();
        cat.feed(15.0);

        System.out.println("Pies" );
        dog.feed(12.0);
        System.out.println("Świnia");
        pig.beEaten();
        pig.beEaten();





    }
}
