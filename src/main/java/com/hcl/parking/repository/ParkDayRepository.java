package com.hcl.parking.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.parking.dto.ParkingSlot;
import com.hcl.parking.model.ParkingAreaPerday;

@Repository
public interface ParkDayRepository extends JpaRepository<ParkingAreaPerday, Long> {

	
	public Optional<ParkingAreaPerday> findByParkedPerson(String parkedPerson);
	
	@Query(value = "SELECT * FROM parkingarea pa INNER JOIN parkingareaperday pd ON pa.park_id = pd.parked_by_area\r\n" + 
			"where pd.parked_person IS NULL AND pd.parking_status = \"not allotted\" AND pd.todaydate = current_date()", nativeQuery = true)
	public List<ParkingSlot> findAllParkDayWhichAreNotInUse();
	
	@Query(value = "SELECT * FROM parking.parkingarea pa LEFT JOIN parking.parkingareaperday pd ON \r\n" + 
			"pa.park_id = pd.parked_by_area where pd.parking_status IS NULL", nativeQuery = true)
	public List<?> findEmptySlots();
	
}
