package com.kodilla;

import java.util.Random;
public class RandomNumbers {
    private int[] numbers = new int[500];
    private int count = 0;
    private int sum = 0;
    private Random random = new Random();

    public void generateNumbers() {
        while (sum <= 5000 && count < numbers.length) {
            int number = random.nextInt(31);
            numbers[count] = number;
            sum += number;
            count++;
            System.out.println(number);
        }
    }

    public int getMin() {
        if (count == 0) {
            return 0;
        }

        int min = numbers[0];
        for (int i = 1; i < count; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public int getMax() {
        if (count == 0) {
            return 0;
        }

        int max = numbers[0];
        for (int i = 1; i < count; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        RandomNumbers rn = new RandomNumbers();
        rn.generateNumbers();

        System.out.println("Suma wylosowanych liczb: " + rn.sum);
        System.out.println("Najmniejsza liczba: " + rn.getMin());
        System.out.println("Największa liczba: " + rn.getMax());
    }
}
