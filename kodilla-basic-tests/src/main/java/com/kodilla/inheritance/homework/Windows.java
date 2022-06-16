package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows(int publishmentYear) {
        super(publishmentYear);
        System.out.println("This is Windows");
    }

    @Override
    public void turnOn() {
        System.out.println("Windows: Turning on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Windows: Turning off...");
    }
}
