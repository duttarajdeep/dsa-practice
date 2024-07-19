package lowLevelDesign.designPatterns.FactoryPattern.AbstractFactory.Interfaces;

public interface VehicleFactory {
    public Vehicle getVehicle(String type);
}
