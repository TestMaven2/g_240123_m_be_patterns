package patterns.abstract_factory.cars;

import patterns.abstract_factory.BodyType;

public class ElectricCabriolet extends Car {

    public ElectricCabriolet() {
        super(BodyType.CABRIOLET, true);
    }
}