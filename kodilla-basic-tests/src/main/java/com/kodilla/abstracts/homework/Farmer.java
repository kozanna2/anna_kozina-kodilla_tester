package com.kodilla.abstracts.homework;

public class Farmer extends Job{
    public Farmer() {
        super(6000, "grow plants");
    }

    @Override
    public void showResponsibilities() {
       System.out.println(getResponsibilities());
    }
}
