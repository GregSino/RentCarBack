package com.gregsino.rentcar.controller;

import com.gregsino.rentcar.model.Rent;
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
public class RentController {
    @Autowired
    private RentRepository rentRepository;

    @GetMapping("/rents")
    public List<Rent> getAllRents() {

        return rentRepository.findAll();
    }

    @GetMapping("/rents/{id}")
    public ResponseEntity<Rent> getRentById(@PathVariable(value = "id") Long rentId) throws ResourceNotFoundException {
        Rent rent = rentRepository.findById(rentId)
                .orElseThrow(() -> new ResourceNotFoundException("Unknow rent with this id :: " + rentId));

        return ResponseEntity.ok().body(rent);
    }

    @PostMapping("/rents")
    public Rent createRent(@Valid @RequestBody Rent rent) {

        return rentRepository.save(rent);
    }

    @PutMapping("/rents/{id}")
    public ResponseEntity<Rent> updateRent(@PathVariable(value = "id") Long rentId, @Valid @RequestBody Rent rentDetails) throws ResourceNotFoundException {
        Rent rent = rentRepository.findById(rentId)
                .orElseThrow(() -> new ResourceNotFoundException("Unknow rent with this id :: " + rentId));

        rent.setDriver(rentDetails.getDriver());
        rent.setCar(rentDetails.getCar());

        final Rent updateRent = rentRepository.save(rent);

        return ResponseEntity.ok(updateRent);
    }

    @DeleteMapping("/rents/{id}")
    public Map<String, Boolean> deleteRent(@PathVariable(value = "id") Long rentId) throws ResourceNotFoundException {
        Rent rent = rentRepository.findById(rentId)
                .orElseThrow(() -> new ResourceNotFoundException("Unknow rent with this id :: " + rentId));

        rentRepository.delete(rent);

        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);

        return response;
    }
}
