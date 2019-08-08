package com.hcl.parking.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.parking.dto.NotParked;
import com.hcl.parking.dto.ParkingSlot;
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
	
	
	public List<NotParked> getEmployeeSlot(int empId)
	{
		Optional<Employee> employeeDetails = employeeRepository.findById(empId);
		if(employeeDetails.isPresent())
		{		
			//Optional<ParkingAreaPerday> perDay = pdayRepository.findByParkedPerson(employeeDetails.get().getEmployeeName());	
			List parkList = pdayRepository.findAllParkDayWhichAreNotInUse();
			List emptySlotList = pdayRepository.findEmptySlots();
			if(parkList.size() != 0)
			{
				return (List<NotParked>) parkList.get(0);
			}else
			{
				return (List<NotParked>) emptySlotList.get(0);
			}
		}
		return null;
	}
	
	
	public ParkingSlot getSlot()
	{
		List parking = pdayRepository.findAllParkDayWhichAreNotInUse();
		return (ParkingSlot) parking.get(0);
	}
	
	public String rejectSlot(int empId)
	{
		Optional<Employee> foundEmployee = employeeRepository.findById(empId);
		if(foundEmployee.isPresent())
		{
			Optional<ParkingAreaPerday> pdayData = pdayRepository.findByParkedPerson(foundEmployee.get().getEmployeeName());
			if(pdayData.isPresent())
			{
				pdayData.get().setParkingStatus("Rejected");
				pdayData.get().getParkedId();
				pdayRepository.save(pdayData.get());
				return "rejected";
			}
		}
		return "not rejected";
	}
	
}
