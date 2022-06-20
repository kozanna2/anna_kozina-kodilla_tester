package com.kodilla.abstracts.homework;

public class RightTriangle extends Shape {
    public RightTriangle(int side1, int side2) {
        super(side1, side2);
    }

    @Override
    public void calculateArea() {
        int triangleArea;
        triangleArea = (getSide1()*getSide2())/2;
        System.out.println("Right triangle area is " + triangleArea);

    }

    @Override
    public void calculateCircuit() {
        double triangleCircuit;
        triangleCircuit = getSide1() + getSide2() + hypotenus();
        System.out.println("Right triangle circuit is " + triangleCircuit);

    }
    public double hypotenus(){
        double sumOfSquares = Math.pow(getSide1(),2)+Math.pow(getSide2(),2);
        double hypotenus = Math.sqrt(sumOfSquares);
        return hypotenus;
    }

}
