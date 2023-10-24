package patterns.abstract_factory.factories;

import patterns.abstract_factory.BodyType;
import patterns.abstract_factory.cars.Car;
import patterns.abstract_factory.conveyors.Conveyor;
import patterns.abstract_factory.conveyors.ElectricCabrioletConveyor;
import patterns.abstract_factory.conveyors.ElectricCoupeConveyor;
import patterns.abstract_factory.conveyors.ElectricRoadsterConveyor;

public class ElectricCarFactory implements AbstractFactory {

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