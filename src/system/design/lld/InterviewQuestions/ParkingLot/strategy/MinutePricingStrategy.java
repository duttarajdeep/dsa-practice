package system.design.lld.InterviewQuestions.ParkingLot.strategy;

import system.design.lld.InterviewQuestions.ParkingLot.entities.Ticket;

public class MinutePricingStrategy extends PricingStrategy {
    @Override
    public int price(Ticket ticket) {
        // getMinutes(ticket.entryTime) - getMinutes(now) * ticket.parkingSpot.price
        return 300;
    }
}
