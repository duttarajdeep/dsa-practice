package lld.InterviewQuestions.ParkingLot.entities;

import lld.InterviewQuestions.ParkingLot.strategy.HourlyPricingStrategy;

public class TwoWheelerCostComputation extends CostComputation {
    public TwoWheelerCostComputation() {
        super(new HourlyPricingStrategy());
    }
}
