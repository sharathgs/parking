package com.hcl.parking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.parking.model.ParkingAreaPerday;

@RequestMapping("/booking")
@RestController
public class BookingController {

	@PostMapping("/booked")
	public ResponseEntity<String> BookingCreated(@RequestBody ParkingAreaPerday parking)
	{
		return new ResponseEntity<String>("Booking created" , HttpStatus.OK);
	}
	
}
