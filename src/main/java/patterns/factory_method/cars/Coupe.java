package patterns.factory_method.cars;

import patterns.factory_method.BodyType;

public class Coupe extends Car {

    public Coupe() {
        super(BodyType.COUPE);
    }
}