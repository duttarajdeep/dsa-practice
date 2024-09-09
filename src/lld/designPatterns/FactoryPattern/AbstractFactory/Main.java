package lld.designPatterns.FactoryPattern.AbstractFactory;

import lld.designPatterns.FactoryPattern.AbstractFactory.Factory.ParentFactory;
import lld.designPatterns.FactoryPattern.AbstractFactory.Interfaces.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        ParentFactory parentFactory = new ParentFactory();
        VehicleFactory vehicleFactory = parentFactory.getVehicleFactory("LUXURY");

        System.out.println(vehicleFactory.getVehicle("BMW").getMileage());
        System.out.println(vehicleFactory.getVehicle("MERCEDES").getMileage());
    }
}
