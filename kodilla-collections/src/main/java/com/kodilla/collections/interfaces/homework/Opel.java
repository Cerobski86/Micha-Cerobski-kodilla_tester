package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int speed;


    public Opel(int speed) {
        this.speed = speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 12;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 10;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String getBrand() {
        return "Opel";
    }
}