package com.kodilla.homework;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class BankTestSuite {

    @Test
    public void testGetTotalBalance() {
        Bank bank = new Bank();
        CashMachine m1 = new CashMachine();
        CashMachine m2 = new CashMachine();

        m1.addTransactions(100);
        m1.addTransactions(-50);

        m2.addTransactions(200);
        m2.addTransactions(-50);

        bank.addMachine(m1);
        bank.addMachine(m2);

        int result = bank.getTotalBalance();
        Assertions.assertEquals(200, result);
    }

    @Test
    public void getTotalWithdrawals() {
        Bank bank = new Bank();
        CashMachine m1 = new CashMachine();
        CashMachine m2 = new CashMachine();
        m1.addTransactions(100);
        m1.addTransactions(-50);
        m1.addTransactions(200);
        m1.addTransactions(-30);

        m2.addTransactions(200);
        m2.addTransactions(-50);
        m2.addTransactions(-400);

        bank.addCashMachine(m1);
        bank.addCashMachine(m2);

        int result = bank.getTotalWithdrawals();
        Assertions.assertEquals(4, result);
    }

    @Test
    public void getTotalDeposits() {
        Bank bank = new Bank();
        CashMachine m1 = new CashMachine();
        CashMachine m2 = new CashMachine();

        m1.addTransactions(100);
        m1.addTransactions(-50);
        m1.addTransactions(200);
        m1.addTransactions(-30);

        m2.addTransactions(200);
        m2.addTransactions(-50);
        m2.addTransactions(-400);

        bank.addCashMachine(m1);
        bank.addCashMachine(m2);

        int result = bank.getTotalDeposits();
        Assertions.assertEquals(3, result);
    }

    @Test
    public void shouldReturnCorrectAverageDeposit() {
        Bank bank = new Bank();
        CashMachine m1 = new CashMachine();
        CashMachine m2 = new CashMachine();
        CashMachine m3 = new CashMachine();

        m1.addTransactions(100);
        m1.addTransactions(-50);
        m1.addTransactions(200);
        m1.addTransactions(-30);

        m2.addTransactions(200);
        m2.addTransactions(-50);
        m2.addTransactions(-400);

        m3.addTransactions(70);
        m3.addTransactions(-50);

        bank.addCashMachine(m1);
        bank.addCashMachine(m2);
        bank.addCashMachine(m3);

        double expectedAverageDeposit = 142.5;
        Assertions.assertEquals(expectedAverageDeposit, bank.getAverageDeposit(), 0.01);
    }

    @Test
    public void shouldReturnCorrectAverageWithdrawals() {
        Bank bank = new Bank();
        CashMachine m1 = new CashMachine();
        CashMachine m2 = new CashMachine();
        CashMachine m3 = new CashMachine();

        m1.addTransactions(100);
        m1.addTransactions(-50);
        m1.addTransactions(200);
        m1.addTransactions(-30);

        m2.addTransactions(200);
        m2.addTransactions(-50);
        m2.addTransactions(-400);

        m3.addTransactions(70);
        m3.addTransactions(-50);

        bank.addCashMachine(m1);
        bank.addCashMachine(m2);
        bank.addCashMachine(m3);

        double expectedAverageWithdrawals = -116;
        Assertions.assertEquals(expectedAverageWithdrawals, bank.getAverageWithdrawal());
    }

    @Test
    public void shouldReturnZeroStatsForBankWithEmptyMachines() {
        Bank bank = new Bank();

        CashMachine machine1 = new CashMachine();
        CashMachine machine2 = new CashMachine();

        bank.addCashMachine(machine1);
        bank.addCashMachine(machine2);

        Assertions.assertEquals(0, bank.getTotalBalance());
        Assertions.assertEquals(0, bank.getTotalDeposits());
        Assertions.assertEquals(0, bank.getTotalWithdrawals());
        Assertions.assertEquals(0.0, bank.getAverageDeposit());
        Assertions.assertEquals(0.0, bank.getAverageWithdrawal());
        System.out.println("Cash Machine empty");
    }
}