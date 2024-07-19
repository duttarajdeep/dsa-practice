package lowLevelDesign.designPatterns.StrategyPattern;

import lowLevelDesign.designPatterns.StrategyPattern.Strategy.NormalDrive;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle() {
        super(new NormalDrive());
    }
}
