package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.asserEqualsDelta;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubstract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int substractResult = calculator.substract(a, b);
        assertEquals(-3, substractResult);
    }
    @Test
    public void testSquarePositive() {
        Calculator calculator = new Calculator();
        int a = 5;
        int squareResult = calculator.square(a);
        asserEqualsDelta(25, squareResult, 0.001);
    }
    @Test
    public void testSquareZero() {
        Calculator calculator = new Calculator();
        int a = 0;
        int squareResult = calculator.square(a);
        asserEqualsDelta(0, squareResult, 0.001);
    }
    @Test
    public void testSquareNegative() {
        Calculator calculator = new Calculator();
        int a = -5;
        int squareResult = calculator.square(a);
        asserEqualsDelta(25, squareResult, 0.001);
    }
}
