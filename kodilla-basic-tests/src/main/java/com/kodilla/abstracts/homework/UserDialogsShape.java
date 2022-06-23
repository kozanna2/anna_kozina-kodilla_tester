package com.kodilla.abstracts.homework;

import java.util.Scanner;

public class UserDialogsShape {
    public static int getShape() {
        while (true) {
            System.out.println("Which shape do you choose? 1 - SQUARE; 2 - RECTANGLE; 3 - RIGHT TRIANGLE; 4 - CIRCLE");
            int choose = getInt();
            if (choose >= 1 && choose <= 4) {
                switch (choose) {
                    case 1:
                        System.out.println("Your chosen figure is SQUARE");
                        break;
                    case 2:
                        System.out.println("Your chosen figure is RECTANGLE");
                        break;
                    case 3:
                        System.out.println("Your chosen figure is ISOSCALES RIGHT TRIANGLE");
                        break;
                    case 4:
                        System.out.println("Your chosen figure is CIRCLE");
                }
                return choose;
            }
            System.out.println("Your choose is wrong. Please try again.");
        }
    }


    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
