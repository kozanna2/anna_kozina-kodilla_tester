package com.kodilla.basic_assertion;

public class ResultChecker {
    public static boolean asserEquals(int expected, int actual) {
        return expected == actual;
    }
    public static boolean asserEqualsDelta(int expected, int actual, double delta) {
        delta = 0.001;
        return expected == actual;
    }
}
