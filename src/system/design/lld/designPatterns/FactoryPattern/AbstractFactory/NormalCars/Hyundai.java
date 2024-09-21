package system.design.lld.designPatterns.FactoryPattern.AbstractFactory.NormalCars;

import system.design.lld.designPatterns.FactoryPattern.AbstractFactory.Interfaces.Vehicle;

public class Hyundai implements Vehicle {
    @Override
    public int getMileage() {
        return 18;
    }
}