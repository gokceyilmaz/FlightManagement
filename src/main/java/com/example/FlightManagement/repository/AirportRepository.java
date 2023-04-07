package com.example.FlightManagement.repository;

import com.example.FlightManagement.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, Long> {
    Airport findByCode(String code);
    Airport updateAirport(Airport airport);
}
