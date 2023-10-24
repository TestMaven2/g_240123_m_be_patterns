package patterns.factory_method.cars;

import patterns.factory_method.BodyType;

public class ElectricCoupe extends Car {

    public ElectricCoupe() {
        super(BodyType.COUPE, true);
    }
}