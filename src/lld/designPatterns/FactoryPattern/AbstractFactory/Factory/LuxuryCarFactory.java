package lld.designPatterns.FactoryPattern.AbstractFactory.Factory;

import lld.designPatterns.FactoryPattern.AbstractFactory.LuxuryCars.BMV;
import lld.designPatterns.FactoryPattern.AbstractFactory.LuxuryCars.Mercedes;
import lld.designPatterns.FactoryPattern.AbstractFactory.Interfaces.Vehicle;
import lld.designPatterns.FactoryPattern.AbstractFactory.Interfaces.VehicleFactory;

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
