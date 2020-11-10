package com.gregsino.rentcar.model;

public class CarDTO {
    private Long carId;
    private String brand;
    private String model;

    public CarDTO() { }

    public CarDTO(Long carId, String brand, String model) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
    }

    public Long getCarId() {
        return carId;
    }
    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getMarque() {
        return brand;
    }
    public void setMarque(String brand) {
        this.brand = brand;
    }

    public String getModele() {
        return model;
    }
    public void setModele(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "carId=" + carId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
