package org.informatics.hotel.service.impl;

import org.informatics.hotel.Hotel;
import org.informatics.hotel.exceptions.AlreadyRentedException;
import org.informatics.hotel.exceptions.NoRoomsAvailableException;
import org.informatics.hotel.service.HotelService;

public class HotelServiceImpl implements HotelService {
    @Override
    public void rentRoom(Hotel hotel, int roomNumber) throws AlreadyRentedException {
        if(hotel.getRentedRooms().size() >= hotel.getNumberOfRooms()){
            throw new NoRoomsAvailableException("There aren't any available rooms!", hotel.getNumberOfRooms());
        }
        if(hotel.getRentedRooms().contains(roomNumber)){
            throw new AlreadyRentedException("This room is already rented: ", roomNumber);
        }
        hotel.getRentedRooms().add(roomNumber);
    }
}
