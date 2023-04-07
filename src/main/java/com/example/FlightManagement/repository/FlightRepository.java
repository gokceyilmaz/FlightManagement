package com.example.FlightManagement.repository;

import com.example.FlightManagement.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
}
