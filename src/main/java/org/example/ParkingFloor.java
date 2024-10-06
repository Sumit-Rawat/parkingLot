package org.example;

import org.example.config.SpotType;
import org.example.config.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSpot> spots;

    public int getFloorNumber() {
        return floorNumber;
    }

    public ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.spots = new ArrayList<>();
    }

    public void addSpot(ParkingSpot spot) {
        this.spots.add(spot);
    }

    public ParkingSpot findAvailableSpot(VehicleType vehicleType) {
        for(ParkingSpot spot:spots)
        {
            if(!spot.isOccupied() && isValidSpot(spot, vehicleType))
            {
                return spot;
            }
        }

        return null;
    }

    public boolean isValidSpot(ParkingSpot spot, VehicleType vehicleType) {
        if(vehicleType == VehicleType.BIKE && spot.getSpotType() == SpotType.BIKE_SPOT)
            return true;
        else if(vehicleType == VehicleType.CAR && spot.getSpotType() == SpotType.CAR_SPOT)
            return true;
        else if(vehicleType == VehicleType.TRUCK && spot.getSpotType() == SpotType.TRUCK_SPOT)
            return true;
        else
            return false;
    }

}
