package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {
        Windows windows = new Windows(1999);
        windows.getPublishmentYear();
        windows.turnOn();

        Linux linux = new Linux(2008);
        linux.turnOn();
        linux.getPublishmentYear();
        linux.turnOff();
    }
}
