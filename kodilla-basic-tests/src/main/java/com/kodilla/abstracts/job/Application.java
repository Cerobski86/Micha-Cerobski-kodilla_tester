package com.kodilla.abstracts.job;

public class Application {
    public static void main(String[] args) {
        Person edyta = new Person("Edyta", 28, new Teacher());
        Person john = new Person("John", 32, new Engineer());
        Person katarzyna = new Person("Katarzyna", 24, new Hairdresser());
        Person tomek = new Person("Tomek", 40, new Mechanic());
        Person bob = new Person("Bob", 30, new Warehouseman());

        edyta.showResponsibilities();
        john.showResponsibilities();
        katarzyna.showResponsibilities();
        tomek.showResponsibilities();
        bob.showResponsibilities();
    }
}