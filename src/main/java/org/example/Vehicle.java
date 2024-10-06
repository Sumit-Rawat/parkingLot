package org.example;

import org.example.config.VehicleType;

public class Vehicle {
    private VehicleType vehicleType;
    private String licensePlate;

    public Vehicle(VehicleType vehicleType, String licensePlate) {
        this.vehicleType = vehicleType;
        this.licensePlate = licensePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}
