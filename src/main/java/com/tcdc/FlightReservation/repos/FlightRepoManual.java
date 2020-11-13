package com.tcdc.FlightReservation.repos;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tcdc.FlightReservation.Models.Flight;

@Repository
public class FlightRepoManual {

	@Autowired
	private EntityManager entityManager;
	
	public List<Flight> SearchFlightRepo(String from, String to, Date departureDate) {
            
		Session session = entityManager.unwrap(Session.class);
		List<Flight> flights = session.createNativeQuery("SELECT * FROM FLIGHT",Flight.class).list();
		return flights;
	}

	
	public Flight singleFlight(int id){
		
		Session session = entityManager.unwrap(Session.class);
		Flight flights = session.get(Flight.class, id);
		return flights;
	}
	

	
}
