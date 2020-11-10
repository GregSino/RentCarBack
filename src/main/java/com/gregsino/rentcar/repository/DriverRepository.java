package com.gregsino.rentcar.repository;

import com.gregsino.rentcar.model.Driver;
import com.gregsino.rentcar.model.DriverDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    @Query("SELECT new com.gregsino.rentcar.model.DriverDTO(d.driverId, d.firstName, d.lastName) FROM Driver d")
    List<DriverDTO> findAllDrivers();
}
