package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class CalculatorTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/valuesForSum.csv", numLinesToSkip = 1)
    public void shouldReturnCorrectResultOfSum(double a, double b, double expected) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        Calculator bean = context.getBean(Calculator.class);
        Assertions.assertEquals(expected,bean.add(a,b));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/valuesForSubstract.csv", numLinesToSkip = 1)
    public void shouldReturnCorrectResultOfSubstract(double a, double b, double expected) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        Calculator bean = context.getBean(Calculator.class);
        Assertions.assertEquals(expected,bean.substract(a,b));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/valuesForMultiple.csv", numLinesToSkip = 1)
    public void shouldReturnCorrectResultOfMultiply(double a, double b, double expected) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        Calculator bean = context.getBean(Calculator.class);
        Assertions.assertEquals(expected,bean.multiple(a,b));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/valuesForDivide.csv", numLinesToSkip = 1)
    public void shouldReturnCorrectResultOfDivide(double a, double b, double expected) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        Calculator bean = context.getBean(Calculator.class);
        Assertions.assertEquals(expected,bean.divide(a,b));
    }
    @Test
    public void shouldReturnCorrectResultOfDivideWithZero(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        Calculator bean = context.getBean(Calculator.class);
        assertThrows(ArithmeticException.class, () -> bean.divide(7,0));
    }
}