package lowLevelDesign.InterviewQuestions.ParkingLot.entities;

public class TwoWheelerParkingSpot extends ParkingSpot{
    public TwoWheelerParkingSpot(){
        super();
    }
    @Override
    int price() {
        return 20;
    }
}
