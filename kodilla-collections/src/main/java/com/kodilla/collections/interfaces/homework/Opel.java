package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{
    private int speed;

    public Opel(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public void increaseSpeed() {
        speed+=17;
        System.out.println("Increasing speed... Currently speed is: " + speed);
    }

    @Override
    public void decreaseSpeed() {
        speed-=12;
        System.out.println("Decreasing speed... Currently speed is: " + speed);
    }
}
