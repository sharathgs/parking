package com.hcl.parking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	
	@Id
	@GeneratedValue
	private Long id;
	private String adminName;
	private Long adminPhone;
	private String adminPassword;
	
	
	public Admin(Long id, String adminName, Long adminPhone, String adminPassword) {
		super();
		this.id = id;
		this.adminName = adminName;
		this.adminPhone = adminPhone;
		this.adminPassword = adminPassword;
	}
	public Admin() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public Long getAdminPhone() {
		return adminPhone;
	}
	public void setAdminPhone(Long adminPhone) {
		this.adminPhone = adminPhone;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

}
