package patterns.factory_method.conveyors;

import patterns.factory_method.cars.Car;
import patterns.factory_method.cars.ElectricCabriolet;

public class ElectricCabrioletConveyor extends Conveyor {

    @Override
    public Car getCar() {
        return new ElectricCabriolet();
    }
}