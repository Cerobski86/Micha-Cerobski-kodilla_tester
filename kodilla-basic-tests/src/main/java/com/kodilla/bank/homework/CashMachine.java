package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }

    public void addTransactions(int amount) {
        if (amount == 0) {
            return;
        }

        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(this.transactions, 0, newTab, 0, this.transactions.length);

        newTab[this.size - 1] = amount;
        this.transactions = newTab;
    }

    public int getBalance() {
        int sum = 0;
        for (int transaction : this.transactions) {
            sum += transaction;
        }
        return sum;
    }

    public int getNumberOfTransactions() {
        return this.transactions.length;
    }

    public int getNumberOfWithDrawls() {
        int count = 0;
        for (int t : this.transactions) {
            if (t < 0) {
                count++;
            }
        }
        return count;
    }

    public int[] getTransactions() {
        return this.transactions;
    }
}