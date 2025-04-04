package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int releaseYear;

    public OperatingSystem(int releaseYear) {
        this.releaseYear = releaseYear;
        System.out.println("System release year: " + releaseYear);
    }
    public void turnOn() {
        System.out.println("System is turn on");
    }
    public void turnOff() {
        System.out.println("System is turn off");
    }
    public int getReleaseYear() {
        return releaseYear;
    }
public static void main(String [] args) {
       System.out.println("---WINDOWS---");
        Windows windows = new Windows(2019);
        windows.turnOn();
        windows.turnOff();
    System.out.println("Windows release year: " + windows.getReleaseYear());

    System.out.println("---LINUX---");

        PPLinux pplinux = new PPLinux(2022);
        pplinux.turnOn();
        pplinux.turnOff();
    System.out.println("Linux release year: " + pplinux.getReleaseYear());
}
    }
