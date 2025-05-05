package org.informatics.vehicle.data;

import java.io.Serializable;

public class Car extends Vehicle implements Serializable {
    private boolean isWagon;

    public Car(String brand, double price, boolean isWagon) {
        super(brand, price);
        this.isWagon = isWagon;
    }

    public boolean isWagon() {
        return isWagon;
    }

    public void setWagon(boolean wagon) {
        isWagon = wagon;
    }

    @Override
    public String toString() {
        return "Car{" +
                "isWagon=" + isWagon +
                "} " + super.toString();
    }
}
