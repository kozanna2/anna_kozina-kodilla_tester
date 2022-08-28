package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.time.LocalDate;
import java.time.LocalTime;


@SpringBootTest
class CarFactoryTest {
    @Test
    public void whichCarToUse_WithEnteredDate() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("whichCarToUse", LocalDate.of(2022, 5, 16));
        //when
        String carType = car.getCarType();
        //then
        Assertions.assertEquals("Sedan", carType);
    }

    @Test
    public void hasCarLightsOn_WithEnteredDate() {
        //given
        Car car = new Sedan();
        //when
        boolean result = car.hasLightsTurnedOn(LocalTime.of(16, 50));
        //then
        Assertions.assertFalse(result);
    }

}
