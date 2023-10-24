package patterns.factory_method.conveyors;

import patterns.factory_method.cars.Car;
import patterns.factory_method.cars.ElectricCoupe;

public class ElectricCoupeConveyor extends Conveyor {

    @Override
    public Car getCar() {
        return new ElectricCoupe();
    }
}