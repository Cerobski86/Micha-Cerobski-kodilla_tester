package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {
    private int speed;

    public Toyota(int speed) {
        this.speed = speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 20;
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
        return "Toyota";
    }
}