package com.company.creatures;

import com.company.device.Car;
import com.company.device.Phone;

import java.util.Arrays;

public class Human extends Animal {
    public String firstname;
    public String lastname;
    private Double salary;
    public Car[] garage;
    public Double age;
    public Phone mobile;
    public Animal pet;
    public Human human;
    public Double cash;
    private static final int DEFAULT_GARAGE_SIZE = 5;


    public Human() {
        super("homosapiens");
        this.firstname = "";
        this.lastname = "lastname";
        this.age = 0.0;
        this.salary = 0.0;
        this.cash = 0.0;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }


    public Double getSalary() {

        return salary;
    }

    public void setSalary(Double salary) {
        if (salary <= 0) {
            System.out.println("Lepiej zatrudnić się w bedronce niż robić za darmo");
        } else {
            System.out.println("Nowe dane zostaly wyslane do systemu ksiegowego");
            System.out.println("Proszę odebrac aneks od Pani Hani w dziale kadr");
            System.out.println("ZUS i US został poinformowany o zmianie wypłaty, nie ma sensu ukrywać dochodu :)");
            this.salary = salary;
        }

    }


    public Car getCar(Integer space) {

        return garage[space];
    }

    public void setCar(Car car, Integer space) {
        if (salary > car.value) {
           if (garage[ space ] != null) {
               this.garage[space] =car;
               System.out.println("Udało sie kupić auto za gotówkę :D");
           }

           else {
               System.out.println("To miejsce w garażu jest zajęte :(");
           }

        } else if (salary > (car.value / 12)) {
            this.garage[space] = car;
            System.out.println("Udało się kupić auto na kredyt (no trudno :/ )");
        }
        else {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }


    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }
    public Animal getPet() {
        return pet;
    }

    public boolean hasCar(Car newCar) {
        for (Car car : this.garage) {
            if (car != null && car.equals(newCar)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFreeSpace() {
        for (Car car : this.garage) {
            if (car != null) {
                return true;
            }
        }
        return false;
    }

    public void removeCar(Car car) {
        for(int i = 0; i < this.garage.length; i++){
            if(this.garage[i] == car){
                this.garage[i] = null;
                i = this.garage.length;
                System.out.println("Usunieto samochod " + car + " z garazu");
            }else{
                System.out.println("Nie masz takiego auta w garazu");
            }
        }
    }

    public void addCar(Car car) {
        Integer space = 0;
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = car;
                System.out.println("Dodano auto do garazu w miejsce nr: " + i);
                i = this.garage.length;
            }else{
                if(i == this.garage.length - 1){
                    System.out.println("Nie masz miejsca w garazu");
                }
            }
        }

    }

    public Double getGarageValue(){
        Double totalValue = 0.0;
        for (Car car : this.garage) {
            if (car != null) {
                totalValue += car.value;
            }
        }
        System.out.println("Łączna wartość samochodow w garazu:");
        return totalValue;
    }


    public String toString(){
        return "Imie: " + firstname + " Nazwisko: " + lastname + " Wiek: " + age;
    }
}
