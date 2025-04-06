package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4.2,5);
        Shape square = new Square(5.3);
        Shape triangle = new Triangle(1.5, 3,6,7);

        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle primeter: " + rectangle.perimeter());

        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Square primeter: " + square.perimeter());

        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle primeter: " + triangle.perimeter());
    }
}
