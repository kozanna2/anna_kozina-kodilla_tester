package com.kodilla.abstracts.homework;
import java.util.Scanner;
public class UserDialogAreaOrCircuit {

    public static String getCalculation(){
        while (true) {
            System.out.println("what do you want to count? Please write AREA or CIRCUIT.");
            String userSelected2 = getString().trim().toUpperCase();
            if (userSelected2.equals("AREA")) {
                System.out.println("Your choise is an area.");
                return userSelected2;
            } else if (userSelected2.equals("CIRCUIT")) {
                System.out.println("Your choise is a circuit.");
                return userSelected2;
            }
            System.out.println("Your choose is wrong. Please try again.");
        }
    }
     public static String getString(){
         return new Scanner(System.in).next();
     }

}
