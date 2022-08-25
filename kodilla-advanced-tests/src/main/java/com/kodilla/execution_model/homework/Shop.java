package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Shop {
    Set<Order> orders = new HashSet<>();

    public void addOrder (Order order){
        this.orders.add(order);
    } //dodanie nowego zamowienia
    public Set<Order> getOrdersFromTwoYearsAgo(){ //zwrócenie listy zamówień z zakresu dwóch dat,
        return this.orders.stream()
                .filter(order -> order.getDate().isAfter(LocalDate.now().minusYears(2)))
                .collect(Collectors.toSet());
    }
    public Set<Order> getOrdersWithValueFromTo(double valueMin, double valueMax){ //pobranie zamówień na podstawie przekazanego zakresu (najmniejsza i największa wartość zamówienia)
        return this.orders.stream()
                .filter(order -> order.getValue() > valueMin && order.getValue()< valueMax)
                .collect(Collectors.toSet()); //toSet()
    }
    public long getNumberOfOrders(){ //zwrócenie liczby zamówień,
        long numberOfOrders = this.orders.stream()
                .count(); //orders.size
        return numberOfOrders;
    }
    public double getSumOfOrdersValue (){ //zsumowanie wartości wszystkich zamówień.
        return this.orders.stream()
                .mapToDouble(Order::getValue)
                .sum(); //bez przepisywania
    }
}
//Nowo utworzona klasa powinna mieć następujące funkcjonalności:
//
//dodanie nowego zamówienia,
//zwrócenie listy zamówień z zakresu dwóch dat,
//pobranie zamówień na podstawie przekazanego zakresu (najmniejsza i największa wartość zamówienia),
//zwrócenie liczby zamówień,
//zsumowanie wartości wszystkich zamówień.
//Zanim zaczniesz pisać kod, przygotuj przypadki testowe i prześlij je na czacie do swojego Mentora. Implementację dodaj dopiero po jego akceptacji.
