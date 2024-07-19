package lowLevelDesign.designPatterns.FactoryPattern.AbstractFactory.LuxuryCars;

import lowLevelDesign.designPatterns.FactoryPattern.AbstractFactory.Interfaces.Vehicle;

public class BMV implements Vehicle {
    @Override
    public int getMileage() {
        return 10;
    }
}
