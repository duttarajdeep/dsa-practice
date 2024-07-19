package lowLevelDesign.designPatterns.FactoryPattern.AbstractFactory.NormalCars;

import lowLevelDesign.designPatterns.FactoryPattern.AbstractFactory.Interfaces.Vehicle;

public class Hyundai implements Vehicle {
    @Override
    public int getMileage() {
        return 18;
    }
}
