package patterns.factory_method.cars;

import patterns.factory_method.BodyType;

public class ElectricCabriolet extends Car {

    public ElectricCabriolet() {
        super(BodyType.CABRIOLET, true);
    }
}