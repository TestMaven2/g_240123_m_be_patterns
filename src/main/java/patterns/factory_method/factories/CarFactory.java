package patterns.factory_method.factories;

import patterns.factory_method.BodyType;
import patterns.factory_method.cars.Car;
import patterns.factory_method.conveyors.CabrioletConveyor;
import patterns.factory_method.conveyors.Conveyor;
import patterns.factory_method.conveyors.CoupeConveyor;
import patterns.factory_method.conveyors.RoadsterConveyor;

public class CarFactory {

    public Car buildCar(BodyType type) {

        Conveyor conveyor = null;

        switch (type) {
            case COUPE:
                conveyor = new CoupeConveyor();
                break;
            case CABRIOLET:
                conveyor = new CabrioletConveyor();
                break;
            case ROADSTER:
                conveyor = new RoadsterConveyor();
                break;
        }

        conveyor.buildBody();
        conveyor.installEngine();
        conveyor.setupInterior();

        return conveyor.getCar();
    }
}