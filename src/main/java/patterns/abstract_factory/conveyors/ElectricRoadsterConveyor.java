package patterns.abstract_factory.conveyors;

import patterns.abstract_factory.cars.Car;
import patterns.abstract_factory.cars.ElectricRoadster;

public class ElectricRoadsterConveyor extends Conveyor {

    @Override
    public Car getCar() {
        return new ElectricRoadster();
    }
}