package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtilis;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford(80, 20));
        cars.add(new Ford(100, 40));
        cars.add(new Ford(90, 30));

        for (Car car : cars) {
            CarUtilis.describeCar(car);
        }
        cars.remove(1); // usuwam pierwszy element uzywajac indeksu
        Car ford = new Ford(80, 20);
        cars.remove(ford); // usuwam drugi element uzywajac obiektu
        System.out.println("-----------------------------");
        System.out.println("Długość listy po usunięciu elementów to: " + cars.size());
        for (Car car : cars) {
            CarUtilis.describeCar(car);
        }
    }
}
