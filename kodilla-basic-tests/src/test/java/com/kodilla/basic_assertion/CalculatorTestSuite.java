package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void subtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquareWithMinus() {
        Calculator calculator = new Calculator();
        double squareResult = calculator.square(-5);
        assertEquals(25, squareResult, 0.01);
    }

    @Test
    public void testSquareWithZero() {
        Calculator calculator = new Calculator();
        double squareResult = calculator.square(0);
        assertEquals(0, squareResult, 0.01);
    }

    @Test
    public void testSquareWithPlus() {
        Calculator calculator = new Calculator();
        double squareResult = calculator.square(5);
        assertEquals(25, squareResult, 0.01);
    }
}