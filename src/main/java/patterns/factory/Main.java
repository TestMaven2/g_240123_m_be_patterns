package patterns.factory;

import patterns.factory.cars.Car;
import patterns.factory.cars.Roadster;

public class Main {

    public static void main(String[] args) {

        CarFactory factory = new CarFactory();

        Car car1 = factory.buildCar(BodyType.COUPE);
        Car car2 = factory.buildCar(BodyType.CABRIOLET);
        Car car3 = factory.buildCar(BodyType.ROADSTER);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}