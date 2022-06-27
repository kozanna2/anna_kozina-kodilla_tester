package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int speed;

    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed +=12;
        System.out.println("Increasing speed... Currently speed is: " + (speed));
    }

    @Override
    public void decreaseSpeed() {
        speed-=8;
        System.out.println("Decreasing speed... Currently speed is: " + (speed));
    }
}
