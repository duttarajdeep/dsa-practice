package system.design.lld.InterviewQuestions.ParkingLot.factory;

import system.design.lld.InterviewQuestions.ParkingLot.entities.*;

import java.util.ArrayList;
import java.util.List;

public class ParkingManagerFactory {

    private static List<ParkingSpot> twoWheelerParkingSpots = new ArrayList<>();
    private static List<ParkingSpot> fourWheelerParkingSpots = new ArrayList<>();

    public ParkingManagerFactory() {
        createParkingSpots();
    }

    static void createParkingSpots() {
        // Create parking spots
        for (int i = 0; i < 25; i++) {
            twoWheelerParkingSpots.add(new TwoWheelerParkingSpot());
        }
        for (int i = 0; i < 25; i++) {
            fourWheelerParkingSpots.add(new FourWheelerParkingSpot());
        }
    }

    public ParkingSpotManager getSpotManager(VehicleType vehicleType) {
        switch (vehicleType) {
            case TWO_WHEELER:
                return new TwoWheelerPSManager(twoWheelerParkingSpots);
            case FOUR_WHEELER:
                return new FourWheelerPSManager(fourWheelerParkingSpots);
        }
        return null;
    }
}
