package com.tcdc.FlightReservation.Models;


import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;



import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="FLIGHT")
public class Flight {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	private String flightnumber;
	@Column(name="operatingairlines")
	private String operatingAirlines;
	@Column(name="departurecity")
	private String departureCity;
	@Column(name="arrivalcity")
	private String arivalCity;
	
	@Column(name="departuredate")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    @NotNull
	private Date dateOfDeparture;
	
	@Column(name="departuretime")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="hh:mm:ss a")
    @NotNull
    @Temporal(TemporalType.TIME)
	private Date estimatedTravelTime;
	
	
	public Flight() {
		
	}

	
	public Flight(String flightnumber, String operatingAirlines, String departureCity, String arivalCity,
			@NotNull Date dateOfDeparture, @NotNull Date estimatedTravelTime) {
		
		this.flightnumber = flightnumber;
		this.operatingAirlines = operatingAirlines;
		this.departureCity = departureCity;
		this.arivalCity = arivalCity;
		this.dateOfDeparture = dateOfDeparture;
		this.estimatedTravelTime = estimatedTravelTime;
	}

	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}

	public String getFlightnumber() {
		return flightnumber;
	}

	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}

	public String getOperatingAirlines() {
		return operatingAirlines;
	}

	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArivalCity() {
		return arivalCity;
	}

	public void setArivalCity(String arivalCity) {
		this.arivalCity = arivalCity;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}



	public Date getEstimatedTravelTime() {
		return estimatedTravelTime;
	}

	public void setEstimatedTravelTime(Date estimatedTravelTime) {
		this.estimatedTravelTime = estimatedTravelTime;
	}

	@Override
	public String toString() {
		return "Flight [ID=" + ID + ", flightnumber=" + flightnumber + ", operatingAirlines=" + operatingAirlines
				+ ", departureCity=" + departureCity + ", arivalCity=" + arivalCity + ", dateOfDeparture="
				+ dateOfDeparture + ", estimatedTravelTime=" + estimatedTravelTime + "]";
	}

	

}
