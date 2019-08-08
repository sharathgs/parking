package com.hcl.parking.dto;

import java.util.Date;

public class NotParked {
	
	private Long parkId;
	private String parkArea;
	private Long parkedId;
	private Long ParkedByArea;
	private String parkingStatus;
	private String parkedPerson;
	private Date todaydate;
	
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
	public Date getTodaydate() {
		return todaydate;
	}
	public void setTodaydate(Date todaydate) {
		this.todaydate = todaydate;
	}

}
