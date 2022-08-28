package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public interface Car {
    default boolean hasLightsTurnedOn(LocalTime localTime) {
        LocalTime startOfLightning = LocalTime.of(20, 00, 00);
        LocalTime endOfLightning = LocalTime.of(06, 00, 00);
        if (localTime.isAfter(startOfLightning) && localTime.isBefore(endOfLightning)) {
            return true;
        }
        return false;
    }

    String getCarType();
}
