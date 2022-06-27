package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Fiat fiat = new Fiat(80);
        doRace(fiat);

        Opel opel = new Opel(70);
        doRace(opel);

        Ford ford = new Ford(60);
        doRace(ford);
    }

    public static void doRace(Car car) {
        System.out.println("Welcome in a race.");
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Final speed is " + car.getSpeed());
    }

}


