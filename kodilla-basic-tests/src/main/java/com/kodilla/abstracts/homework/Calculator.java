package com.kodilla.abstracts.homework;

public class Calculator {
    public void calculate() {
        int userSelected = UserDialogsShape.getShape();
        int side1 = UserDialogParameter.getValue1();
        int side2 = UserDialogParameter.getValue2();
        String what = UserDialogAreaOrCircuit.getCalculation();

        switch (userSelected) {
            case 1:
                Square square = new Square(side1, side2);
                if(side1 == side2) {
                    if (what.equals("AREA")) {
                        square.calculateArea();
                    } else if (what.equals("CIRCUIT")) {
                        square.calculateCircuit();
                    } else {
                        System.out.println("Wrong choice.");
                    }
                }else{
                    System.out.println("Two sides of the square must be of the same length. Please try again.");
                }
                break;
            case 2:
                Rectangle rectangle = new Rectangle(side1, side2);
                if (what.equals("AREA")) {
                    rectangle.calculateArea();
                }else if(what.equals("CIRCUIT")){
                    rectangle.calculateCircuit();
                }else{
                    System.out.println("Wrong choice.");
                }
                break;
            case 3:
                RightTriangle triangle = new RightTriangle(side1, side2);
                System.out.println("Two sides have been assigned as right-angled");
                if (what.equals("AREA")) {
                    triangle.calculateArea();
                }else if(what.equals("CIRCUIT")){
                    triangle.calculateCircuit();
                }else{
                    System.out.println("Wrong choice.");
                }
                break;
            default:
                System.out.println("Something went wrong...");
                break;
        }
    }
}

