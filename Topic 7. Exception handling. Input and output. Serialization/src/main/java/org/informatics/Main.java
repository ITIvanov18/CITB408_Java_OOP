package org.informatics;

import org.informatics.packaging.Box;
import org.informatics.packaging.exception.IllegalIncreaseValueException;
import org.informatics.packaging.service.BoxService;
import org.informatics.packaging.service.impl.BoxServiceImpl;
import org.informatics.vehicle.data.Car;
import org.informatics.vehicle.service.Serialization_DeserializationService;
import org.informatics.vehicle.service.Serialization_DeserializationServiceImpl;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IllegalIncreaseValueException {
        Box box = new Box(10,10,10);

        BoxService boxService = new BoxServiceImpl();

        boxService.increaseSides(box, 5);

        Car car = new Car("Audi", 15000, false);
        Serialization_DeserializationService service = new Serialization_DeserializationServiceImpl();
        String filename = "car.ser";
        try {
            service.serializeCar(filename, car);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        car.setPrice(14500);

        Car oldCar;
        try {
            oldCar = service.deserializeCar(filename);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(oldCar);
    }

}