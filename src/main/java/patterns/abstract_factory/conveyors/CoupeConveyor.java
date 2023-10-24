package patterns.abstract_factory.conveyors;

import patterns.abstract_factory.cars.Car;
import patterns.abstract_factory.cars.Coupe;

public class CoupeConveyor extends Conveyor {

    @Override
    public Car getCar() {
        return new Coupe();
    }
}