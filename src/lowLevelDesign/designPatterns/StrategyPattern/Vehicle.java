package lowLevelDesign.designPatterns.StrategyPattern;

import lowLevelDesign.designPatterns.StrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    private DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy drive){
        this.driveStrategy = drive;
    }

    public void drive(){
        this.driveStrategy.drive();
    }

}
