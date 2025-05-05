package org.informatics.vehicle.service;

import org.informatics.vehicle.data.Car;

import java.io.*;

public class Serialization_DeserializationServiceImpl implements Serialization_DeserializationService {
    @Override
    public void serializeCar(String filename, Car car) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filename)){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(car);
        }
    }

    @Override
    public Car deserializeCar(String filename) throws IOException, ClassNotFoundException {
        Car car = null;
        try(FileInputStream fis = new FileInputStream(filename)){
            ObjectInputStream ois = new ObjectInputStream(fis);
            car = (Car) ois.readObject();
        }

        return car;
    }
}
