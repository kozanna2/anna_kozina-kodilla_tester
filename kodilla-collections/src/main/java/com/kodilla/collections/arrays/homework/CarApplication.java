package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Car [] cars = new Car[RANDOM.nextInt(16)];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtilis.describeCar(car);
    }

    private static Car drawCar() {
        int drawnCarKind = RANDOM.nextInt(3);
        int a = getRandomSpeed();
        int b = getRandomIncreaseSpeed();
        if (drawnCarKind == 0)
            return new Ford(a, b);
        else if (drawnCarKind == 1)
            return new Opel(a, b);
        else {
           return new Fiat(a, b);
        }
    }

    private static int getRandomIncreaseSpeed() {
        return RANDOM.nextInt(50);
    }
    private static int getRandomSpeed() {
        return RANDOM.nextInt(140+1 - 100) + 100;
    }
}

