package patterns.factory_method.conveyors;

import patterns.factory_method.cars.Car;
import patterns.factory_method.cars.Roadster;

public class RoadsterConveyor extends Conveyor {

    @Override
    public Car getCar() {
        return new Roadster();
    }
}