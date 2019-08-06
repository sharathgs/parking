package com.hcl.parking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parkingarea")
public class ParkingArea {
	
	@Id
	@GeneratedValue
	private Long parkId;
	private String parkArea;
	
	public ParkingArea(Long parkId, String parkArea) {
		super();
		this.parkId = parkId;
		this.parkArea = parkArea;
	}
	public ParkingArea() {
		super();
	}
	public Long getParkId() {
		return parkId;
	}
	public void setParkId(Long parkId) {
		this.parkId = parkId;
	}
	public String getParkArea() {
		return parkArea;
	}
	public void setParkArea(String parkArea) {
		this.parkArea = parkArea;
	}

}
