package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }
    @Override
    public double perimeter() {
        return 2 * width + 2 * height;
    }
}
