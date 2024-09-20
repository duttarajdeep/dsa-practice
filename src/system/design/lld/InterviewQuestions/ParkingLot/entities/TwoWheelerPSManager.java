package system.design.lld.InterviewQuestions.ParkingLot.entities;

import system.design.lld.InterviewQuestions.ParkingLot.strategy.NearEntranceParkingStrategy;
import system.design.lld.InterviewQuestions.ParkingLot.strategy.ParkingStrategy;

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
