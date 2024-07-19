package lowLevelDesign.designPatterns.FactoryPattern.AbstractFactory.Factory;

import lowLevelDesign.designPatterns.FactoryPattern.AbstractFactory.LuxuryCars.BMV;
import lowLevelDesign.designPatterns.FactoryPattern.AbstractFactory.LuxuryCars.Mercedes;
import lowLevelDesign.designPatterns.FactoryPattern.AbstractFactory.Interfaces.Vehicle;
import lowLevelDesign.designPatterns.FactoryPattern.AbstractFactory.Interfaces.VehicleFactory;

public class LuxuryCarFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle (String type){
        switch (type){
            case "BMW":
                return new BMV();
            case "MERCEDES":
                return new Mercedes();
        }
        return null;
    }
}
