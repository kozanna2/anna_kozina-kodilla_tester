package com.kodilla.abstracts.homework;

public class Calculator {
    public void calculate() {
        int userSelected = UserDialogsShape.getShape();
        String what = UserDialogAreaOrCircuit.getCalculation();
        if (userSelected == 4) {
            int radius = UserDialogParameter.getValueRadius();
            Circle circle = new Circle(radius);
            if (what.equals("AREA")) {
                System.out.println("Area of circle is counted... ");
                circle.calculateArea();
            } else if (what.equals("CIRCUIT")) {
                System.out.println("Circuit of circle is counted... ");
                circle.calculateCircuit();
            } else {
                System.out.println("Wrong choice.");
            }
        } else {
            int side1 = UserDialogParameter.getValue1();
            int side2 = UserDialogParameter.getValue2();
            switch (userSelected) {
                case 1:
                    Square square = new Square(side1, side2);
                    if (side1 == side2) {
                        if (what.equals("AREA")) {
                            System.out.println("Area of square is counted... ");
                            square.calculateArea();
                        } else if (what.equals("CIRCUIT")) {
                            System.out.println("Circuit of square is counted... ");
                            square.calculateCircuit();
                        } else {
                            System.out.println("Wrong choice.");
                        }
                    } else {
                        System.out.println("Two sides of the square must be of the same length. Please try again.");
                    }
                    break;
                case 2:
                    Rectangle rectangle = new Rectangle(side1, side2);
                    if (what.equals("AREA")) {
                        System.out.println("Area of rectangle is counted... ");
                        rectangle.calculateArea();
                    } else if (what.equals("CIRCUIT")) {
                        System.out.println("Circuit of rectangle is counted... ");
                        rectangle.calculateCircuit();
                    } else {
                        System.out.println("Wrong choice.");
                    }
                    break;
                case 3:
                    RightTriangle triangle = new RightTriangle(side1, side2);
                    System.out.println("Two sides have been assigned as right-angled");
                    if (what.equals("AREA")) {
                        System.out.println("Area of triangle is counted... ");
                        triangle.calculateArea();
                    } else if (what.equals("CIRCUIT")) {
                        System.out.println("Circuit of triangle is counted... ");
                        triangle.calculateCircuit();
                    } else {
                        System.out.println("Wrong choice.");
                    }
                    break;
                default:
                    System.out.println("Something went wrong...");
                    break;
            }
        }
    }
}

