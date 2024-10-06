package org.example;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> floors;

    public ParkingLot() {
        this.floors = new ArrayList<>();
    }

    public void addFloor(ParkingFloor floor) {
        this.floors.add(floor);
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) {
        for (ParkingFloor floor : floors){
            ParkingSpot availableSpot=floor.findAvailableSpot(vehicle.getVehicleType());
            if(availableSpot!=null)
            {
                availableSpot.parkVehicle();
                System.out.println("Vehicle parked at Floor: " + floor.getFloorNumber() + ", Slot: " + availableSpot.getSpotId());
                return availableSpot;
            }
        }
        System.out.println("Parking is full for vehicle type: " + vehicle.getVehicleType());
        return null;
    }

    public void freeSpot(ParkingSpot spot) {
        spot.unparkVehicle();
        System.out.println("Vehicle unparked from Slot: " + spot.getSpotId());
    }

}
