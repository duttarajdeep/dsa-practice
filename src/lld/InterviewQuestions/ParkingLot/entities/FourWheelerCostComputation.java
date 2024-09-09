package lld.InterviewQuestions.ParkingLot.entities;

import lld.InterviewQuestions.ParkingLot.strategy.HourlyPricingStrategy;

public class FourWheelerCostComputation extends CostComputation {
    public FourWheelerCostComputation() {
        super(new HourlyPricingStrategy());
    }
}
