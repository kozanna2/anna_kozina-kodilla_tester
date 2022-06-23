package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.Animal;

import java.util.Scanner;

public class GetJob {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Farmer farmer = new Farmer();
        Teacher teacher = new Teacher();

        Person person1 = new Person("Ann", 45, doctor);
        Person person2 = new Person("Paul", 28, teacher);
        Person person3 = new Person("Kate", 34, farmer);

        person1.getJob().showResponsibilities();
        person2.getJob().showResponsibilities();
        person3.getJob().showResponsibilities();
    }

}




