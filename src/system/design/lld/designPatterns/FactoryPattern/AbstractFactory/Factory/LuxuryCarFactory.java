package system.design.lld.designPatterns.FactoryPattern.AbstractFactory.Factory;

import system.design.lld.designPatterns.FactoryPattern.AbstractFactory.LuxuryCars.BMV;
import system.design.lld.designPatterns.FactoryPattern.AbstractFactory.LuxuryCars.Mercedes;
import system.design.lld.designPatterns.FactoryPattern.AbstractFactory.Interfaces.Vehicle;
import system.design.lld.designPatterns.FactoryPattern.AbstractFactory.Interfaces.VehicleFactory;

public class LuxuryCarFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(String type) {
        switch (type) {
            case "BMW":
                return new BMV();
            case "MERCEDES":
                return new Mercedes();
        }
        return null;
    }
}
