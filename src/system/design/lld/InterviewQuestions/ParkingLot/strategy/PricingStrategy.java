package system.design.lld.InterviewQuestions.ParkingLot.strategy;

import system.design.lld.InterviewQuestions.ParkingLot.entities.Ticket;

public abstract class PricingStrategy {
    public int price(Ticket ticket) {
        // fixed price is default
        return 50;
    }

    ;
}
