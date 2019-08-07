package com.hcl.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.parking.model.ParkingReserved;

@Repository
public interface ReservedRepository extends JpaRepository<ParkingReserved, Long> {

}
