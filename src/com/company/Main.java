package com.company;


import com.company.creatures.Human;
import com.company.device.Diesel;
import com.company.device.Electric;
import com.company.device.LPG;
import com.company.device.Phone;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {



        Diesel BMW = new Diesel("BMW", "Seria 3", "2014", "Black");
        Electric tesla = new Electric("Tesla", "v1", "2020", "White");
        LPG VW = new LPG("Volkswagen", "golf 5", "2009", "Black");
        Phone iphone = new Phone("Iphone","11","2021","6.7","64","Black");

        BMW.value = 60000.0;
        tesla.value = 100000.0;
        VW.value = 100.0;

        Human student = new Human();
        Human teacher = new Human();
        Human dziekan = new Human();

        student.addCar(BMW);
        student.addCar(tesla);
        student.addCar(VW);
        student.addCar(BMW);
        student.addCar(tesla);
        student.removeCar(BMW);
        student.addCar(BMW);
        System.out.println(student.hasCar(BMW));
        System.out.println(student.getGarageValue());
        teacher.addCar(BMW);
        teacher.addCar(tesla);
        teacher.addCar(VW);
        student.addCar(BMW);
        System.out.println("----------------------------------");
        BMW.Sale(student, teacher, 500.0);
        System.out.println("----------------------------------");
        teacher.cash = 10000.0;
        System.out.println("Ilosc pieniedzy w portfelu przed kupnem nauczyciel " + teacher.cash);
        System.out.println("Ilosc pieniedzy w portfelu przed kupnem student " + student.cash);
        tesla.Sale(student,teacher,500.0);
        System.out.println("Ilosc pieniedzy w portfelu po zakupie nauczyciel " + teacher.cash);
        System.out.println("Ilosc pieniedzy w portfelu po zakupie student " + student.cash);
        System.out.println("----------------------------------");
        BMW.Sale(dziekan, student, 500.0);
        System.out.println("----------------------------------");
        student.cash = 1000.0;
        BMW.Sale(teacher, student, 600.0);
        System.out.println("----------------------------------");
        dziekan.cash = 20000.0;
        BMW.Sale(student, dziekan, 800.0);




    }
}
