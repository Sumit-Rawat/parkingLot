package org.example;

import java.util.HashMap;
import java.util.Map;

public class ParkingManager {
    private ParkingLot parkingLot;
    private Map<String, Ticket> activeTickets;

    public ParkingManager(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
        this.activeTickets=new HashMap<>();
    }

    public void parkVehicle(Vehicle vehicle) {
        ParkingSpot spot=parkingLot.parkVehicle(vehicle);

        if (spot!=null)
        {
            Ticket ticket=new Ticket(vehicle,spot);
            activeTickets.put(vehicle.getLicensePlate(), ticket);
        }
    }

    public void unparkVehicle(String licensePlate) {
        Ticket ticket=activeTickets.get(licensePlate);
        if(ticket!=null)
        {
            ticket.closeTicket();
            parkingLot.freeSpot(ticket.getSpot());
            activeTickets.remove(licensePlate);
        }
        else{
            System.out.println("Invalid license plate: " + licensePlate);
        }
    }
}
