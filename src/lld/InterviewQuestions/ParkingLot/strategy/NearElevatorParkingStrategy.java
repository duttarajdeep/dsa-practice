package lld.InterviewQuestions.ParkingLot.strategy;

import lld.InterviewQuestions.ParkingLot.entities.FourWheelerParkingSpot;
import lld.InterviewQuestions.ParkingLot.entities.ParkingSpot;


public class NearElevatorParkingStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot find() {
        return new FourWheelerParkingSpot();
    }
}
