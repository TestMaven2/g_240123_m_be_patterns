package patterns.factory_method.cars;

import patterns.factory_method.BodyType;

public class Roadster extends Car {

    public Roadster() {
        super(BodyType.ROADSTER);
    }
}