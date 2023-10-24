package patterns.factory_method.conveyors;

import patterns.factory_method.cars.Car;
import patterns.factory_method.cars.Coupe;

public class CoupeConveyor extends Conveyor {

    @Override
    public Car getCar() {
        return new Coupe();
    }
}