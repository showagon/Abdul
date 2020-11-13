package com.tcdc.FlightReservation.services;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tcdc.FlightReservation.Models.Flight;
import com.tcdc.FlightReservation.repos.FlightRepoManual;

@Service
public class FlightServices {

	@Autowired
	FlightRepoManual flightRepoManual;
	
	@Transactional
	public List<Flight> searchFlight(String from, String to, Date departureDate) {
		return flightRepoManual.SearchFlightRepo(from,to,departureDate);
	}
	
	
	@Transactional
	public Flight SingleFlightSer(int id) {
		return flightRepoManual.singleFlight(id);
	}
	
}
