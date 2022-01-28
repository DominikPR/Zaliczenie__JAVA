package com.company;

import com.company.device.Car;
import com.company.device.Phone;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

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



        dog.Sale(student,teacher, 15.0);
        student.pet = dog;
        teacher.cash=500000.0;
        dog.Sale(student,teacher,50.0);
        felis.Sale(student,teacher,20.0);
        student.pet = homoSapiens;
        System.out.println("----------------------------------------");
        homoSapiens.Sale(student,teacher,20.0);
        System.out.println("----------------------------------------");
        student.mobile=Iphone;
        Iphone.Sale(student,teacher,10.0);
        student.car = BMW;
        System.out.println("----------------------------------------");
        System.out.println("Student posiada takie auta: "+ student.car );
        System.out.println("Nauczyciel posiada takie auta: "+ teacher.car );
        System.out.println("----------------------------------------");

        System.out.println("Studenta pieniądze przed sprzedarzą: "+ student.cash + "zł");
        System.out.println("----------------------------------------");

        BMW.Sale(student,teacher,100.0);
        System.out.println("----------------------------------------");

        System.out.println("Studenta pieniądze po sprzedarzy: "+ student.cash + "zł");
        System.out.println("----------------------------------------");
        System.out.println("Student posiada takie auta: "+ student.car );
        System.out.println("Nauczyciel posiada takie auta: "+ teacher.car );
        System.out.println("----------------------------------------");




    }
}
