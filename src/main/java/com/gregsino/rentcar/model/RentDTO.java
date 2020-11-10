package com.gregsino.rentcar.model;

public class RentDTO {
    private Long id;
    private Driver driverId;
    private Car carId;

    public RentDTO() { }

    public RentDTO(Long id, Driver driverId, Car carId) {
        this.id = id;
        this.driverId = driverId;
        this.carId = carId;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Driver getDriverId() {
        return driverId;
    }
    public void setDriverId(Driver driverId) {
        this.driverId = driverId;
    }

    public Car getCarId() {
        return carId;
    }
    public void setCarId(Car carId) {
        this.carId = carId;
    }

    @Override
    public String toString() {
        return "RentDTO{" +
                "id=" + id +
                ", driverId=" + driverId +
                ", carId=" + carId +
                '}';
    }
}
