package com.kodilla.inheritance.homework;

public class PPLinux extends OperatingSystem {

    public PPLinux(int releaseYear) {
        super(releaseYear);
    }
    @Override
    public void turnOn( ) {
        System.out.println("Linux is loading.");
    }
    @Override
    public void turnOff() {
        System.out.println("Linux is shutting down.");
}
}


