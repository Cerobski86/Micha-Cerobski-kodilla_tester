package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[15];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }

    private static Car drawCar() {
        int drawnBrand = RANDOM.nextInt(3);
        int speed = RANDOM.nextInt(100);
        if (drawnBrand == 0) {
            return new Ford(speed);
        } else if (drawnBrand == 1) {
            return new Opel(speed);
        } else {
            return new Toyota(speed);
        }
    }
}