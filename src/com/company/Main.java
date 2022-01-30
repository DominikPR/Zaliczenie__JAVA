package com.company;


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
        iphone.installAnApp("Gmail");
        iphone.installAnApp("Facebook", "v1_01");
        System.out.println("-----------------------------------------------------------");
        List<String> apps = new ArrayList<>();
        apps.add("GolfBattle");
        apps.add("8Ball");
        apps.add("HearthStone");
        iphone.installAnApp(apps);
        System.out.println("-----------------------------------------------------------");
        System.out.println(BMW.oil);
        BMW.Refuel();
        System.out.println(BMW.oil);
        System.out.println("--------------------------------");
        System.out.println(tesla.capacitance);
        tesla.Refuel();
        System.out.println(tesla.capacitance);
        System.out.println("--------------------------------");
        System.out.println(VW.gas);
        VW.Refuel();
        System.out.println(VW.gas);




    }
}
