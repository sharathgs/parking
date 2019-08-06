package com.hcl.parking.service;

import org.springframework.stereotype.Service;

@Service
public class BookingService {

	public BookingService()
	{
		System.out.println("test");
	}
	
	public String add()
	{
		System.out.println("test1");
		return "pushed";
	}
	
}
