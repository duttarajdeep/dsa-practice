package system.design.lld.designPatterns.FactoryPattern.AbstractFactory.LuxuryCars;

import system.design.lld.designPatterns.FactoryPattern.AbstractFactory.Interfaces.Vehicle;

public class BMV implements Vehicle {
    @Override
    public int getMileage() {
        return 10;
    }
}
