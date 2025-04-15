package org.informatics.restaurant.data;

public class Pizza {
    private String name;
    private double sellingPrice;

    public Pizza(String name, double sellingPrice) {
        this.name = name;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
