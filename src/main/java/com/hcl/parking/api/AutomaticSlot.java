package com.hcl.parking.api;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.hcl.parking.model.Employee;
import com.hcl.parking.model.ParkingArea;
import com.hcl.parking.model.ParkingAreaPerday;
import com.hcl.parking.repository.EmployeeRepository;
import com.hcl.parking.repository.ParkAreaRepository;
import com.hcl.parking.repository.ParkDayRepository;

@Component
public class AutomaticSlot {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	ParkAreaRepository pareaRepository;
	
	@Autowired
	ParkDayRepository pdayRepository;
	
	@Scheduled(cron = "0 0 0 * * *")
	//@Scheduled(fixedDelay = 10000)
	   public void fixedRateSch() {
		
		List<Employee> employeeDetails = employeeRepository.findAll();
		List<ParkingArea> parkingSlot = pareaRepository.findAll();
		Date today = new Date();
		int count =0;
		for(Employee employee : employeeDetails)
		{
			ParkingAreaPerday perDay = new ParkingAreaPerday();
			int difference = today.getYear() - employee.getJoiningDate().getYear();
			if(employee.getEmployeeDesignation() == "President" || employee.getEmployeeDesignation() == "Vice President"
				||	difference > 15)
			{
				ParkingArea parkingArea = parkingSlot.get(count++);
				perDay.setParkedByArea(parkingArea.getParkId());
				perDay.setParkedPerson(employee.getEmployeeName());
				perDay.setParkingStatus("pending");
				perDay.setTodaydate(today);
				pdayRepository.save(perDay);
			}else {
				ParkingArea parkingArea = parkingSlot.get(count++);
				perDay.setParkedByArea(parkingArea.getParkId());
				perDay.setParkingStatus("not allotted");
				perDay.setTodaydate(today);
				pdayRepository.save(perDay);
			}
		}
	   }

}
