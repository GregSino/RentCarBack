package com.gregsino.rentcar.model;

public class DriverDTO {
    private Long driverId;
    private String firstName;
    private String LastName;

    public DriverDTO() {
    }

    public DriverDTO(Long driverId, String firstName, String LastName) {
        this.driverId = driverId;
        this.firstName = firstName;
        this.LastName = LastName;
    }

    public Long getDriverId() {
        return driverId;
    }
    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    @Override
    public String toString() {
        return "DriverDTO{" +
                "driverId=" + driverId +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
