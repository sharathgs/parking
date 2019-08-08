package com.hcl.parking.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.parking.dto.NotParked;
import com.hcl.parking.dto.ParkingSlot;
import com.hcl.parking.model.ParkingAreaPerday;
import com.hcl.parking.service.BookingService;

@RequestMapping("/booking")
@RestController
public class BookingController {

	@Autowired
	BookingService bookingService;
	
	@PostMapping("/booked")
	public ResponseEntity<List<NotParked>> BookingCreated(@RequestParam int empId)
	{
		return new ResponseEntity<List<NotParked>>(bookingService.getEmployeeSlot(empId) , HttpStatus.OK);
	}
	
	@PostMapping("/bookingbyemployee")
	public ResponseEntity<ParkingSlot> findParkSlot(@RequestParam int empId)
	{
		return new ResponseEntity<ParkingSlot>(bookingService.getSlot(), HttpStatus.FOUND);
	}
	
	@PostMapping("/rejectedSlot")
	public ResponseEntity<String> rejectSlot(@RequestParam int empId)
	{
		return new ResponseEntity<String>(bookingService.rejectSlot(empId), HttpStatus.ACCEPTED);
	}
	
}
