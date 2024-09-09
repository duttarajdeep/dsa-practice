package lld.InterviewQuestions.ParkingLot.entities;

import lld.InterviewQuestions.ParkingLot.strategy.NearElevatorParkingStrategy;
import lld.InterviewQuestions.ParkingLot.strategy.ParkingStrategy;

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
