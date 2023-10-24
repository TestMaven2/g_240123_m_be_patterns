package patterns.factory.cars;

import patterns.factory.BodyType;

public abstract class Car {

    private BodyType type;

    public Car(BodyType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Это автомобиль с типом кузова %s.", type.getDescription());
    }
}