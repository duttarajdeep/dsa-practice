package lowLevelDesign.InterviewQuestions.ParkingLot.entities;

import lowLevelDesign.InterviewQuestions.ParkingLot.strategy.HourlyPricingStrategy;
import lowLevelDesign.InterviewQuestions.ParkingLot.strategy.PricingStrategy;

public class FourWheelerCostComputation extends CostComputation {
    public FourWheelerCostComputation() {
        super(new HourlyPricingStrategy());
    }
}
