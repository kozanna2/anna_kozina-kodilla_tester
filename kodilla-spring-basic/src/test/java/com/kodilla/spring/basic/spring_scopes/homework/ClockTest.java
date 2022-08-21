package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ClockTest {
    @Test
    public void shouldCreateDifferentTasks() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock time1 = context.getBean(Clock.class);
        Clock time2 = context.getBean(Clock.class);
        Clock time3 = context.getBean(Clock.class);
        Assertions.assertNotEquals(time1, time2);
        Assertions.assertNotEquals(time1, time3);
        Assertions.assertNotEquals(time3, time2);
    }
}