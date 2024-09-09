package lld.designPatterns.FactoryPattern.AbstractFactory.Factory;

import lld.designPatterns.FactoryPattern.AbstractFactory.NormalCars.Hyundai;
import lld.designPatterns.FactoryPattern.AbstractFactory.NormalCars.Swift;
import lld.designPatterns.FactoryPattern.AbstractFactory.Interfaces.Vehicle;
import lld.designPatterns.FactoryPattern.AbstractFactory.Interfaces.VehicleFactory;

public class NormalCarFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(String type) {
        switch (type) {
            case "SWIFT":
                return new Swift();
            case "HYUNDAI":
                return new Hyundai();
        }
        return null;
    }
}
