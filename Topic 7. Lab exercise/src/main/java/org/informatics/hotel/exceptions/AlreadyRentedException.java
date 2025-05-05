package org.informatics.hotel.exceptions;

public class AlreadyRentedException extends Exception {
    private int roomNumber;

    public AlreadyRentedException(String message, int roomNumber) {
        super(message);
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "AlreadyRentedException{" +
                "roomNumber=" + roomNumber +
                "} " + super.toString();
    }
}
