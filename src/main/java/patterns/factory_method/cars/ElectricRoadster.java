package patterns.factory_method.cars;

import patterns.factory_method.BodyType;

public class ElectricRoadster extends Car {

    public ElectricRoadster() {
        super(BodyType.ROADSTER, true);
    }
}