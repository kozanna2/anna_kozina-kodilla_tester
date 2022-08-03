package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> provideArgumentsForTestingBMIUnder15() {
        String under15 = "Very severely underweight";
        return Stream.of(
                Arguments.of(new Person(1.7,42), under15),
                Arguments.of(new Person(1.56,34), under15),
                Arguments.of(new Person(1.9,50), under15)
        );
    }
    static Stream<Arguments> provideArgumentsForTestingBMIUnder16() {
        String under16 = "Severely underweight";
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.68,44), under16),
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.62,40), under16),
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.9,55), under16)
        );
    }
    static Stream<Arguments> provideArgumentsForTestingBMIUnder18() {
        String under18 = "Underweight";
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.80,57), under18),
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.7,49), under18),
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.68,48), under18)
        );
    }
    static Stream<Arguments> provideArgumentsForTestingBMIUnder25() {
        String under25 = "Normal (healthy weight)";
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.62,52), under25),
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.79,64), under25),
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.65,52), under25)
        );
    }
    static Stream<Arguments> provideArgumentsForTestingBMIUnder30() {
        String under30 = "Overweight";
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.76,79), under30),
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.99,102), under30),
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.62,67), under30)
        );
    }
    static Stream<Arguments> provideArgumentsForTestingBMIUnder35() {
        String under35 = "Obese Class I (Moderately obese)";
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.86,109), under35),
                org.junit.jupiter.params.provider.Arguments.of(new Person(2.05,129), under35),
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.54,78), under35)
        );
    }
    static Stream<Arguments> provideArgumentsForTestingBMIUnder40() {
        String under40 = "Obese Class II (Severely obese)";
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.91,134), under40),
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.65,100), under40),
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.78,112), under40)
        );
    }
    static Stream<Arguments> provideArgumentsForTestingBMIUnder45() {
        String under45 = "Obese Class III (Very severely obese)";
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.87,145), under45),
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.69,118), under45),
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.48,93), under45)
        );
    }
    static Stream<Arguments> provideArgumentsForTestingBMIUnder50() {
        String under50 = "Obese Class IV (Morbidly Obese)";
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.82,152), under50),
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.7,131), under50),
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.56,112), under50)
        );
    }
    static Stream<Arguments> provideArgumentsForTestingBMIUnder60() {
        String under60 = "Obese Class V (Super Obese)";
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.96,194), under60),
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.77,159), under60),
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.62,135), under60)
        );
    }
    static Stream<Arguments> provideArgumentsForTestingBMIOver60() {
        String over60 = "Obese Class VI (Hyper Obese)";
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.56,200), over60),
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.68,200), over60),
                org.junit.jupiter.params.provider.Arguments.of(new Person(1.81,200), over60)
        );
    }
}
