package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Toyota toyota = (Toyota) o;
        return speed == toyota.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(speed);
    }
}