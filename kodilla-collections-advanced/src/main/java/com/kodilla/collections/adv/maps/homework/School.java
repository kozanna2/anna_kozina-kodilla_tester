package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> numberOfChildren = new ArrayList<>();

    public School(List<Integer> numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

     public int getSum(){
        int sum = 0;
        for(int i : numberOfChildren){
            sum += i;
        }return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "numberOfChildren=" + numberOfChildren +
                '}';
    }
}
