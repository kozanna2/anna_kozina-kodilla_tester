package com.kodilla.abstracts.homework;

public class Rectangle1 extends Shape{
    public Rectangle1(int bok1, int bok2) {
        super(bok1, bok2);
    }

    @Override
    public void calculateArea(int bok1, int bok2) {
        int squareArea = bok1 * bok2;
        System.out.println("The area of the square " + bok1 + " x " + bok2 + " is " + squareArea);

    }

    @Override
    public void calculateCircuit(int bok1, int bok2) {

    }
}
