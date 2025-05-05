package org.informatics.hotel.exceptions;

public class NoRoomsAvailableException extends RuntimeException {
    private final int totalRoomsInHotel;

    public NoRoomsAvailableException(String message, int totalRoomsInHotel) {
        super(message);
        this.totalRoomsInHotel = totalRoomsInHotel;
    }

    @Override
    public String toString() {
        return "NoRoomsAvailableException{" +
                "totalRoomsInHotel=" + totalRoomsInHotel +
                "} " + super.toString();
    }
}
