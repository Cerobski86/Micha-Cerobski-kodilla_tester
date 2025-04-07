package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        if (correctSum) {
            System.out.println("Results: " + calculator.sum(a, b));
            System.out.println("The sum method works correctly for numbers " + a + " and " + b);
        } else {
            System.out.println("The sum method does not work correctly for numbers " + a + " and " + b);
        }

        int subtractResult = calculator.subtract(a, b);
        boolean correctSubtract = ResultChecker.assertEquals(-3, subtractResult);
        if (correctSubtract) {
            System.out.println("Results: " + calculator.subtract(a, b));
            System.out.println("The subtract method works correctly for numbers " + a + " and " + b);
        } else {
            System.out.println("The substract method does not work correctly for numbers " + a + " and " + b);
        }

        int squaredResult = calculator.squared(a);
        boolean correctSquared = ResultChecker.assertEquals(25, squaredResult);
        if (correctSquared) {
            System.out.println("Results: " + calculator.squared(a));
            System.out.println("The squared method works correctly for number " + a);
        } else {
            System.out.println("The squared method does not work correctly for number " + a);
        }
    }
}