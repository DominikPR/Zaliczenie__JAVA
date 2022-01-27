package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");

        Car BMW = new Car("BMW","Serie 3", "2008", "Grey","GLE NM44", "Dominik Keller");
        Car BMW2 = new Car("BMW","Serie 3", "2014", "Black","GLE UA44", "Dominik Keller");
        Phone Iphone = new Phone("Apple","7", 2019,6.7,64);


        Human student = new Human("Dominik","Keller");
        Human teacher = new Human("Marcin", "Keller");

        student.setSalary(0.0);
        System.out.println(student.getSalary());
        student.setSalary(-1.0);
        System.out.println(student.getSalary());
        student.setSalary(100.0);
        System.out.println(student.getSalary());

    }
}
