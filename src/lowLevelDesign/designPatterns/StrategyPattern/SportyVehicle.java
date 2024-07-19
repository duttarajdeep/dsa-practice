package lowLevelDesign.designPatterns.StrategyPattern;

import lowLevelDesign.designPatterns.StrategyPattern.Strategy.SpecialDrive;

public class SportyVehicle extends Vehicle{
    public SportyVehicle() {
        super(new SpecialDrive());
    }
}
