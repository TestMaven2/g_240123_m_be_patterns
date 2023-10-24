package patterns.abstract_factory.cars;

import patterns.abstract_factory.BodyType;

public class Roadster extends Car {

    public Roadster() {
        super(BodyType.ROADSTER);
    }
}