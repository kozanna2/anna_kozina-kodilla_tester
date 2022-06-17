package com.kodilla.abstracts.homework;
import java.util.Scanner;
public class UserDialogs {
    public static String getShape() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Which shape do you choose? 1 - SQUARE; 2 - RECTANGLE; 3 - ISOSCALES RIGHT TRIAG");
            String choose = scanner.nextLine().trim();
            if (choose.length() == 1) {
                return choose;
            }
            System.out.println("Your choose is wrong. Please try again.");
        }
    }
}
