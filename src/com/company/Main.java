package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");

        Car BMW = new Car("BMW","SERIE 3",2008);
        Phone Iphone = new Phone("Apple","7", 2019,6.7,64);


        dog.feed();
        dog.feed();
        dog.feed();
        dog.takeForWalk();
        System.out.println(dog.species);
        System.out.println(dog.weight);

        System.out.println(BMW.model);
        System.out.println(BMW.producer);
        System.out.println(BMW.YearOfProduction);
        System.out.println(BMW);
        System.out.println(Iphone.getRamSize());
    }
}
