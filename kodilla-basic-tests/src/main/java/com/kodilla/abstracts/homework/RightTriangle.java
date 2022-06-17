package com.kodilla.abstracts.homework;

public class IsoscelesRightTriangle extends Shape {
    public IsoscelesRightTriangle(int side1, int side2) {
        super(side1, side2);
    }

    @Override
    public void calculateArea() {
        int triangleArea;
        triangleArea = getSide1()*getSide2();
        System.out.println("Square area is " + triangleArea);

    }

    @Override
    public void calculateCircuit() {
        double triangleCircuit;
        triangleCircuit = getSide1() + getSide2() + 1.41*getSide1();
        System.out.println("Square circuit is " + triangleCircuit);

    }

}
