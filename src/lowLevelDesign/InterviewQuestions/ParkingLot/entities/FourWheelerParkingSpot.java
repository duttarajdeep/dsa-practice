package lowLevelDesign.InterviewQuestions.ParkingLot.entities;

public class FourWheelerParkingSpot extends ParkingSpot{
    public FourWheelerParkingSpot(){
        super();
    }
    @Override
    int price() {
        return 50;
    }
}
