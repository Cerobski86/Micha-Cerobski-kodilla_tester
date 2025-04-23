package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Ford implements Car {
    private int speed;

    public Ford(int speed) {
        this.speed = speed;
    }

    public void increaseSpeed() {
        speed = speed + 15;
    }

    public void decreaseSpeed() {
        speed = speed - 10;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return speed == ford.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(speed);
    }

    public String getBrand() {
        return "Ford";
    }
}