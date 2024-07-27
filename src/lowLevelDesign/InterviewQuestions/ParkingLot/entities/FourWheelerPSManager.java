package lowLevelDesign.InterviewQuestions.ParkingLot.entities;

import lowLevelDesign.InterviewQuestions.ParkingLot.strategy.NearElevatorParkingStrategy;
import lowLevelDesign.InterviewQuestions.ParkingLot.strategy.ParkingStrategy;
import java.util.ArrayList;
import java.util.List;

public class FourWheelerPSManager extends ParkingSpotManager {
    ParkingStrategy parkingStrategy;

    public FourWheelerPSManager(List<ParkingSpot> fourWheelerParkingSpots) {
        super(fourWheelerParkingSpots);
        parkingStrategy = new NearElevatorParkingStrategy();
    }

    @Override
    ParkingSpot findParkingSpot() {
        return parkingStrategy.find();
    }
}
