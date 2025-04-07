package com;

public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1001) {
            System.out.println("This price is good.");
        } else {
            System.out.println("This notebook is quite expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This device is light.");
        } else if (this.weight > 700 && this.weight <= 2000) {
            System.out.println("This device is not very light.");
        } else {
            System.out.println("This device is heavy");
        }
    }

    public void checkYearAndPrice() {
        if (this.price > 1400 && this.year > 2022) {
            System.out.println("This is a modern and expensive notebook.");
        } else if (this.price <= 600 && this.year < 2020) {
            System.out.println("This is an old and cheap notebook.");
        } else {
            System.out.println("This notebook has god price for its year.");
        }
    }
}