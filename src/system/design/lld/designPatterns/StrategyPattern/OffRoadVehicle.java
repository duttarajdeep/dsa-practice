package system.design.lld.designPatterns.StrategyPattern;

import system.design.lld.designPatterns.StrategyPattern.Strategy.SpecialDrive;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SpecialDrive());
    }
}
