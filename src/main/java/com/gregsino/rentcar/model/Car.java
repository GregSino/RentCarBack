package com.gregsino.rentcar.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "matriculation", nullable = false)
    private String matriculation;


    public Car() {
    }

    public Car(String brand, String model, String color, String matriculation) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.matriculation = matriculation;
    }

    public Car(Long carId, String brand, String model, String color, String matriculation) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.matriculation = matriculation;
    }

    public Long getCarId() {
        return carId;
    }
    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getMatriculation() {
        return matriculation;
    }
    public void setMatriculation(String matriculation) {
        this.matriculation = matriculation;
    }


    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", marque='" + brand + '\'' +
                ", modele='" + model + '\'' +
                ", color='" + color + '\'' +
                ", matriculation='" + matriculation + '\'' +
                '}';
    }
}
