package system.design.lld.InterviewQuestions.ParkingLot.entities;

import system.design.lld.InterviewQuestions.ParkingLot.utils.CommonUtils;

public abstract class ParkingSpot {
    int id;
    boolean isEmpty;
    int price;
    Vehicle vehicle;

    public ParkingSpot() {
        this.id = CommonUtils.generateParkingId();
        this.isEmpty = true;
        this.vehicle = null;
    }

    abstract int price();

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
        System.out.println("Vehicle removed");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "id=" + id +
                ", isEmpty=" + isEmpty +
                ", price=" + price +
                ", vehicle=" + vehicle +
                '}';
    }
}
