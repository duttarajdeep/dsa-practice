package system.design.lld.InterviewQuestions.ParkingLot;

import system.design.lld.InterviewQuestions.ParkingLot.entities.*;

public class ParkingLot {
    public static void main(String[] args) {
        // Start parking process
        Vehicle olaBike = new Vehicle(2006, VehicleType.TWO_WHEELER);

        EntranceGate entranceGate = new EntranceGate();

        ParkingSpot ps = entranceGate.findSpot(olaBike);
        System.out.println(ps.toString());

        ParkingSpot bookedSpot = entranceGate.bookSpot(olaBike);
        System.out.println(bookedSpot.toString());

        Ticket entryTicket = entranceGate.generateTicket(olaBike, bookedSpot);
        System.out.println(entryTicket.toString());

        ExitGate exitGate = new ExitGate();
        int parkingFee = exitGate.priceCal(entryTicket);
        System.out.println("Parking fee: " + parkingFee);

        //make payment

        exitGate.removeVehicle(entryTicket);
    }
}
