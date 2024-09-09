package lld.designPatterns.StrategyPattern;

import lld.designPatterns.StrategyPattern.Strategy.SpecialDrive;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SpecialDrive());
    }
}
