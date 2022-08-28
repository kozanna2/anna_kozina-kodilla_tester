package com.kodilla.mockito.homework;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

public class NotificationHomeworkServiceTestSuite {
    ClientHomework firstClientHomework = Mockito.mock(ClientHomework.class);
    ClientHomework secondClientHomework = Mockito.mock(ClientHomework.class);
    ClientHomework thirdClientHomework = Mockito.mock(ClientHomework.class);
    NotificationHomework notificationHomework = Mockito.mock(NotificationHomework.class);
    NotificationServiceHomework notificationServiceHomework = new NotificationServiceHomework();

    @Test
    public void shouldAddSubscriberToCity() {
        //given
        NotificationServiceHomework notificationServiceHomework = Mockito.mock(NotificationServiceHomework.class);
        //when
        notificationServiceHomework.addSubscriberToCity("Kraków", firstClientHomework);
        //then
        Mockito.verify(notificationServiceHomework).addSubscriberToCity("Kraków", firstClientHomework);
        Mockito.verifyNoInteractions(secondClientHomework);
        Mockito.verifyNoInteractions(thirdClientHomework);
    }

    @Test
    public void shouldSendNotificationForCity() {
        //when
        notificationServiceHomework.sendNotificationForCity("Kraków", notificationHomework);
        //then
        Mockito.verify(firstClientHomework, Mockito.times(1)).receive(notificationHomework);
        Mockito.verify(secondClientHomework, Mockito.times(1)).receive(notificationHomework);
        Mockito.verify(thirdClientHomework, Mockito.never()).receive(notificationHomework);
    }

    @Test
    public void shouldSendNotificationForAll() {
        //when
        notificationServiceHomework.sendNotificationForAll(notificationHomework);
        //then
        Mockito.verify(firstClientHomework, Mockito.times(1)).receive(notificationHomework);
        Mockito.verify(secondClientHomework, Mockito.times(1)).receive(notificationHomework);
        Mockito.verify(thirdClientHomework, Mockito.times(1)).receive(notificationHomework);
    }

    @Test
    public void shouldRemoveSubscriberFromCity() {
        notificationServiceHomework.addSubscriberToCity("Kraków", thirdClientHomework);
        //when
        notificationServiceHomework.removeSubscriberFromCity("Kraków", thirdClientHomework);
        notificationServiceHomework.sendNotificationForAll(notificationHomework);
        //then
        Mockito.verify(firstClientHomework, Mockito.times(1)).receive(notificationHomework);
        Mockito.verify(secondClientHomework, Mockito.times(1)).receive(notificationHomework);
        Mockito.verify(secondClientHomework, Mockito.times(1)).receive(notificationHomework);
    }

    @Test
    public void shouldRemoveSubscriberAtAll() {
        notificationServiceHomework.addSubscriberToCity("Kraków", thirdClientHomework);
        //when
        notificationServiceHomework.removeSubscriberAtAll(thirdClientHomework);
        notificationServiceHomework.sendNotificationForAll(notificationHomework);
        //then
        Mockito.verify(firstClientHomework, Mockito.times(1)).receive(notificationHomework);
        Mockito.verify(secondClientHomework, Mockito.times(1)).receive(notificationHomework);
        Mockito.verify(thirdClientHomework, Mockito.never()).receive(notificationHomework);
    }

    @Test
    public void shouldRemoveCity() {
        notificationServiceHomework.addSubscriberToCity("Kraków", thirdClientHomework);
        //when
        notificationServiceHomework.removeCity("Kraków");
        notificationServiceHomework.sendNotificationForAll(notificationHomework);
        //then
        Mockito.verify(firstClientHomework, Mockito.never()).receive(notificationHomework);
        Mockito.verify(secondClientHomework, Mockito.never()).receive(notificationHomework);
        Mockito.verify(thirdClientHomework, Mockito.times(1)).receive(notificationHomework);
    }

    @BeforeEach
    public void addThreeClients() {
        notificationServiceHomework.addSubscriberToCity("Kraków", firstClientHomework);
        notificationServiceHomework.addSubscriberToCity("Kraków", secondClientHomework);
        notificationServiceHomework.addSubscriberToCity("Wrocław", thirdClientHomework);
    }
}
