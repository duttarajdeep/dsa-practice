package system.design.lld.InterviewQuestions.ParkingLot.entities;

import system.design.lld.InterviewQuestions.ParkingLot.factory.CostComputationFactory;
import system.design.lld.InterviewQuestions.ParkingLot.factory.ParkingManagerFactory;

public class ExitGate {
    Ticket ticket;
    CostComputation costComputation;
    CostComputationFactory costComputationFactory;
    ParkingSpotManager manager;
    ParkingManagerFactory parkingManagerFactory;

    public ExitGate() {
        this.parkingManagerFactory = new ParkingManagerFactory();
        this.costComputationFactory = new CostComputationFactory();
    }

    public int priceCal(Ticket ticket) {
        return costComputationFactory.getCostComputationObj(ticket).price(ticket);
    }

    public void payment() {

    }

    public void removeVehicle(Ticket ticket) {
        parkingManagerFactory.getSpotManager(ticket.getVehicle().getVehicleType()).removeVehicle(ticket.getVehicle());
    }


}
