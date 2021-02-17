package com.company;

import lombok.ToString;

@ToString

public class Car {

    public String model;
    public String licenseNumber;
    private  float km;
    private String owner_name;

    private static int carsCounter = 0;

    public String getCarOwenerName () {
        return owner_name;
    }
    public static int getNumberOfCreatedCars () {
        return carsCounter;
    }

    public Car(String model, String licenseNumber, float km, String owner_name) {
        this.model = model;
        this.licenseNumber = licenseNumber;
        this.km = km;
        this.owner_name = owner_name;
        carsCounter++;
    }
}
