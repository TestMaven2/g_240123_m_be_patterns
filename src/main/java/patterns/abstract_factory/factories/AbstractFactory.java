package patterns.abstract_factory.factories;

import patterns.abstract_factory.BodyType;
import patterns.abstract_factory.cars.Car;

public interface AbstractFactory {

    Car buildCar(BodyType bodyType);
}