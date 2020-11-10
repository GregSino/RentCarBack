package com.gregsino.rentcar.repository;

import com.gregsino.rentcar.model.Rent;
import com.gregsino.rentcar.model.RentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentRepository extends JpaRepository<Rent, Long> {
    @Query("SELECT new com.gregsino.rentcar.model.RentDTO(r.rentId, r.driver, r.car) FROM Rent r")
    List<RentDTO> findAllRents();
}
