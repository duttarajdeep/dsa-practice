package lowLevelDesign.InterviewQuestions.ParkingLot.strategy;

import lowLevelDesign.InterviewQuestions.ParkingLot.entities.Ticket;

public class HourlyPricingStrategy extends PricingStrategy{
    @Override
    public int price(Ticket ticket) {
        // getHours(ticket.entryTime) - getHours(now) * perHourPrice
        return 200;
    }
}
