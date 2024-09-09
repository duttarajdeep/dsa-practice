package lld.InterviewQuestions.ParkingLot.entities;

import lld.InterviewQuestions.ParkingLot.strategy.ParkingStrategy;

import java.util.List;

public abstract class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList;

    ParkingStrategy parkingStrategy;

    ParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    void addParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpotList.add(parkingSpot);
    }

    void removeParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpotList.remove(parkingSpot);
    }

    abstract ParkingSpot findParkingSpot();

    ParkingSpot parkVehicle(Vehicle v) {
        ParkingSpot spot = findParkingSpot();
        spot.parkVehicle(v);
        return spot;
    }

    void removeVehicle(Vehicle v) {
        for (ParkingSpot spot : parkingSpotList) {
            if (!spot.isEmpty && spot.vehicle.equals(v)) {
                spot.removeVehicle();
            }
        }
    }

}
