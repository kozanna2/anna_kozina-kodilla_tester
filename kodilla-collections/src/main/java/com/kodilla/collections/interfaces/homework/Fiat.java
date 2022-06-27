package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car {
    private int speed;

    public Fiat(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public void increaseSpeed() {
        speed+=25;
        System.out.println("Increasing speed... Currently speed is: " + speed);
    }

    @Override
    public void decreaseSpeed() {
        speed -=15;
        System.out.println("Decreasing speed... Currently speed is: " + speed);
    }
}
