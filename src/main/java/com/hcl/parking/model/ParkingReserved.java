package com.hcl.parking.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reserved")
public class ParkingReserved {

	@Id
	private Long parkedId;
	private Long employeeId;
	private Long parkingId;
	private String parkingArea;
	private Date parkingDate;
	
	public ParkingReserved(Long parkedId, Long employeeId, Long parkingId, String parkingArea, Date parkingDate) {
		super();
		this.parkedId = parkedId;
		this.employeeId = employeeId;
		this.parkingId = parkingId;
		this.parkingArea = parkingArea;
		this.parkingDate = parkingDate;
	}
	
	public ParkingReserved() {
		super();
	}
	
	public Long getParkedId() {
		return parkedId;
	}
	public void setParkedId(Long parkedId) {
		this.parkedId = parkedId;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public Long getParkingId() {
		return parkingId;
	}
	public void setParkingId(Long parkingId) {
		this.parkingId = parkingId;
	}
	public String getParkingArea() {
		return parkingArea;
	}
	public void setParkingArea(String parkingArea) {
		this.parkingArea = parkingArea;
	}
	public Date getParkingDate() {
		return parkingDate;
	}
	public void setParkingDate(Date parkingDate) {
		this.parkingDate = parkingDate;
	} 
}
