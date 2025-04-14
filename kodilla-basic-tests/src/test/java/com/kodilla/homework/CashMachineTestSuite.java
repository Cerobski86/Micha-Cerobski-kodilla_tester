package com.kodilla.homework;

import com.kodilla.bank.homework.CashMachine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CashMachineTestSuite {


    @Test
    public void shouldHaveZeroBalanceWhenNoTransactions() {
        CashMachine machine = new CashMachine();
        assertEquals(0, machine.getBalance());
    }

    @Test
    public void shouldAddTransactionAndReturnCorrectBalance() {
        CashMachine machine = new CashMachine();
        machine.addTransactions(100);
        machine.addTransactions(-50);
        assertEquals(50, machine.getBalance());
    }

    @Test
    public void shouldReturnCorrectNumberOfTransactions() {
        CashMachine machine = new CashMachine();
        machine.addTransactions(100);
        machine.addTransactions(-50);
        assertEquals(2, machine.getNumberOfTransactions());
    }

    @Test
    public void shouldCountOnlyWithdrawals() {
        CashMachine machine = new CashMachine();
        machine.addTransactions(100);
        machine.addTransactions(-50);
        machine.addTransactions(-30);
        assertEquals(2, machine.getNumberOfWithDrawls());
    }

    @Test
    public void shouldIgnoreZeroTransaction() {
        CashMachine machine = new CashMachine();
        machine.addTransactions(0);
        assertEquals(0, machine.getNumberOfTransactions());
        assertEquals(0, machine.getBalance());
    }

    @Test
    public void shouldReturnZeroForEmptyMachine() {
        CashMachine machine = new CashMachine();
        Assertions.assertEquals(0, machine.getBalance());
        Assertions.assertEquals(0, machine.getNumberOfTransactions());
    }
}