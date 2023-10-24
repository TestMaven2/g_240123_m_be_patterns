package patterns.factory_method.factories;

import patterns.factory_method.BodyType;
import patterns.factory_method.cars.Car;
import patterns.factory_method.conveyors.*;

public class ElectricCarFactory extends CarFactory {

    @Override
    public Car buildCar(BodyType type) {

        Conveyor conveyor = null;

        switch (type) {
            case COUPE:
                conveyor = new ElectricCoupeConveyor();
                break;
            case CABRIOLET:
                conveyor = new ElectricCabrioletConveyor();
                break;
            case ROADSTER:
                conveyor = new ElectricRoadsterConveyor();
                break;
        }

        conveyor.buildBody();
        conveyor.installEngine();
        conveyor.setupInterior();

        return conveyor.getCar();
    }
}