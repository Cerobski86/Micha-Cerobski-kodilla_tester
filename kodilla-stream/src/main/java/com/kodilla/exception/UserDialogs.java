package com.kodilla.exception;

import java.util.Scanner;

public class UserDialogs {
    public static int getNumberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Entry number of rounds: ");
            String s = scanner.nextLine();
            try {
                int rounds = Integer.parseInt(s);
                return rounds;
            } catch (Exception e) {
                System.out.println("Wrong data. Entry only digits. Try again.");
            }
        }
    }
}