package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {

    private final GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/correctUserNumbers.csv")
    public void shouldReturnValidWinsForCorrectNumbers(int n1, int n2, int n3, int n4, int n5, int n6) throws InvalidNumbersException {
        Set<Integer> userNumber = new HashSet<>(Arrays.asList(n1, n2, n3, n4, n5, n6));

        int result = machine.howManyWins(userNumber);
        assertTrue(result >= 0 && result <= 6);
    }
}