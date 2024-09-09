package lld.designPatterns.StrategyPattern;

import lld.designPatterns.StrategyPattern.Strategy.SpecialDrive;

public class SportyVehicle extends Vehicle {
    public SportyVehicle() {
        super(new SpecialDrive());
    }
}
