package com.tcdc.FlightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcdc.FlightReservation.Models.User;



public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmail(String email);
	

}
