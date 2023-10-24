package patterns.factory.conveyors;

import patterns.factory.cars.Cabriolet;
import patterns.factory.cars.Car;

public class CabrioletConveyor extends Conveyor {

    @Override
    public Car getCar() {
        return new Cabriolet();
    }
}