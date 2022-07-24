package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public void action(int transaction) {
        this.size++; //dodawanie transakcji wpłaty lub wypłaty
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getBalance() {
        int sum = 0; //zwraca saldo
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum;
    }

    public int getNumberOfTransaction() { // liczba transakcji
        System.out.println("ATM number od transaction is: " + transactions.length); //zwraca liczbę transakcji
        return transactions.length;
    }

    public int getNumberOfPaymentsInPlus() {
        int numberOfPaymentsInPlus = 0; //zwraca liczbę wpłat
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] > 0)
                numberOfPaymentsInPlus++;
        }
        return numberOfPaymentsInPlus;
    }

    public int getNumberOfPaymentsInMinus() {
        int numberOfPaymentsInMinus = 0; //zwraca liczbę wypłat
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] < 0)
                numberOfPaymentsInMinus++;
        }
        return numberOfPaymentsInMinus;
    }

    public int getSumInPlus() {
        int sumInPlus = 0; //zwraca sume wpłat
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] > 0)
                sumInPlus += transactions[i];
        }
        return sumInPlus;
    }
    public int getSumInMinus() {
        int sumInMinus = 0; //zwraca sume wypłat
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] < 0)
                sumInMinus += transactions[i];
        }
        return sumInMinus;
    }
}
