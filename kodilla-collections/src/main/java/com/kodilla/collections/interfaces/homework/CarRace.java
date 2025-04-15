package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car ford = new Ford(0);
        showCarDetails(ford);

        Car opel = new Opel(0);
        showCarDetails(opel);

        Car toyota = new Toyota(0);
        showCarDetails(toyota);
    }

    public static void showCarDetails(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getBrand());
        System.out.println("Current speed: " + car.getSpeed());
    }
}