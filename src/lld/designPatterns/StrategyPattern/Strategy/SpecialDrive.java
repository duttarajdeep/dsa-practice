package lld.designPatterns.StrategyPattern.Strategy;

public class SpecialDrive implements DriveStrategy {
    private int topSpeed;

    public SpecialDrive() {
        this.topSpeed = 100;
    }

    @Override
    public void drive() {
        System.out.println("This is a special drive. The top speed is: " + this.topSpeed);
    }
}
