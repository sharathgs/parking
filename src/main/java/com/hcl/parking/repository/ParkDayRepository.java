package com.hcl.parking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.parking.model.ParkingAreaPerday;

@Repository
public interface ParkDayRepository extends JpaRepository<ParkingAreaPerday, Long> {

	
	public Optional<ParkingAreaPerday> findByParkedPerson(String parkedPerson);
	
}
