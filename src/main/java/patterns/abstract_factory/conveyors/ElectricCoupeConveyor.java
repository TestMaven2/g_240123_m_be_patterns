package patterns.abstract_factory.conveyors;

import patterns.abstract_factory.cars.Car;
import patterns.abstract_factory.cars.ElectricCoupe;

public class ElectricCoupeConveyor extends Conveyor {

    @Override
    public Car getCar() {
        return new ElectricCoupe();
    }
}