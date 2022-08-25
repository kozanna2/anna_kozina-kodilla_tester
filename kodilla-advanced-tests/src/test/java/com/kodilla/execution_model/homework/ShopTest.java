package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    Shop shop = new Shop();
    Order milk = new Order(3.50, "Ania", LocalDate.of(2022, 5, 9));
    Order bread = new Order(9.90, "Kasia", LocalDate.of(2021, 4, 15));
    Order eggs = new Order(3.50, "Basia", LocalDate.of(2020, 10, 26));
    Order salad = new Order(5, "Hania", LocalDate.of(2019, 7, 5));

    @Test
    public void shouldAddOrder() {
        //when
        long numberOfOrders = shop.orders.size();
        //then
        assertEquals(4, numberOfOrders);
    }

    @Test
    public void shouldReturnOrdersFrom2Years() {
        // given
        Set<Order> ExpectedOrdersFrom2Years = new HashSet<>();
        ExpectedOrdersFrom2Years.add(milk);
        ExpectedOrdersFrom2Years.add(bread);
        ExpectedOrdersFrom2Years.add(eggs);
        //when
        Set<Order> result = shop.getOrdersFromTwoYearsAgo();
        //then
        assertEquals(ExpectedOrdersFrom2Years, result);
    }

    @Test
    public void shouldReturnOrdersWithValueFromTo() {
        //given
        Set<Order> ExpectedOrdersFromTo = new HashSet<>();
        ExpectedOrdersFromTo.add(milk);
        ExpectedOrdersFromTo.add(eggs);
        //when
        Set<Order> setOrdersFromTo = shop.getOrdersWithValueFromTo(2, 4);
        //then
        assertEquals(ExpectedOrdersFromTo, setOrdersFromTo);
    }

    @Test
    public void shouldReturnNumberOfOrders() {
        //when
        long numberOfOrders = shop.getNumberOfOrders();
        //then
        assertEquals(4, numberOfOrders);
    }

    @Test
    public void shouldReturnSumOfOrdersValue() {
        //when
        double totalValue = shop.getSumOfOrdersValue();
        //then
        assertEquals(21.9, totalValue);
    }

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(milk);
        shop.addOrder(bread);
        shop.addOrder(eggs);
        shop.addOrder(salad);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}