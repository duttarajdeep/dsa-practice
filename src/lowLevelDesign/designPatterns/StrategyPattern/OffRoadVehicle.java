package lowLevelDesign.designPatterns.StrategyPattern;

import lowLevelDesign.designPatterns.StrategyPattern.Strategy.SpecialDrive;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SpecialDrive());
    }
}
