package patterns.abstract_factory;

import patterns.abstract_factory.cars.Car;
import patterns.abstract_factory.factories.AbstractFactory;
import patterns.abstract_factory.factories.CarFactory;
import patterns.abstract_factory.factories.ElectricCarFactory;

public class Main {

    public static void main(String[] args) {

        AbstractFactory factory;

        System.out.println("Создаём автомобили с классическим ДВС:");
        boolean withElectricEngine = false;

        createCompleteLineOfCars(getFactory(withElectricEngine));

        System.out.println();

        System.out.println("Создаём автомобили с электродвигателем:");
        withElectricEngine = true;

        createCompleteLineOfCars(getFactory(withElectricEngine));
    }

    public static AbstractFactory getFactory(boolean withElectricEngine) {
        return withElectricEngine ? new ElectricCarFactory() : new CarFactory();
    }

    public static void createCompleteLineOfCars(AbstractFactory factory) {
        Car car1 = factory.buildCar(BodyType.COUPE);
        Car car2 = factory.buildCar(BodyType.CABRIOLET);
        Car car3 = factory.buildCar(BodyType.ROADSTER);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}