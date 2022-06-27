package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car {
    private int speed;
    private int increaseSpeed;

    public Fiat(int speed) {
        this.speed = speed;
    }

    public Fiat(int speed, int increaseSpeed) {
        this.speed = speed;
        this.increaseSpeed = increaseSpeed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        return increaseSpeed;
    }

    @Override
    public int decreaseSpeed() {
       return speed -=15;
    }
}
