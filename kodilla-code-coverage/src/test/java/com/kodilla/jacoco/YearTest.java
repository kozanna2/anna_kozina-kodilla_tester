package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearTest {
    @Test
    void shouldBeLeapYearIfDivisibleBy400() {
        //given
        Year year = new Year(1600);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertTrue(isLeapYear);
    }
    @Test
    void shouldNotBeLeapYearIfNotDivisibleBy4() {
        //given
        Year year = new Year(1993);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertFalse(isLeapYear);
    }
    @Test
    void shouldNotBeLeapYearIfDivisibleBy4And100() {
        //given
        Year year = new Year(1900);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertFalse(isLeapYear);
    }
    @Test
    void shouldBeLeapYearIfDivisibleBy4() {
        //given
        Year year = new Year(1996);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertTrue(isLeapYear);
    }
}