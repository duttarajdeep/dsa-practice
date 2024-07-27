package lowLevelDesign.InterviewQuestions.ParkingLot.strategy;

import lowLevelDesign.InterviewQuestions.ParkingLot.entities.FourWheelerParkingSpot;
import lowLevelDesign.InterviewQuestions.ParkingLot.entities.ParkingSpot;


public class NearElevatorParkingStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot find() {
        return new FourWheelerParkingSpot();
    }
}
