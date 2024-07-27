package lowLevelDesign.InterviewQuestions.ParkingLot.factory;

import lowLevelDesign.InterviewQuestions.ParkingLot.entities.*;

public class CostComputationFactory {
    public CostComputation getCostComputationObj(Ticket ticket) {
        VehicleType vehicleType = ticket.getVehicle().getVehicleType();
        switch (vehicleType) {
            case TWO_WHEELER:
                return new TwoWheelerCostComputation();
            case FOUR_WHEELER:
                return new FourWheelerCostComputation();

        }
        return null;
    }
}
