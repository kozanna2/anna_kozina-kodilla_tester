package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    public Rectangle(int side1, int side2) {
    super(side1, side2);
}

    @Override
    public void calculateArea() {
        int rectangleArea;
       rectangleArea = getSide1()*getSide2();
        System.out.println("Square area is " + rectangleArea);

    }

    @Override
    public void calculateCircuit() {
        int rectangleCircuit;
        rectangleCircuit = getSide1()*2 + getSide2()*2;
        System.out.println("Square circuit is " + rectangleCircuit);

    }}