package patterns.factory.conveyors;

import patterns.factory.cars.Car;
import patterns.factory.cars.Roadster;

public class RoadsterConveyor extends Conveyor {

    @Override
    public Car getCar() {
        return new Roadster();
    }
}