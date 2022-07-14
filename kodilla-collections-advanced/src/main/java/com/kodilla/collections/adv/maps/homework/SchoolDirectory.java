package com.kodilla.collections.adv.maps.homework;

import java.util.*;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> education = new HashMap<>();
        Principal john = new Principal("John", "Nowak");
        Principal betty = new Principal("Betty", "Grenger");
        Principal katie = new Principal("Kate", "Wall");

        School johnSchool = new School (Arrays.asList(30, 25, 27, 29, 31, 26));
        School bettySchool = new School(Arrays.asList(17,26,31,32,19,30,21));
        School katieSchool = new School(Arrays.asList(23, 25, 27,20, 21, 23,22,25));

        education.put(john, johnSchool);
        education.put(betty, bettySchool);
        education.put(katie,katieSchool);

        for(Map.Entry<Principal,School> principalEntry : education.entrySet()){
            System.out.println("Principal: " + principalEntry.getKey().getFirstName() + " " + principalEntry.getKey().getLastName() + " is head of " +
                    principalEntry.getValue().toString() + ". Total amount of students is: " +principalEntry.getValue().getSum());
        }
    }
}
