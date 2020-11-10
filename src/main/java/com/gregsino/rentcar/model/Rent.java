package com.gregsino.rentcar.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "rent")
public class Rent implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rentId;

    @ManyToOne
    @JoinColumn(name = "driverId", referencedColumnName="driverId")
    private Driver driver;

    @ManyToOne
    @JoinColumn(name = "carId", referencedColumnName="carId")
    private Car car;

    public Rent() {
    }

    public Rent(Long rentId, Driver driver, Car car) {
        this.rentId = rentId;
        this.driver = driver;
        this.car = car;
    }

    public Long getRentId() {
        return rentId;
    }
    public void setRentId(Long rentId) {
        this.rentId = rentId;
    }

    public Driver getDriver() {
        return driver;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }

}
