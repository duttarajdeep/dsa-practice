package lld.designPatterns.StrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportyVehicle();
        vehicle.drive();
    }
}
