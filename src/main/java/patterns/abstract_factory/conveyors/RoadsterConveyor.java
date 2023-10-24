package patterns.abstract_factory.conveyors;

import patterns.abstract_factory.cars.Car;
import patterns.abstract_factory.cars.Roadster;

public class RoadsterConveyor extends Conveyor {

    @Override
    public Car getCar() {
        return new Roadster();
    }
}