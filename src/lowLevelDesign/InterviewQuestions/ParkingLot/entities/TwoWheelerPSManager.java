package lowLevelDesign.InterviewQuestions.ParkingLot.entities;

import lowLevelDesign.InterviewQuestions.ParkingLot.strategy.NearEntranceParkingStrategy;
import lowLevelDesign.InterviewQuestions.ParkingLot.strategy.ParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerPSManager extends ParkingSpotManager {

    ParkingStrategy parkingStrategy;

    public TwoWheelerPSManager(List<ParkingSpot> twoWheelerParkingSpots) {
        super(twoWheelerParkingSpots);
        parkingStrategy = new NearEntranceParkingStrategy();
    }

    @Override
    ParkingSpot findParkingSpot() {
        return this.parkingStrategy.find();
    }
}
