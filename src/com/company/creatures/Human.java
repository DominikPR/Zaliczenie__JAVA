package com.company.creatures;

import com.company.device.Car;
import com.company.device.Phone;

public class Human extends Animal {
    public String firstname;
    public String lastname;
    private Double salary;
    public Car car;
    public Double age;
    public Phone mobile;
    public Animal pet;
    public Human human;
    public Double cash;


    public Human() {
        super("homosapiens");
        this.firstname = "";
        this.lastname = "lastname";
        this.age = 0.0;
        this.salary = 0.0;
        this.cash = 0.0;
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


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (salary > car.value) {
            this.car = car;
            System.out.println("Udało sie kupić auto za gotówkę :D");
        } else if (salary > (car.value / 12)) {
            this.car = car;
            System.out.println("Udało się kupić auto na kredyt (no trudno :/ )");
        } else {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }


    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }
    public Animal getPet() {
        return pet;
    }


    public String toString(){
        return "Imie: " + firstname + " Nazwisko: " + lastname + " Wiek: " + age;
    }
}
