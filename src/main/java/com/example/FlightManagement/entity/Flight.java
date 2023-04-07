package com.example.FlightManagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "code")
    private String code;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "arrival_airport_code",referencedColumnName = "id")
    private Airport arrivalAirport;

    @ManyToOne
    @JoinColumn(name = "departure_airport")
    private Airport departureAirport;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "time")
    private LocalDateTime time;

}
