package system.design.lld.InterviewQuestions.ParkingLot.strategy;

import system.design.lld.InterviewQuestions.ParkingLot.entities.FourWheelerParkingSpot;
import system.design.lld.InterviewQuestions.ParkingLot.entities.ParkingSpot;


public class NearElevatorParkingStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot find() {
        return new FourWheelerParkingSpot();
    }
}
