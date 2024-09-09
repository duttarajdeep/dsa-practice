package lld.designPatterns.FactoryPattern.AbstractFactory.LuxuryCars;

import lld.designPatterns.FactoryPattern.AbstractFactory.Interfaces.Vehicle;

public class Mercedes implements Vehicle {

    @Override
    public int getMileage() {
        return 12;
    }
}
