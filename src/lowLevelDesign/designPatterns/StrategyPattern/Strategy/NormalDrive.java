package lowLevelDesign.designPatterns.StrategyPattern.Strategy;

public class NormalDrive implements DriveStrategy{

    private int topSpeed;

    public NormalDrive(){
        this.topSpeed = 60;
    }
    @Override
    public void drive() {
        System.out.println("This is a normal drive. The top speed is: " + this.topSpeed);
    }
}
