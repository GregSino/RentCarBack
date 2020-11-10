package com.gregsino.rentcar.repository;

import com.gregsino.rentcar.model.Car;
import com.gregsino.rentcar.model.CarDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    @Query("SELECT new com.gregsino.rentcar.model.CarDTO(c.carId, c.brand, c.model) FROM Car c")
    List<CarDTO> findAllCars();
}
