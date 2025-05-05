package org.informatics.hotel.service;

import org.informatics.hotel.Hotel;
import org.informatics.hotel.exceptions.AlreadyRentedException;

public interface HotelService {
    void rentRoom(Hotel hotel, int roomNumber) throws AlreadyRentedException;
}
