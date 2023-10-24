package patterns.factory.conveyors;

import patterns.factory.cars.Car;
import patterns.factory.cars.Coupe;

public class CoupeConveyor extends Conveyor {

    @Override
    public Car getCar() {
        return new Coupe();
    }
}