package Vehicles;

public class Vehicle {
    private Engine engine;

    public Vehicle() {
    }

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine=" + engine +
                '}';
    }
}
