package com.kodilla.mockito.homework;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NotificationServiceHomework {
    private String city;
    Map<String, Set<ClientHomework>> notificationMap = new HashMap<>();
    Set<ClientHomework> cityClientHomework = new HashSet<>();

    public void addSubscriberToCity(String city, ClientHomework clientHomework) {
        cityClientHomework = notificationMap.getOrDefault(city, new HashSet<>());
        cityClientHomework.add(clientHomework);
        notificationMap.put(city, cityClientHomework);
    }
    public void sendNotificationForCity(String city, NotificationHomework notificationHomework){
        Set<ClientHomework> notificationForCity = notificationMap.get(city);
        notificationForCity.forEach(clientHomework -> clientHomework.receive(notificationHomework));
    }

    public void sendNotificationForAll(NotificationHomework notificationHomework) {
        notificationMap.values().forEach(cityClientHomework -> cityClientHomework.forEach(clientHomework -> clientHomework.receive(notificationHomework)));
    }
    public void removeSubscriberFromCity(String city, ClientHomework clientHomework) {
        notificationMap.remove(city, clientHomework);
    }
    public void removeSubscriberAtAll(ClientHomework clientHomework) {
        notificationMap.values().forEach(clients->clients.remove(clientHomework));
    }
    public void removeCity(String city) {
        notificationMap.remove(city);
    }
}
//Naszym celem jest budowa serwisu wysyłającego monity o zagrożeniach pogodowych. Każda z zainteresowanych osób może zapisać się do kilku lokalizacji,
// aby otrzymywać informacje, jednak jedna osoba nie może być zapisana w tej samej lokalizacji kilkukrotnie. Serwis umożliwia wysyłanie powiadomień na dwa sposoby:
//
//do wszystkich osób – informacje np. o zmieniającym się regulaminie,
//do osób obserwujących daną lokalizację – powiadomienie np. o zagrożeniu gradem.
//Warunki, jakie muszą zostać spełnione:
//
//Osoba zainteresowana może zostać zapisana do danej lokalizacji i zacznie otrzymywać powiadomienia.
//Można wycofać subskrypcję z danej lokalizacji.
//Można wycofać subskrypcję ze wszystkich lokalizacji, co równa się kompletnemu wypisaniu klienta z powiadomień.
//Powiadomienie dla osób w danej lokalizacji powinno dotrzeć tylko do określonej grupy osób.
//Możliwość wysyłki powiadomienia do wszystkich.
//Możliwość skasowania danej lokalizacji.
