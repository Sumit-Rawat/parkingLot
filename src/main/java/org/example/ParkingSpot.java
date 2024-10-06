package org.example;

import org.example.config.SpotType;

public class ParkingSpot {

    private int spotId;
    private boolean isOccupied;
    private SpotType spotType;

    public ParkingSpot(int spotId, SpotType spotType) {
        this.spotId = spotId;
        this.isOccupied = false;
        this.spotType = spotType;
    }

    public void parkVehicle() {
        this.isOccupied=true;
    }

    public void unparkVehicle() {
        this.isOccupied=false;
    }

    public boolean isOccupied() {
        return this.isOccupied;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public int getSpotId() {
        return this.spotId;
    }

}
