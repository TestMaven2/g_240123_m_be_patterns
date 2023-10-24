package patterns.abstract_factory.conveyors;

import patterns.abstract_factory.cars.Car;
import patterns.abstract_factory.cars.ElectricCabriolet;

public class ElectricCabrioletConveyor extends Conveyor {

    @Override
    public Car getCar() {
        return new ElectricCabriolet();
    }
}