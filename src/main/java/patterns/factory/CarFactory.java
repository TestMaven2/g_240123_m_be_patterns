package patterns.factory;

import patterns.factory.cars.Car;
import patterns.factory.conveyors.CabrioletConveyor;
import patterns.factory.conveyors.Conveyor;
import patterns.factory.conveyors.CoupeConveyor;
import patterns.factory.conveyors.RoadsterConveyor;

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