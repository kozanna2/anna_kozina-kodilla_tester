package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {
    @Test
    public void findFlightsTo_addingToList_correctAdding() {
        //given
        List<Flight> flightList = FlightRepository.getFlightsTable();
        FlightFinder finder = new FlightFinder();
        //when

        List<Flight> result = finder.findFlightsTo("Berlin");
        //then
        assertEquals(2, result.size());
    }
    @Test
    public void findFlightsTo_searchingArrivalInFlightRepository_addingToArrivalList() {
        //given
        List<Flight> flightList = FlightRepository.getFlightsTable();
        FlightFinder finder = new FlightFinder();
        //when

        List<Flight> result = finder.findFlightsTo("Praga");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warszawa", "Praga"));
        expectedList.add(new Flight("Berlin", "Praga"));
        assertEquals(expectedList, result);
    }

    @Test
    public void findFlightsTo_searchingArrivalWhichIsNotInFlightRepository_emptyArrivalList() {
        //given
        List<Flight> flightList = FlightRepository.getFlightsTable();
        FlightFinder finder = new FlightFinder();
        //when

        List<Flight> result = finder.findFlightsTo("Mediolan");
        //then
        assertEquals(0, result.size());
    }

    @Test
    public void findFlightsFrom_addingToList_correctAdding() {
        //given
        List<Flight> flightList = FlightRepository.getFlightsTable();
        FlightFinder finder = new FlightFinder();
        //when
        List<Flight> result = finder.findFlightsFrom("Berlin");
        //then
        assertEquals(2  , result.size());
    }
    @Test
    public void findFlightsFrom_searchingDepartureInFlightRepository_addingToDepartureList() {
        //given
        List<Flight> flightList = FlightRepository.getFlightsTable();
        FlightFinder finder = new FlightFinder();
        //when
        List<Flight> result = finder.findFlightsFrom("Berlin");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Berlin", "Warszawa"));
        expectedList.add(new Flight("Berlin", "Praga"));
        assertEquals(expectedList, result);
    }
    @Test
    public void findFlightsFrom_searchingDepartureWhichIsNotInFlightRepository_emptyDepartureList() {
        //given
        List<Flight> flightList = FlightRepository.getFlightsTable();
        FlightFinder finder = new FlightFinder();
        //when
        List<Flight> result = finder.findFlightsFrom("Lodz");
        //then
        assertEquals(0, result.size());
    }
}