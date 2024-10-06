package org.example;

import java.util.Date;

public class Ticket {
    private Vehicle vehicle;
    private ParkingSpot spot;
    private Date entryTime;
    private Date exitTime;
    private double parkingCharge;

    public ParkingSpot getSpot() {
        return spot;
    }

    public Ticket(Vehicle vehicle, ParkingSpot spot) {
        this.vehicle = vehicle;
        this.spot = spot;
        this.entryTime=new Date();
        this.exitTime=null;
        this.parkingCharge=0.0;
    }

    public void closeTicket(){
        this.exitTime=new Date();
        calculateParkingCharge();
    }

    private void calculateParkingCharge() {
        long time = (exitTime.getTime()-entryTime.getTime())/(1000 * 60);

        this.parkingCharge=time*2;
        System.out.println(entryTime);
        System.out.println(exitTime);
        System.out.println("Parking charge for vehicle " + vehicle.getLicensePlate() + ": $" + this.parkingCharge);

    }
}
