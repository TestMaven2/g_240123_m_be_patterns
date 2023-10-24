package patterns.abstract_factory.cars;

import patterns.abstract_factory.BodyType;

public class ElectricCoupe extends Car {

    public ElectricCoupe() {
        super(BodyType.COUPE, true);
    }
}