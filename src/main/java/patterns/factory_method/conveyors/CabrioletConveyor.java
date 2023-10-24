package patterns.factory_method.conveyors;

import patterns.factory_method.cars.Cabriolet;
import patterns.factory_method.cars.Car;

public class CabrioletConveyor extends Conveyor {

    @Override
    public Car getCar() {
        return new Cabriolet();
    }
}