package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int side1;
    private int side2;

    public Shape(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    public abstract void calculateArea();
    public abstract void calculateCircuit();


    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

}
