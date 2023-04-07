package com.example.FlightManagement.service.Impl;

import com.example.FlightManagement.entity.Airport;
import com.example.FlightManagement.repository.AirportRepository;
import com.example.FlightManagement.service.AirportService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Transactional
@Service
@RequiredArgsConstructor
public class AirportServiceImpl implements AirportService {

    private final AirportRepository airportRepository;


    @Override
    public List<Airport> getAll() {
        List<Airport> airportList = airportRepository.findAll();
        return airportList;
    }

    @Override
    public Airport findByAirportCode(String code) {
        Airport airport = airportRepository.findByCode(code);
        return airport;
    }

    @Override
    public Airport addAirport(Airport airport) {
        Airport savedAirport = airportRepository.save(airport);
        return savedAirport;
    }

    @Override
    public Airport updateAirport(Airport airport) {
        Airport updatedAirport = airportRepository.updateAirport(airport);
        return updatedAirport;
    }


}
