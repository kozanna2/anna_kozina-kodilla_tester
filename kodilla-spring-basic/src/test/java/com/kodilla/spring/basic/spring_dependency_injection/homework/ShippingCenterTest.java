package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.spring_dependency_injection.SimpleApplication;
import com.kodilla.spring.basic.spring_dependency_injection.SkypeMessageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ShippingCenterTest {
    @Test
    public void shouldReturnCorrectNotificationWhenSuccess() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        NotificationService bean = context.getBean(NotificationService.class);
        //when
        String message = bean.success("Katowice");
        //then
        Assertions.assertEquals("Package delivered to: Katowice", message);
    }
    @Test
    public void shouldReturnCorrectNotificationWhenFail() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        NotificationService bean = context.getBean(NotificationService.class);
        //when
        String message = bean.fail("Wrocław");
        //then
        Assertions.assertEquals("Package not delivered to: Wrocław", message);
    }
    @Test
    public void shouldSendNotification() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        //when
        String message = bean.sendPackage("address", 5);
        //then
        Assertions.assertNotNull(message);
    }
    @Test
    public void shouldReturnFalseWhenPackegesWeightIsOver30() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        DeliveryService bean = context.getBean(DeliveryService.class);
        //when
        boolean result = bean.deliverPackage("Katowice", 50);
        //then
        Assertions.assertFalse(result);
    }
    @Test
    public void shouldReturnFalseWhenPackegesWeightIsLessThen30() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        DeliveryService bean = context.getBean(DeliveryService.class);
        //when
        boolean result = bean.deliverPackage("Katowice", 20);
        //then
        Assertions.assertTrue(result);
    }
}