package lld.designPatterns.StrategyPattern;

import lld.designPatterns.StrategyPattern.Strategy.NormalDrive;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDrive());
    }
}
