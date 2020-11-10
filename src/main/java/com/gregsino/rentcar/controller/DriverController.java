package com.gregsino.rentcar.controller;

import com.gregsino.rentcar.model.Driver;
import com.gregsino.rentcar.model.DriverDTO;
import com.gregsino.rentcar.model.Rent;
import com.gregsino.rentcar.repository.DriverRepository;
import com.gregsino.rentcar.repository.RentRepository;
import com.gregsino.rentcar.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class DriverController {
    @Autowired
    private DriverRepository driverRepository;
    @Autowired
    private RentRepository rentRepository;

    @GetMapping("/drivers")
    public List<Driver> getAllDrivers() {

        return driverRepository.findAll();
    }

    @GetMapping("/drivers/min")
    public List<DriverDTO> getAllMinDrivers() {

        return driverRepository.findAllDrivers();
    }

    @GetMapping("/drivers/{id}")
    public ResponseEntity<Driver> getDriverById(@PathVariable(value = "id") Long driverId) throws ResourceNotFoundException {
        Driver driver = driverRepository.findById(driverId)
                .orElseThrow(() -> new ResourceNotFoundException("Unknow driver with this id :: " + driverId));

        return ResponseEntity.ok().body(driver);
    }

    @PostMapping("/drivers")
    public Driver createDriver(@Valid @RequestBody Driver driver) {

        return driverRepository.save(driver);
    }

    @PutMapping("/drivers/{id}")
    public ResponseEntity<Driver> updateDriver(@PathVariable(value = "id") Long driverId, @Valid @RequestBody Driver driverDetails) throws ResourceNotFoundException {
        Driver driver = driverRepository.findById(driverId)
                .orElseThrow(() -> new ResourceNotFoundException("Unknown driver with this id :: " + driverId));

        driver.setLastName(driverDetails.getLastName());
        driver.setFirstName(driverDetails.getFirstName());

        final Driver updateDriver = driverRepository.save(driver);

        return ResponseEntity.ok(updateDriver);
    }

    @DeleteMapping("/drivers/{id}")
    public Map<String, Boolean> deleteDriver(@PathVariable(value = "id") Long driverId) throws ResourceNotFoundException {
        Driver driver = driverRepository.findById(driverId)
                .orElseThrow(() -> new ResourceNotFoundException("Unknown driver with this id :: " + driverId));

        driverRepository.delete(driver);

        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);

        return response;
    }

    @GetMapping("/drivers/rents")
    public List<Rent> getAllRents() {

        return rentRepository.findAll();
    }
}
