package com.kodilla.abstracts.homework;

public class Square extends Shape{

    public Square(int side1, int side2) {
        super(side1, side2);
    }

    @Override
    public void calculateArea() {
        int squareArea;
        squareArea = getSide1()*getSide2();
        System.out.println("Square area is " + squareArea);

    }

    @Override
    public void calculateCircuit() {
        int squareCircuit;
        squareCircuit = getSide1()*2 + getSide2()*2;
        System.out.println("Square circuit is " + squareCircuit);

    }
}
