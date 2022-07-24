package com.kodilla.bank.homework;

public class BankSimulator {
    public static void main(String[] args) {

        CashMachine ATM1 = new CashMachine();
        CashMachine ATM2 = new CashMachine();
        CashMachine ATM3 = new CashMachine();
        CashMachine ATM4 = new CashMachine();
        Bank bank = new Bank(new CashMachine[]{ATM1, ATM2, ATM3, ATM4});
        ATM1.action(600);
        ATM1.action(-200);
        ATM1.action(550);
        ATM2.action(1550);
        ATM2.action(-300);
        ATM2.action(-800);

    }
}
