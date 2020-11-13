package com.tcdc.FlightReservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tcdc.FlightReservation.UserDetailsImpl;
import com.tcdc.FlightReservation.Models.User;
import com.tcdc.FlightReservation.repos.UserRepository;


@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userepo.findByEmail(username);
		
		if(user==null)
		{
			throw new UsernameNotFoundException("User are password are invalid");
		}
		
		return new UserDetailsImpl(user);
	}

}
