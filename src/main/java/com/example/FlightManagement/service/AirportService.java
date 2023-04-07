package com.example.FlightManagement.service;

import com.example.FlightManagement.entity.Airport;

import java.util.List;

public interface AirportService {
    List<Airport> getAll();

    Airport findByAirportCode(String code);

    Airport addAirport(Airport airport);

    Airport updateAirport(Airport airport);
}
