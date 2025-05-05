package org.informatics.vehicle.data;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private String brand;
    private double price;

    public Vehicle(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
