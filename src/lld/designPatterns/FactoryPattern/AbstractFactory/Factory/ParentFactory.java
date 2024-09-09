package lld.designPatterns.FactoryPattern.AbstractFactory.Factory;

import lld.designPatterns.FactoryPattern.AbstractFactory.Interfaces.VehicleFactory;

public class ParentFactory {
    public VehicleFactory getVehicleFactory(String carType) {
        switch (carType) {
            case "NORMAL":
                return new NormalCarFactory();
            case "LUXURY":
                return new LuxuryCarFactory();
        }
        return null;
    }
}
