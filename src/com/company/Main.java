package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");
        Animal felis = new Animal("felis");
        Car BMW = new Car("BMW","Serie 3", "2008", "Grey","GLE NM44", "Dominik Keller");
        BMW.value = 50.0;
        Car BMW2 = new Car("BMW","Serie 3", "2014", "Black","GLE UA44", "Dominik Keller");
        BMW2.value = 100.0;
        Phone Iphone = new Phone("Apple","7", 2019,6.7,64);
        Phone Xiaomi = new Phone("Xiaomi","mi 11", 2021,6.67,64);


        Human student = new Human("Dominik","Keller","20");
        Human teacher = new Human("Marcin", "Keller","44");

        System.out.println(BMW);
        System.out.println(BMW2);
        System.out.println(student);
        System.out.println(teacher);
        System.out.println(Iphone);
        System.out.println(Xiaomi);
        System.out.println(felis);
        System.out.println(dog);



    }
}
