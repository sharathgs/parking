package com.hcl.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.parking.model.ParkingArea;

@Repository
public interface ParkAreaRepository extends JpaRepository<ParkingArea, Long> {

}
