package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Warehouse {
    Set<Order> orders = new HashSet<>();

    public Order addOrder(Order order){
    orders.add(order);
        System.out.println(order.getNumber() + " added.");
        return order;
    }
   public Order getOrder(String number) throws OrderDoesntExistException{
        Order order = getOrders()
                .stream()
                .filter(g->g.getNumber().equals(number))
                .findAny().orElseThrow(() -> new OrderDoesntExistException());
        return order;
   }
    public String isOrderInUse (String number) throws OrderDoesntExistException {
        Order order = getOrder(number);
        String orderNumber = order.getNumber();
        if (orderNumber.equals(number)){
            return orderNumber;
        }
        throw new OrderDoesntExistException();
    }
   public Set<Order> getOrders(){
        return orders;
   }
}
