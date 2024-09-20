package system.design.lld.designPatterns.StrategyPattern;

import system.design.lld.designPatterns.StrategyPattern.Strategy.NormalDrive;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDrive());
    }
}
