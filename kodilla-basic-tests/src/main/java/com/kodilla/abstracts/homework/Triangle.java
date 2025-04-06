package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private double base;
    private double height;
    private double sideA;
    private double sideB;

    public Triangle(double base, double height, double sideA, double sideB) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public double calculateArea() {
        return base*height*0.5;
    }
    @Override
    public double perimeter() {
        return base+sideA+sideB;
    }
}

