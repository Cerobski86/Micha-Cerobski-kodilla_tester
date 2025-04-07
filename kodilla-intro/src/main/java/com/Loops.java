package com;

public class Loops {
    public static void main(String[] args) {
        String[] name = new String[]{"Zygfryd", "Gwidon", "Florentyna"};

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        int[] numbers = {20, 40, 60, 80};

        int sum = sumNumbers(numbers);
        System.out.println("Suma liczb :" + sum);
    }

    public static int sumNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}