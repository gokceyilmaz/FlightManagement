package com.example.FlightManagement.controller;

import com.example.FlightManagement.entity.Airport;
import com.example.FlightManagement.service.AirportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/flight")
public class FlightController {

    private final AirportService airportService;

    @PostMapping(value = "/airport")
    public Airport addAirport(@RequestBody Airport airport){
        return airportService.addAirport(airport);
    }

    @GetMapping(value = "/airport")
    public List<Airport> getAllAirports(){
        return airportService.getAll();
    }

    @GetMapping(value = "/airport/{code}")
    public Airport getAirportByCode(@PathVariable("code") String code){
        return airportService.findByAirportCode(code);
    }

    @PutMapping(value = "/airport")
    public Airport updatedAirport(@RequestBody Airport airport){
        return airportService.updateAirport(airport);
    }
}
