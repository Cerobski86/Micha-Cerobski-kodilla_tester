package com;

public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2020);
        System.out.println( notebook.price + "$" + " " + notebook.weight + "g" + "  " + notebook.year + "year of production");
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook(2000,  1500, 2023);
        System.out.println( heavyNotebook.price + "$" + " " + heavyNotebook.weight + "g"+ " " + heavyNotebook.year + "year of production");
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(1200, 500, 2018);
        System.out.println( oldNotebook.price + "$" + " " + oldNotebook.weight + "g" + " " + oldNotebook.year + "year of production" );
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();
    }
}