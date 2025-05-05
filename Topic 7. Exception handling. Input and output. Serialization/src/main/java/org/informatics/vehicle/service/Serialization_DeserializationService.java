package org.informatics.vehicle.service;

import org.informatics.vehicle.data.Car;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Serialization_DeserializationService {
    void serializeCar(String filename, Car car) throws IOException;

    Car deserializeCar(String filename) throws IOException, ClassNotFoundException;
}
