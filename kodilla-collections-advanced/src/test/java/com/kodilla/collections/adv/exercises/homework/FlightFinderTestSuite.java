package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom_givenCityWithFlights_thenReturnMatchingFlights() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");
        assertEquals(2, result.size());
        assertTrue(result.contains(new Flight("Warsaw", "London")));
        assertTrue(result.contains(new Flight("Warsaw", "Paris")));
    }

    @Test
    public void testFindFlightsFrom_givenCityWithoutFlights_thenReturnEmptyList() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsFrom("Zakopane");
        assertEquals(0, result.size());
    }
    @Test
    public void testFindFlightsTo_givenCityWithFlights_thenReturnMatchingFlights() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsTo("Warsaw");
        assertEquals(2, result.size());
        assertTrue(result.contains(new Flight("Berlin", "Warsaw")));
        assertTrue(result.contains(new Flight("Madrid", "Warsaw")));
    }
}