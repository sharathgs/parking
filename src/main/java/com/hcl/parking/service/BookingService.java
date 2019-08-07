package com.hcl.parking.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.parking.model.Employee;
import com.hcl.parking.model.ParkingArea;
import com.hcl.parking.model.ParkingAreaPerday;
import com.hcl.parking.model.ParkingReserved;
import com.hcl.parking.repository.EmployeeRepository;
import com.hcl.parking.repository.ParkAreaRepository;
import com.hcl.parking.repository.ParkDayRepository;

@Service
public class BookingService {

	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	ParkAreaRepository pareaRepository;
	
	@Autowired
	ParkDayRepository pdayRepository;
	
	public String getEmployeeSlot(int empId)
	{
		Optional<Employee> employeeDetails = employeeRepository.findById(empId);
		if(employeeDetails.isPresent())
		{		
			Optional<ParkingAreaPerday> perDay = pdayRepository.findByParkedPerson(employeeDetails.get().getEmployeeName());			
		}
		System.out.println("test1 "+empId);
		return "pushed";
	}
	
}
