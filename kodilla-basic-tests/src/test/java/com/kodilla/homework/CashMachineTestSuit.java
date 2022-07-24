package com.kodilla.homework;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuit {
    @Test
    public void shouldHaveZeroLenght(){
        //given then
        CashMachine cashMachine = new CashMachine();
        //when
        int [] transactions = cashMachine.getTransactions();
        assertEquals(0,transactions.length);
    }
    @Test
    public void shouldAddPayment(){

        //given
        CashMachine cashMachine = new CashMachine();
        //when
        cashMachine.action(600);
        //then
        int[]transactions=cashMachine.getTransactions();
        assertEquals(600,transactions[0]);
        assertEquals(1,transactions.length);
    }
    @Test
    public void shouldAddPaycheck(){
        //given
        CashMachine cashMachine = new CashMachine();
        //when
        cashMachine.action(-600);
        //then
        int[]transactions=cashMachine.getTransactions();
        assertEquals(-600,transactions[0]);
        assertEquals(1,transactions.length);
    }
    @Test
    public void shouldGetBalance() {
        //given
        CashMachine cashMachine = new CashMachine();
        //when
        cashMachine.action(-600);
        cashMachine.action(2000);
        cashMachine.action(-400);
        cashMachine.action(3400);
        //then
        int[] transactions = cashMachine.getTransactions();
        assertEquals(4400, cashMachine.getBalance());
        assertEquals(4, transactions.length);
    }
    @Test
    public void shouldGetNumberOfTransaction(){
        //given
        CashMachine cashMachine = new CashMachine();
        //when
        cashMachine.action(-600);
        cashMachine.action(2000);
        cashMachine.action(-400);
        cashMachine.action(3400);
        //then
        int[] transactions = cashMachine.getTransactions();
        assertEquals(4,transactions.length);
    }
}
