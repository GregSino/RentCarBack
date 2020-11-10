package com.gregsino.rentcar.controller;

import com.gregsino.rentcar.model.Car;
import com.gregsino.rentcar.model.CarDTO;
import com.gregsino.rentcar.repository.CarRepository;
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
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping("/cars")
    public List<Car> getAllCars() {

        return carRepository.findAll();
    }

    @GetMapping("/cars/min")
    public List<CarDTO> getAllMinCars() {

        return carRepository.findAllCars();
    }

    @GetMapping("/cars/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable(value = "id") Long carId) throws ResourceNotFoundException {
        Car car = carRepository.findById(carId)
                .orElseThrow(() -> new ResourceNotFoundException("Unknown cars with this id :: " + carId));

        return ResponseEntity.ok().body(car);
    }

    @PostMapping("/cars")
    public Car createCar(@Valid @RequestBody Car car) {

        return carRepository.save(car);
    }

    @PutMapping("/cars/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable(value = "id") Long carId, @Valid @RequestBody Car carDetails) throws ResourceNotFoundException {
        Car car = carRepository.findById(carId)
                .orElseThrow(() -> new  ResourceNotFoundException("Unknown cars with this id :: " + carId));

        car.setColor(carDetails.getColor());
        car.setMatriculation(carDetails.getMatriculation());
        car.setBrand(carDetails.getBrand());
        car.setModel(carDetails.getModel());

        final Car updateCar = carRepository.save(car);
        return ResponseEntity.ok(updateCar);
    }

    @DeleteMapping("/cars/{id}")
    public Map<String, Boolean> deleteCar(@PathVariable(value = "id") Long carId) throws ResourceNotFoundException {
        Car car = carRepository.findById(carId)
                .orElseThrow(()-> new ResourceNotFoundException("Unknown cars with this id :: " + carId));

        carRepository.delete(car);

        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);

        return response;
    }
}
