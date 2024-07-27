package lowLevelDesign.InterviewQuestions.ParkingLot.entities;

import lowLevelDesign.InterviewQuestions.ParkingLot.strategy.HourlyPricingStrategy;
import lowLevelDesign.InterviewQuestions.ParkingLot.strategy.PricingStrategy;

public class TwoWheelerCostComputation extends CostComputation {
    public TwoWheelerCostComputation() {
        super(new HourlyPricingStrategy());
    }
}
