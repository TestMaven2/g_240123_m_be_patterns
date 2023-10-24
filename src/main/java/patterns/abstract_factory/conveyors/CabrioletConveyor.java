package patterns.abstract_factory.conveyors;

import patterns.abstract_factory.cars.Cabriolet;
import patterns.abstract_factory.cars.Car;

public class CabrioletConveyor extends Conveyor {

    @Override
    public Car getCar() {
        return new Cabriolet();
    }
}