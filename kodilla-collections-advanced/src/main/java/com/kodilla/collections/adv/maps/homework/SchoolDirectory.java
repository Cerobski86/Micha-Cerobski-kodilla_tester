package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolMap = new HashMap<>();

        Principal p1 = new Principal("Danuta", "Wyrwal");
        Principal p2 = new Principal("Tomasz", "Kowalski");
        Principal p3 = new Principal("Daniel", "Malinowski");
        Principal p4 = new Principal("Ewa", "Listek");

        School sp2 = new School("Szkoła Podstawowa nr 2", 28, 22, 29, 25);
        School sp3 = new School("Szkoła Podstawowa nr 3", 26, 27, 25, 23);
        School sp4 = new School("Szkoła Podstawowa nr 4", 22, 23, 22, 24);
        School sp5 = new School("Szkoła Podstawowa nr 5", 29, 28, 29, 28);

        schoolMap.put(p1, sp2);
        schoolMap.put(p2, sp3);
        schoolMap.put(p3, sp4);
        schoolMap.put(p4, sp5);

        for (Map.Entry<Principal, School> entry : schoolMap.entrySet()) {
            System.out.println("Principal : " + entry.getKey().toString());
            System.out.println("School :" + entry.getValue().toString());
        }
    }
}