package system.design.lld.InterviewQuestions.ParkingLot.strategy;

import system.design.lld.InterviewQuestions.ParkingLot.entities.ParkingSpot;
import system.design.lld.InterviewQuestions.ParkingLot.entities.TwoWheelerParkingSpot;


public class NearEntranceParkingStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot find() {
        return new TwoWheelerParkingSpot();
    }
}
