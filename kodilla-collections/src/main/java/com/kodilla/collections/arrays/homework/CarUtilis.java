package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtilis {
    public static void describeCar (Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car brand: " + getCarName(car));
        System.out.println("Speeding [km/h]: " + car.increaseSpeed());
        }

    private static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Fiat)
            return "Fiat";
        else
            return "Unknown car name";
    }
}

