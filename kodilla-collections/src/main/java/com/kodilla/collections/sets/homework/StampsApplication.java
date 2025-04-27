package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();

        stamps.add(new Stamp("Monn 2025", 2.5, 3.5, true));
        stamps.add(new Stamp("France 1998", 2.0, 2.8, true));
        stamps.add(new Stamp("Merlin Manson 2017", 2.5, 3.4, false));
        stamps.add(new Stamp("London", 2.0, 2.8, false));
        stamps.add(new Stamp("France 1998", 2.0, 2.8, true));

        System.out.println("Entire collection: ");
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
        System.out.println(stamps.size());
    }
}