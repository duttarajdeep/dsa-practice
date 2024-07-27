package lowLevelDesign.InterviewQuestions.ParkingLot.strategy;

import lowLevelDesign.InterviewQuestions.ParkingLot.entities.ParkingSpot;
import lowLevelDesign.InterviewQuestions.ParkingLot.entities.TwoWheelerParkingSpot;


public class NearEntranceParkingStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot find() {
        return new TwoWheelerParkingSpot();
    }
}
