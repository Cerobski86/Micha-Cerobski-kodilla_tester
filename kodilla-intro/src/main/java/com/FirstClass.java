package com;

public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2020);
        notebookParameters(notebook, "  ");

        Notebook heavyNotebook = new Notebook(2000,  1500, 2023);
        notebookParameters(heavyNotebook, " ");

        Notebook oldNotebook = new Notebook(1200, 500, 2018);
        notebookParameters(oldNotebook, " ");
    }

    private static void notebookParameters(Notebook notebook, String spaces) {
        System.out.println(notebook.price + "$" + " " + notebook.weight + "g" + spaces + notebook.year + "year of production");
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();
    }
}