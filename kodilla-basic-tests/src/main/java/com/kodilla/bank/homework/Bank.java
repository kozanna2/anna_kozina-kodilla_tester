package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    private int size;

    public CashMachine[] getCashmachines() {
        return cashMachines;
    }

    public int getSize() {
        return size;
    }

    public int getTotalBalance() {
        int totalBalance = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalBalance += cashMachines[i].getBalance();
        }
        return totalBalance;
    }

    public int getTotalNumberOfPaymentsInPlus() {
        int totalNumberOfPaymentsInPlus = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalNumberOfPaymentsInPlus += cashMachines[i].getNumberOfPaymentsInPlus();
        }
        return totalNumberOfPaymentsInPlus;
    }

    public int getTotalNumberOfPaymentsInMinus() {
        int totalNumberOfPaymentsInMinus = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalNumberOfPaymentsInMinus += cashMachines[i].getNumberOfPaymentsInMinus();
        }
        return totalNumberOfPaymentsInMinus;
    }

    public int getTotalAverageOfPaymentsInPlus() {
        int totalSumInPlus = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalSumInPlus += cashMachines[i].getSumInPlus();
        }
        return totalSumInPlus / getTotalNumberOfPaymentsInPlus();
    }

    public int getTotalAverageOfPaymentsInMinus() {
        int totalSumInMinus = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalSumInMinus += cashMachines[i].getSumInMinus();
        }
        return totalSumInMinus / getTotalNumberOfPaymentsInMinus();
    }
}
