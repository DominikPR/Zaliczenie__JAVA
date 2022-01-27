package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");

        Car BMW = new Car("BMW","Serie 3", "2008", "Grey","GLE NM44", "Dominik Keller");
        BMW.value = 50.0;
        Car BMW2 = new Car("BMW","Serie 3", "2014", "Black","GLE UA44", "Dominik Keller");
        BMW2.value = 100.0;
        Phone Iphone = new Phone("Apple","7", 2019,6.7,64);


        Human student = new Human("Dominik","Keller");
        Human teacher = new Human("Marcin", "Keller");

        student.setCar(BMW);
        student.setSalary(50.0);
        student.setCar(BMW);
        student.setSalary(200.0);
        student.setCar(BMW);


        student.setCar(BMW2);
        student.setSalary(50.0);
        student.setCar(BMW2);
        student.setSalary(200.0);
        student.setCar(BMW2);


    }
}
