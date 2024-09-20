package system.design.lld.InterviewQuestions.ParkingLot.entities;

import system.design.lld.InterviewQuestions.ParkingLot.strategy.HourlyPricingStrategy;

public class FourWheelerCostComputation extends CostComputation {
    public FourWheelerCostComputation() {
        super(new HourlyPricingStrategy());
    }
}
