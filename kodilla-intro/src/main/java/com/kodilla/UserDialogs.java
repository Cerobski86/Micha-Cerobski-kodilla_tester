package com.kodilla;

import java.util.Scanner;

public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine().trim();
            if (name.length() >= 2) { return name; }
            System.out.println("Name ist too short. Try again.");
        }
    }
}
