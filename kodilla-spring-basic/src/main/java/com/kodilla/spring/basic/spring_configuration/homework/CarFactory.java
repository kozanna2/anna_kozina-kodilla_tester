package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Configuration
public class CarFactory {

    Car car;
   private static final LocalDate SpringStarts = LocalDate.of(2022, 3, 22); //privat static final wyciagnac jako pola
    private static final LocalDate SummerStarts = LocalDate.of(2022, 6, 21);
    private static final LocalDate AutumnStarts = LocalDate.of(2022, 9, 22);
    private static final LocalDate WinterStarts = LocalDate.of(2022, 12, 21);

    @Bean
    @Scope ("prototype")
    public Car whichCarToUse(LocalDate localDate) {
        if (localDate.equals(SummerStarts) && localDate.isAfter(SummerStarts) && localDate.isBefore(AutumnStarts)) {
            car = new Cabrio();
        } else if (localDate.equals(WinterStarts) && localDate.isAfter(WinterStarts) && localDate.isBefore(SpringStarts)) {
            car = new SUV();
        } else {
            car = new Sedan();
        }
        return car;
    }
}

