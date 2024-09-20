package system.design.lld.designPatterns.FactoryPattern.AbstractFactory.Interfaces;

public interface VehicleFactory {
    public Vehicle getVehicle(String type);
}
