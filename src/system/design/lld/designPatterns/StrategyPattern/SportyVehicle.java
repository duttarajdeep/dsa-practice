package system.design.lld.designPatterns.StrategyPattern;

import system.design.lld.designPatterns.StrategyPattern.Strategy.SpecialDrive;

public class SportyVehicle extends Vehicle {
    public SportyVehicle() {
        super(new SpecialDrive());
    }
}
