package org.example;

import org.example.config.SpotType;
import org.example.config.VehicleType;

public class Main {
    public static void main(String[] args) {
        // Initialize the parking lot with 2 floors
        ParkingFloor floor1 = new ParkingFloor(1);
        floor1.addSpot(new ParkingSpot(1, SpotType.CAR_SPOT));
        floor1.addSpot(new ParkingSpot(2, SpotType.BIKE_SPOT));

        ParkingFloor floor2 = new ParkingFloor(2);
        floor2.addSpot(new ParkingSpot(3, SpotType.CAR_SPOT));
        floor2.addSpot(new ParkingSpot(4, SpotType.TRUCK_SPOT));

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.addFloor(floor1);
        parkingLot.addFloor(floor2);

        ParkingManager manager = new ParkingManager(parkingLot);

        // Test the system
        Vehicle car = new Vehicle(VehicleType.CAR,"KA-01-HH-1234" );
        Vehicle bike = new Vehicle( VehicleType.BIKE,"KA-02-BB-5678");

        // Park vehicles
        manager.parkVehicle(car);
        manager.parkVehicle(bike);

        // Unpark vehicles
        manager.unparkVehicle("KA-01-HH-1234");
        manager.unparkVehicle("KA-02-BB-5678");
    }
}