package com.kodilla.abstracts.homework;

public class Teacher extends Job {
    public Teacher() {
        super(3500, "look after students in class, teach, ");
    }

    @Override
    public void showResponsibilities() {
        System.out.println(getResponsibilities());
    }
}
