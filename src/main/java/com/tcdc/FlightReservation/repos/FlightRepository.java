package com.tcdc.FlightReservation.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcdc.FlightReservation.Models.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

	//List<Flight> findFlight(String from, String to, Date departureDate);

}
