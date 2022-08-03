package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {
    GamblingMachine test = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineCorrect.csv", numLinesToSkip = 1)
    public void howManyWins_shouldReturnNumberOfWins(int number1, int number2, int number3, int number4, int number5, int number6) throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);
        numbers.add(number6);

        //then
        assertEquals(true, test.howManyWins(numbers) >= 0 && test.howManyWins(numbers) <= 6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineNullAndNegativeNumbers.csv", numLinesToSkip = 1)
    public void testHowManyWins_NullAndNegativeNumbers_withException(int number1, int number2, int number3, int number4, int number5, int number6) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);
        numbers.add(number6);
        assertThrows(InvalidNumbersException.class, () -> test.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineNullAndNegativeNumbers.csv", numLinesToSkip = 1)
    public void testHowManyWins_TooHighNumbers_withException(int number1, int number2, int number3, int number4, int number5, int number6) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);
        numbers.add(number6);
        assertThrows(InvalidNumbersException.class, () -> test.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineTooManyNumbers.csv", numLinesToSkip = 1)
    public void testHowManyWins_TooManyNumbers_withException(int number1, int number2, int number3, int number4, int number5, int number6, int number7) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);
        numbers.add(number6);
        numbers.add(number7);
        assertThrows(InvalidNumbersException.class, () -> test.howManyWins(numbers));
    }
}