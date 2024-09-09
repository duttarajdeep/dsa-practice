package lld.InterviewQuestions.ParkingLot.entities;

import lld.InterviewQuestions.ParkingLot.factory.ParkingManagerFactory;
import lld.InterviewQuestions.ParkingLot.utils.CommonUtils;

public class EntranceGate {
    ParkingManagerFactory factory;
    ParkingSpotManager manager;
    Ticket ticket;

    public EntranceGate() {
        this.factory = new ParkingManagerFactory();
    }

    public ParkingSpot findSpot(Vehicle vehicle) {
        this.manager = factory.getSpotManager(vehicle.getVehicleType());
        return this.manager.findParkingSpot();
    }

    public ParkingSpot bookSpot(Vehicle vehicle) {
        return this.manager.parkVehicle(vehicle);
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot spot) {
        this.ticket = new Ticket(CommonUtils.generateISOTimestamp(), vehicle, spot);
        return this.ticket;
    }

}
