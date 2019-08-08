package com.hcl.parking.parking.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.parking.dto.ParkingSlot;
import com.hcl.parking.repository.EmployeeRepository;
import com.hcl.parking.repository.ParkAreaRepository;
import com.hcl.parking.repository.ParkDayRepository;
import com.hcl.parking.service.BookingService;


@RunWith(MockitoJUnitRunner.class)
public class TestBookingService {
	
	@InjectMocks
	BookingService bookingService;
	
	@Mock
	EmployeeRepository employeeRepository;
	
	@Mock
	ParkDayRepository parkingDay;
	
	@Mock
	ParkAreaRepository parkingArea;
	
	public ParkingSlot getParkingSlot()
	{
		ParkingSlot park = new ParkingSlot();
		park.setEmpId(1);
		park.setSlotid(1L);
		return park;
	}
	
	@Test
	public void testGetSlot()
	{
		ParkingSlot parkingSlot = getParkingSlot();
		List<ParkingSlot> parkingEmptyList = new ArrayList<ParkingSlot>();
		parkingEmptyList.add(getParkingSlot());
		Mockito.when(parkingDay.findAllParkDayWhichAreNotInUse()).thenReturn(parkingEmptyList);
		ParkingSlot expectedList = bookingService.getSlot();
		Assert.assertEquals(expectedList, parkingSlot);
	}

}
