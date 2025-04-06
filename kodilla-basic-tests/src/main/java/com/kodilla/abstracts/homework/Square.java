package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private double side;
    public Square( double side ) {
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }
    @Override
    public double perimeter() {
        return 4 * side;
    }

}
