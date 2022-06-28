package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Ford implements Car {
    private int speed;
    private int increaseSpeed;

    public Ford(int speed) {
        this.speed = speed;
    }

    public Ford(int speed, int increaseSpeed) {
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
        return speed -=12;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return speed == ford.speed && increaseSpeed == ford.increaseSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, increaseSpeed);
    }
}
