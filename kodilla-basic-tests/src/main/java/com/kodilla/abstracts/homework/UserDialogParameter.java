package com.kodilla.abstracts.homework;

import java.util.Scanner;

public class UserDialogParameter {
    private int side1;
    private int side2;
    private int radius;


    public static int getValue1() {
        System.out.println("Enter number for first side:");
        int side1 = getInt();
        if (side1 > 0) {
            System.out.println("First side is: " + side1);
        } else {
            System.out.println("The side value must be positive");
        }
        return side1;
    }


    public static int getValue2() {
        System.out.println("Enter number for second side:");
        int side2 = getInt();
        if (side2 > 0) {
            System.out.println("Second side is: " + side2);

        } else {
            System.out.println("The side value must be positive");
        }
        return side2;
    }
    public static int getValueRadius() {
        System.out.println("Enter number for radius");
        int radius = getInt();
        if (radius > 0) {
            System.out.println("Radius is: " + radius);

        } else {
            System.out.println("The radius value must be positive");
        }
        return radius;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getRadius() {
        return radius;
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
