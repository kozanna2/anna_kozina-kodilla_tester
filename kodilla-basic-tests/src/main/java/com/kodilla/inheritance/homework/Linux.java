package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {
    public Linux(int publishmentYear) {
        super(publishmentYear);
        System.out.println("This is Linux.");
    }

    @Override
    public void turnOn() {
        System.out.println("Linux: Turning on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Linux: Turning off...");
    }
}
