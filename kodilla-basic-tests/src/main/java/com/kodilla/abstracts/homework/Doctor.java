package com.kodilla.abstracts.homework;

public class Doctor extends Job {
    public Doctor() {
        super(10000, "help people, look after patients, treat patients ");
    }

    @Override
    public void showResponsibilities() {
        System.out.println(getResponsibilities());
    }
}
