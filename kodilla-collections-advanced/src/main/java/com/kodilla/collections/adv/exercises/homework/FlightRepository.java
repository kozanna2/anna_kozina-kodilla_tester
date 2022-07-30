package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FlightRepository {
        public static List<Flight> getFlightsTable(){
       List<Flight> flights = new ArrayList<>();
       flights.add(new Flight("Katowice", "Warszawa"));
       flights.add(new Flight("Kraków", "Berlin"));
       flights.add(new Flight("Berlin", "Warszawa"));
       flights.add(new Flight("Warszwa", "Katowice"));
       flights.add(new Flight("Katowice", "Berlin"));
       flights.add(new Flight("Katowice", "Kraków"));
       flights.add(new Flight("Warszawa", "Praga"));
       flights.add(new Flight("Praga", "Warszawa"));
       flights.add(new Flight("Praga", "Katowice"));
       flights.add(new Flight("Berlin", "Praga"));
       return flights;
    }
}
