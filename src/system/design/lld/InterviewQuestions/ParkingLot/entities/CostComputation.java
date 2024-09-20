package system.design.lld.InterviewQuestions.ParkingLot.entities;

import system.design.lld.InterviewQuestions.ParkingLot.strategy.PricingStrategy;

public abstract class CostComputation {
    PricingStrategy pricingStrategy;

    CostComputation(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    int price(Ticket ticket) {
        return pricingStrategy.price(ticket);
    }

    ;
}
