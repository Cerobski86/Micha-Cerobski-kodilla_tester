package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

public class CarListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Opel opel = new Opel(100);
        Ford ford = new Ford(120);
        Toyota toyota = new Toyota(140);

        cars.add(opel);
        cars.add(toyota);
        cars.add(ford);

        cars.remove(1);
        cars.remove(opel);

        System.out.println(cars.size());
        for (Car car : cars)
            CarUtils.describeCar(car);
    }
}