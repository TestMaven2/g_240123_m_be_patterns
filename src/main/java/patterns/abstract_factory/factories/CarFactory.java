package patterns.abstract_factory.factories;

import patterns.abstract_factory.BodyType;
import patterns.abstract_factory.cars.Car;
import patterns.abstract_factory.conveyors.CabrioletConveyor;
import patterns.abstract_factory.conveyors.Conveyor;
import patterns.abstract_factory.conveyors.CoupeConveyor;
import patterns.abstract_factory.conveyors.RoadsterConveyor;

public class CarFactory implements AbstractFactory {

    @Override
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