package lowLevelDesign.designPatterns.FactoryPattern.AbstractFactory.Factory;

import lowLevelDesign.designPatterns.FactoryPattern.AbstractFactory.NormalCars.Hyundai;
import lowLevelDesign.designPatterns.FactoryPattern.AbstractFactory.NormalCars.Swift;
import lowLevelDesign.designPatterns.FactoryPattern.AbstractFactory.Interfaces.Vehicle;
import lowLevelDesign.designPatterns.FactoryPattern.AbstractFactory.Interfaces.VehicleFactory;

public class NormalCarFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle (String type){
        switch (type){
            case "SWIFT":
                return new Swift();
            case "HYUNDAI":
                return new Hyundai();
        }
        return null;
    }
}
