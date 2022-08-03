package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideArgumentsForTestingBMIUnder15")
    public void testGetBMI_shouldCalculateBMIUnder15(Person person, String expectedBMI) {
        assertEquals(expectedBMI, person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideArgumentsForTestingBMIUnder16")
    public void testGetBMI_shouldCalculateBMIUnder16(Person person, String expectedBMI) {
        assertEquals(expectedBMI, person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideArgumentsForTestingBMIUnder18")
    public void testGetBMI_shouldCalculateBMIUnder18(Person person, String expectedBMI) {
        assertEquals(expectedBMI, person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideArgumentsForTestingBMIUnder25")
    public void testGetBMI_shouldCalculateBMIUnder25(Person person, String expectedBMI) {
        assertEquals(expectedBMI, person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideArgumentsForTestingBMIUnder30")
    public void testGetBMI_shouldCalculateBMIUnder30(Person person, String expectedBMI) {
        assertEquals(expectedBMI, person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideArgumentsForTestingBMIUnder35")
    public void testGetBMI_shouldCalculateBMIUnder35(Person person, String expectedBMI) {
        assertEquals(expectedBMI, person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideArgumentsForTestingBMIUnder40")
    public void testGetBMI_shouldCalculateBMIUnder40(Person person, String expectedBMI) {
        assertEquals(expectedBMI, person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideArgumentsForTestingBMIUnder45")
    public void testGetBMI_shouldCalculateBMIUnder45(Person person, String expectedBMI) {
        assertEquals(expectedBMI, person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideArgumentsForTestingBMIUnder50")
    public void testGetBMI_shouldCalculateBMIUnder50(Person person, String expectedBMI) {
        assertEquals(expectedBMI, person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideArgumentsForTestingBMIUnder60")
    public void testGetBMI_shouldCalculateBMIUnder60(Person person, String expectedBMI) {
        assertEquals(expectedBMI, person.getBMI());
    }
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideArgumentsForTestingBMIOver60")
    public void testGetBMI_shouldCalculateBMIOver60(Person person, String expectedBMI) {
        assertEquals(expectedBMI, person.getBMI());
    }
}

