package lld.InterviewQuestions.ParkingLot.strategy;

import lld.InterviewQuestions.ParkingLot.entities.ParkingSpot;
import lld.InterviewQuestions.ParkingLot.entities.TwoWheelerParkingSpot;


public class NearEntranceParkingStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot find() {
        return new TwoWheelerParkingSpot();
    }
}
