package patterns.factory_method;

import patterns.factory_method.cars.Car;
import patterns.factory_method.factories.CarFactory;
import patterns.factory_method.factories.ElectricCarFactory;

public class CarProduction {

    public Car buildCar(BodyType bodyType, boolean withElectricEngine) {
        return withElectricEngine
                ? new ElectricCarFactory().buildCar(bodyType)
                : new CarFactory().buildCar(bodyType);
    }
}