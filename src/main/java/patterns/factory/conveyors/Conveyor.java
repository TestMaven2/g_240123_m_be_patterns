package patterns.factory.conveyors;

import patterns.factory.cars.Car;

public abstract class Conveyor {

    public void buildBody() {
        System.out.println("Строим кузов автомобиля.");
    }

    public void installEngine() {
        System.out.println("Устанавливаем двигатель.");
    }

    public void setupInterior() {
        System.out.println("Собираем салон.");
    }

    public abstract Car getCar();
}