package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;

import java.util.HashSet;
import java.util.Set;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order1"));
        warehouse.addOrder(new Order("Order2"));
        warehouse.addOrder(new Order("Order3"));
        warehouse.addOrder(new Order("Order4"));
        warehouse.addOrder(new Order("Order5"));
        try {
            String isOrderInUse = warehouse.isOrderInUse("Order6");
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, this order doesn't exist.");
        } finally {
            System.out.println("Thank you. ");

        }
    }
}

