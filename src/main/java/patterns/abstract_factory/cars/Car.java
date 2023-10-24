package patterns.abstract_factory.cars;

import patterns.abstract_factory.BodyType;

public abstract class Car {

    private BodyType type;
    private boolean withElectricEngine;

    public Car(BodyType type) {
        this.type = type;
    }

    public Car(BodyType type, boolean withElectricEngine) {
        this.type = type;
        this.withElectricEngine = withElectricEngine;
    }

    @Override
    public String toString() {
        return String.format("Это автомобиль с типом кузова %s%s.",
                type.getDescription(), withElectricEngine ? " с электродвигателем" : "");
    }
}