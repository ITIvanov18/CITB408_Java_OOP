package org.informatics;

import org.informatics.hotel.Hotel;
import org.informatics.hotel.exceptions.AlreadyRentedException;
import org.informatics.hotel.service.HotelService;
import org.informatics.hotel.service.impl.HotelServiceImpl;


public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Marinela", 50);

        HotelService hotelService = new HotelServiceImpl();

        try {
            hotelService.rentRoom(hotel, 21);
        } catch (AlreadyRentedException e) {
            throw new RuntimeException(e);
        }
    }
}