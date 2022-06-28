package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Cat", "50x8", true));
        stamps.add(new Stamp("Dog", "67x9", true));
        stamps.add(new Stamp("Mouse", "45x9", false));
        stamps.add(new Stamp("Cat", "50x8", true));
        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
