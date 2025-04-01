package com.kodilla;

import java.util.Scanner;

public class Colors {
    public static void main(String[] args) {
        String color = getColorName();
        System.out.println("Color: " + color);
    }

    public static String getColorName() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a letter: ");
            String col = scanner.nextLine().trim().toUpperCase();
            switch (col) {
                case "B":
                    return "Black";
                case "W":
                    return "White";
                case "G":
                    return "Gray";
                case "Y":
                    return "Yellow";
                case "O":
                    return "Orange";
                case "R":
                    return "Red";
                case "P":
                    return "Pink";
                default:
                    System.out.println("Invalid color");
            }
        }
    }
}