package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] machines;
    private int size;

    public Bank() {
        this.machines = new CashMachine[0];
        this.size = 0;
    }

    public void addMachine(CashMachine machine) {
        this.size++;
        CashMachine[] newMachines = new CashMachine[this.size];
        System.arraycopy(machines, 0, newMachines, 0, this.machines.length);
        newMachines[this.size - 1] = machine;
        this.machines = newMachines;
    }

    public void addCashMachine(CashMachine machine) {
        this.size++;
        CashMachine[] newMachines = new CashMachine[this.size];
        System.arraycopy(machines, 0, newMachines, 0, this.machines.length);
        newMachines[this.size - 1] = machine;
        this.machines = newMachines;
    }

    public CashMachine[] getMachines() {
        return this.machines;
    }

    public int getTotalBalance() {
        int total = 0;
        for (CashMachine machine : machines) {
            total += machine.getBalance();
        }
        return total;
    }

    public int getTotalWithdrawals() {
        int total = 0;
        for (CashMachine machine : machines) {
            int[] transactions = machine.getTransactions();
            for (int t : transactions) {
                if (t < 0) {
                    total++;
                }
            }
        }
        return total;
    }

    public int getTotalDeposits() {
        int total = 0;
        for (CashMachine machine : machines) {
            int[] transactions = machine.getTransactions();
            for (int t : transactions) {
                if (t > 0) {
                    total++;
                }
            }
        }
        return total;
    }

    public double getAverageWithdrawal() {
        int total = 0;
        int count = 0;

        for (CashMachine machine : machines) {
            for (int t : machine.getTransactions()) {
                if (t < 0) {
                    total += t;
                    count++;
                }
            }
        }

        if (count == 0) {
            return 0;
        }

        return (double) total / count;
    }

    public double getAverageDeposit() {
        int total = 0;
        int count = 0;

        for (CashMachine machine : machines) {
            for (int t : machine.getTransactions()) {
                if (t > 0) {
                    total += t;
                    count++;
                }
            }
        }

        if (count == 0) {
            return 0;
        }

        return (double) total / count;
    }
}