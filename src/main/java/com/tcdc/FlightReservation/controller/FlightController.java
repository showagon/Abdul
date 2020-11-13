package com.tcdc.FlightReservation.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tcdc.FlightReservation.Models.Flight;
import com.tcdc.FlightReservation.repos.FlightRepository;
import com.tcdc.FlightReservation.services.FlightServices;

@Controller
@SessionAttributes("flight")
public class FlightController {

	@Autowired
	FlightServices flightServices;

	@Autowired
	FlightRepository flightRepository;

	@GetMapping("/addflight")
	public String add() {
		//userRepository.
		return "AddFlight";
	}
	
	
	@GetMapping("/findFlight")
	public String findFlights() {
		//userRepository.
		return "findFlights";
	}
	
	
	@PostMapping("/flightResult")
	public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("departureDate") @DateTimeFormat(pattern = "dd-MM-yyyy") Date departureDate, Model model) {

		// flightRepository.findFlight(from,to,departureDate);
		System.out.println(from + " " + to + " " + departureDate);
		List<Flight> flist = flightServices.searchFlight(from, to, departureDate);
		model.addAttribute("flightdetails", flist);
		System.out.println(flist);
		return "FlightResults";
	}

	@PostMapping("/SaveFlight")
	public String SaveFlight(@RequestParam("estimatedTravelTime111") String ett,
			@RequestParam("dateOfDeparture") String dod, @RequestParam("flightnumber") String fn,
			@RequestParam("operatingAirlines") String oa, @RequestParam("departureCity") String dec,
			@RequestParam("arivalCity") String arc) {

		// @ModelAttribute("flight") Flight flight
		// flightRepository.save(flight);
		
	
	
	    
		System.out.println(ett + "--" + dod + "--" + fn + "--" + oa + "--" + dec + "--" + arc);

		Date date1;
		Flight f1 = null;
		try {
			date1 = new SimpleDateFormat("dd-MM-yyyy").parse(dod);
			DateFormat timeformatter = new SimpleDateFormat("hh:mm:ss a");
			Date time = (Date) timeformatter.parse(ett);

			f1 = new Flight(fn, oa, dec, arc, date1, time);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		flightRepository.save(f1);

		return "FlightResults";
	}
	
	@GetMapping("/fcart")
	public String flightCart(@RequestParam("id") String id,Model model) {
		int theid = Integer.parseInt(id);
		Flight f1 = flightServices.SingleFlightSer(theid);
		System.out.println(f1);
		model.addAttribute("flight", f1);
		return "fcart";
	}

	@GetMapping("/confirm")
	public String ticketConfirmation() {
		
		return "success";
	}

}
