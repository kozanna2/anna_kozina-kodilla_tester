package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.spring_dependency_injection.SkypeMessageService;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }
    public double add(double a, double b) {
        double value = a + b;
        display.display(value);
        return value;
       }

    public double substract(double a, double b) {
        double value = a - b;
        display.display(value);
        return value;
    }

    public double multiple(double a, double b) {
        double value = a * b;
        display.display(value);
        return value;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException();
        } else {
            try {
                double value = a / b;
                display.display(value);
                return value;
            } catch (ArithmeticException e) {
                System.err.println("You can't divide by 0");
            }
            return 0;
        }
    }
}
