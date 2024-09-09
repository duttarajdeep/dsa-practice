package lld.designPatterns.FactoryPattern.AbstractFactory.NormalCars;

import lld.designPatterns.FactoryPattern.AbstractFactory.Interfaces.Vehicle;

public class Swift implements Vehicle {

    @Override
    public int getMileage() {
        return 20;
    }
}
