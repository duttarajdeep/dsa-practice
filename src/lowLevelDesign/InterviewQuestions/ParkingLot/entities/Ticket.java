package lowLevelDesign.InterviewQuestions.ParkingLot.entities;

public class Ticket {
    private String entryTime;
    private Vehicle vehicle;
    private ParkingSpot spot;

    public Ticket(String entryTime, Vehicle vehicle, ParkingSpot spot) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.spot = spot;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public void setSpot(ParkingSpot spot) {
        this.spot = spot;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "entryTime='" + entryTime + '\'' +
                ", vehicle=" + vehicle +
                ", spot=" + spot +
                '}';
    }
}
