package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{
    private int speed;
    private int increaseSpeed;

    public Opel(int speed) {
        this.speed = speed;
    }

    public Opel(int speed, int increaseSpeed) {
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
        return speed -=7;
    }
}
