package com.tcdc.FlightReservation.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tcdc.FlightReservation.Models.User;
import com.tcdc.FlightReservation.repos.UserRepository;

@Controller
@SessionAttributes({"email"})
public class LoginController {

	@Autowired
	UserRepository userRepository;
	

	
	@GetMapping("/userRegister")
	public String showRegistration() {
		return "register";
	}
	
	@PostMapping("/registerUser")
	public String SaveRegister(@ModelAttribute("user") User user) {
		//user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		System.out.println(user);
		userRepository.save(user);
		return "login";
	}
	
	@GetMapping("/login")
	public String showLogin() {
		//userRepository.
		return "login";
	}
	
	

	
//	@PostMapping("/LoginProcess")
//	public String LoginProcess(@RequestParam("email") String email, @RequestParam("password") String password,Model model) {
//		
//		User user = userRepository.findByEmail(email);
//		System.out.println(user);
//		String output = email.substring(0, 1).toUpperCase() + email.substring(1);
//		model.addAttribute("email", output);
//		
//		if((user.getPassword().equals(password))&&(user.getRole().contentEquals("0"))) {
//			return "findFlights";
//		}
//		else if((user.getPassword().equals(password))&&(user.getRole().contentEquals("1"))) {
//			return "AddFlight";
//		}
//		else {
//		return "login";
//		}
//		
//	}
	
}
