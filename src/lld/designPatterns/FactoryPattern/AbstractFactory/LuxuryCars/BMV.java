package lld.designPatterns.FactoryPattern.AbstractFactory.LuxuryCars;

import lld.designPatterns.FactoryPattern.AbstractFactory.Interfaces.Vehicle;

public class BMV implements Vehicle {
    @Override
    public int getMileage() {
        return 10;
    }
}
