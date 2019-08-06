package com.hcl.parking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parkingareaperday")
public class ParkingAreaPerday {
	
	@Id
	@GeneratedValue
	private Long parkedId;
	private Long ParkedByArea;
	private String parkingStatus;
	private String parkedPerson;
	
	public ParkingAreaPerday(Long parkedId, Long parkedByArea, String parkingStatus, String parkedPerson) {
		super();
		this.parkedId = parkedId;
		ParkedByArea = parkedByArea;
		this.parkingStatus = parkingStatus;
		this.parkedPerson = parkedPerson;
	}
	
	public ParkingAreaPerday() {
		super();
	}
	
	public Long getParkedId() {
		return parkedId;
	}
	public void setParkedId(Long parkedId) {
		this.parkedId = parkedId;
	}
	public Long getParkedByArea() {
		return ParkedByArea;
	}
	public void setParkedByArea(Long parkedByArea) {
		ParkedByArea = parkedByArea;
	}
	public String getParkingStatus() {
		return parkingStatus;
	}
	public void setParkingStatus(String parkingStatus) {
		this.parkingStatus = parkingStatus;
	}
	public String getParkedPerson() {
		return parkedPerson;
	}
	public void setParkedPerson(String parkedPerson) {
		this.parkedPerson = parkedPerson;
	}

}
