package org.informatics.hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private int numberOfRooms;
    private List<Integer> rentedRooms;

    public Hotel(String name, int numberOfRooms) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.rentedRooms = new ArrayList<Integer>();
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getRentedRooms() {
        return rentedRooms;
    }

    public void setRentedRooms(List<Integer> rentedRooms) {
        this.rentedRooms = rentedRooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", numberOfRooms=" + numberOfRooms +
                '}';
    }
}
