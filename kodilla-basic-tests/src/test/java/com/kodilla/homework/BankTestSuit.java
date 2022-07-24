package com.kodilla.homework;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuit {
    @Test
    public void shouldHaveFourLenght() {
        //given when
        CashMachine ATM1 = new CashMachine();
        CashMachine ATM2 = new CashMachine();
        CashMachine ATM3 = new CashMachine();
        CashMachine ATM4 = new CashMachine();
        Bank bank = new Bank(new CashMachine[]{ATM1, ATM2, ATM3, ATM4});
        //then
        CashMachine[] cashMachines = bank.getCashmachines();
        assertEquals(4, cashMachines.length);
    }

    @Test
    public void shouldReturnTotalBalance() {
        //given
        CashMachine ATM1 = new CashMachine();
        CashMachine ATM2 = new CashMachine();
        CashMachine ATM3 = new CashMachine();
        CashMachine ATM4 = new CashMachine();
        Bank bank = new Bank(new CashMachine[]{ATM1, ATM2, ATM3, ATM4});
        //when
        ATM1.action(600);
        ATM1.action(-8000);
        ATM2.action(100);
        ATM3.action(800);
        ATM4.action(1500);
        //then
        bank.getTotalBalance();
        assertEquals(-5000, bank.getTotalBalance());
    }

    @Test
    public void shouldReturnTotalNumberOfPaymentsInPlus() {
        //given
        CashMachine ATM1 = new CashMachine();
        CashMachine ATM2 = new CashMachine();
        CashMachine ATM3 = new CashMachine();
        CashMachine ATM4 = new CashMachine();
        Bank bank = new Bank(new CashMachine[]{ATM1, ATM2, ATM3, ATM4});
        //when
        ATM1.action(600);
        ATM1.action(-8000);
        ATM2.action(100);
        ATM3.action(800);
        ATM4.action(1500);
        //then
        bank.getTotalNumberOfPaymentsInPlus();
        assertEquals(4, bank.getTotalNumberOfPaymentsInPlus());
    }

    @Test
    public void shouldReturnTotalNumberOfPaymentsInMinus() {
        //given
        CashMachine ATM1 = new CashMachine();
        CashMachine ATM2 = new CashMachine();
        CashMachine ATM3 = new CashMachine();
        CashMachine ATM4 = new CashMachine();
        Bank bank = new Bank(new CashMachine[]{ATM1, ATM2, ATM3, ATM4});
        //when
        ATM1.action(600);
        ATM1.action(-8000);
        ATM2.action(100);
        ATM3.action(800);
        ATM4.action(1500);
        //then
        bank.getTotalNumberOfPaymentsInMinus();
        assertEquals(1, bank.getTotalNumberOfPaymentsInMinus());
    }

    @Test
    public void shouldReturnTotalAverageOfPaymentsInPlus() {
        //given
        CashMachine ATM1 = new CashMachine();
        CashMachine ATM2 = new CashMachine();
        CashMachine ATM3 = new CashMachine();
        CashMachine ATM4 = new CashMachine();
        Bank bank = new Bank(new CashMachine[]{ATM1, ATM2, ATM3, ATM4});
        //when
        ATM1.action(600);
        ATM1.action(-8000);
        ATM2.action(100);
        ATM3.action(800);
        ATM4.action(1500);
        //then
        bank.getTotalNumberOfPaymentsInPlus();
        assertEquals(750, bank.getTotalAverageOfPaymentsInPlus());
    }
    @Test
    public void shouldReturnTotalAverageOfPaymentsInMinus() {
        //given
        CashMachine ATM1 = new CashMachine();
        CashMachine ATM2 = new CashMachine();
        CashMachine ATM3 = new CashMachine();
        CashMachine ATM4 = new CashMachine();
        Bank bank = new Bank(new CashMachine[]{ATM1, ATM2, ATM3, ATM4});
        //when
        ATM1.action(600);
        ATM1.action(-8000);
        ATM2.action(100);
        ATM3.action(800);
        ATM4.action(1500);
        //then
        bank.getTotalAverageOfPaymentsInMinus();
        assertEquals(-8000, bank.getTotalAverageOfPaymentsInMinus());
    }
}
