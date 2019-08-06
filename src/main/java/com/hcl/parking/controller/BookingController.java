package com.hcl.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.parking.model.ParkingAreaPerday;
import com.hcl.parking.service.BookingService;

@RequestMapping("/booking")
@RestController
public class BookingController {

	@Autowired
	BookingService bookingService;
	
	@PostMapping("/booked")
	public ResponseEntity<String> BookingCreated(@RequestBody ParkingAreaPerday parking)
	{
		return new ResponseEntity<String>(bookingService.add() , HttpStatus.OK);
	}
	
}
