package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int publishmentYear;

    public OperatingSystem(int publishmentYear) {
        this.publishmentYear = publishmentYear;
    }

    public void turnOn() {
        System.out.println("Turning on...");
    }

    public void turnOff() {
        System.out.println("Turning off...");
    }

    public int getPublishmentYear() {
        return publishmentYear;
    }
}
