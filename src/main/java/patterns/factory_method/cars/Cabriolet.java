package patterns.factory_method.cars;

import patterns.factory_method.BodyType;

public class Cabriolet extends Car {

    public Cabriolet() {
        super(BodyType.CABRIOLET);
    }
}