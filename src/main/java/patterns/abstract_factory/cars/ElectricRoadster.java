package patterns.abstract_factory.cars;

import patterns.abstract_factory.BodyType;

public class ElectricRoadster extends Car {

    public ElectricRoadster() {
        super(BodyType.ROADSTER, true);
    }
}