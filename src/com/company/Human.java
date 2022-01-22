package com.company;

public class Human extends Animal{
    String firstname;
    String lastname;
    private Double salary;
    Animal pet;
    Human human;

    public Human(String species) {
        super(species);
    }


    public Double getSalary()
    {
        //sprawdzanie uprawnien
        //konwersje
        //pobieranie danych z bazy
        //pobranie z kesza
        //logi
        return salary;
    }

    public void setSalary (Double salary)
    {
        //sprawdzanie uprawnien
        //zapisanie do bazy danych
        //przygotowanie dokomentow
        this.salary = salary;

    }


}
