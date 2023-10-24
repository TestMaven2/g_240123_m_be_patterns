package patterns.factory_method.conveyors;

import patterns.factory_method.cars.Car;
import patterns.factory_method.cars.ElectricRoadster;

public class ElectricRoadsterConveyor extends Conveyor {

    @Override
    public Car getCar() {
        return new ElectricRoadster();
    }
}