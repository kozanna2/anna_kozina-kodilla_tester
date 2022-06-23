package com.kodilla.abstracts.homework;

public class Circle extends Shape{
    static double PI = 3.1415927;

    public Circle(int radius) {
        super(radius);
    }

    @Override
    public void calculateArea() {
        double circleArea;
        circleArea = (getRadius()*getRadius()) * PI;
        System.out.println("circle area is " + circleArea);

    }

    @Override
    public void calculateCircuit() {
        double circleCircuit;
        circleCircuit = (getRadius()) * 2 * PI;
        System.out.println("circle circuit is " + circleCircuit);
    }
}
