package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");

        Car BMW = new Car("BMW","Serie 3", "2008", "Grey","GLE NM44", "Dominik Keller");
        Car BMW2 = new Car("BMW","Serie 3", "2014", "Black","GLE UA44", "Dominik Keller");
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
        System.out.println(BMW.colour);
        System.out.println(BMW.plates);
        System.out.println(BMW.owner);

        System.out.println(BMW2.model);
        System.out.println(BMW2.producer);
        System.out.println(BMW2.YearOfProduction);
        System.out.println(BMW2.colour);
        System.out.println(BMW2.plates);
        System.out.println(BMW2.owner);


        System.out.println(Iphone.getRamSize());

    }
}
