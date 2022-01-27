package com.company;
public class Human extends Animal{
    public String firstname;
    public String lastname;
    private Double salary;
    public Car car;
    Phone mobile;
    Animal pet;
    Human human;


    public Human(String firstname, String lastname){
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = 0.0;
    }


    public Double getSalary()
    {

        return salary;
    }

    public void setSalary (Double salary)
    {
        if(salary <= 0){
            System.out.println("Lepiej zatrudnić się w bedronce niż robić za darmo");
        }else{
            System.out.println("Nowe dane zostaly wyslane do systemu ksiegowego");
            System.out.println("Proszę odebrac aneks od Pani Hani w dziale kadr");
            System.out.println("ZUS i US został poinformowany o zmianie wypłaty, nie ma sensu ukrywać dochodu :)");
            this.salary = salary;
        }

    }


}
