package lowLevelDesign.designPatterns.FactoryPattern.AbstractFactory.LuxuryCars;

import lowLevelDesign.designPatterns.FactoryPattern.AbstractFactory.Interfaces.Vehicle;

public class Mercedes implements Vehicle {

    @Override
    public int getMileage() {
        return 12;
    }
}
