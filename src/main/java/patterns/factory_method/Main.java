package patterns.factory_method;

import patterns.factory_method.cars.Car;

public class Main {

    public static void main(String[] args) {

        CarProduction carProduction = new CarProduction();

        System.out.println("Создаём автомобили с классическим ДВС:");
        Car car1 = carProduction.buildCar(BodyType.COUPE, false);
        Car car2 = carProduction.buildCar(BodyType.CABRIOLET, false);
        Car car3 = carProduction.buildCar(BodyType.ROADSTER, false);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        System.out.println();

        System.out.println("Создаём автомобили с электродвигателем:");
        Car car4 = carProduction.buildCar(BodyType.COUPE, true);
        Car car5 = carProduction.buildCar(BodyType.CABRIOLET, true);
        Car car6 = carProduction.buildCar(BodyType.ROADSTER, true);

        System.out.println(car4);
        System.out.println(car5);
        System.out.println(car6);
    }
}