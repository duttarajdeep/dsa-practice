package lowLevelDesign.InterviewQuestions.ParkingLot.strategy;

import lowLevelDesign.InterviewQuestions.ParkingLot.entities.Ticket;

public abstract class PricingStrategy {
    public int price(Ticket ticket){
        // fixed price is default
        return 50;
    };
}
