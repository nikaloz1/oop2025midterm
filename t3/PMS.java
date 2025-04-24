package t3;

import java.util.ArrayList;
import java.util.List;

public class PMS {
    // storage for parking vehicles
    private List<Vehicle> storage = new ArrayList<Vehicle>();

    private boolean[] parkingSpots;
    private int totalSpots;

    public PMS(int totalParkingSpots) {
        this.totalSpots = totalParkingSpots;
        this.parkingSpots = new boolean[totalParkingSpots];
    }

    // adds vehicle to parking
    public void addVehicle(Vehicle vehicle) {
        storage.add(vehicle);
    }

    // removes
    public boolean removeVehicle(Vehicle vehicle) {
        boolean removed = false;
        for (int i = 0; i < storage.size(); i++) {
            Vehicle v = storage.get(i);
            if (v.getPlateNumber().equals(vehicle.getPlateNumber()) && 
                v.getType().equals(vehicle.getType())) {
                storage.remove(i);
                removed = true;
                break;
            }
        }
        return removed;
    }

    public void printStorage() {
        if (storage.isEmpty()) {
            System.out.println("The parking is empty");
        } else {
            for (Vehicle v: storage) {
                System.out.println(v.getType() + ", " + v.getPlateNumber());
                System.out.println();
            }
        }
    }

    // checking if specific spot is available
    public boolean isSpotAvailable(int spotNumber) {
        if (spotNumber >= 0 && spotNumber < totalSpots) {
            return !parkingSpots[spotNumber];
        }
        return false;
    }

    // reserve a specific spot
    public boolean reserveSpot(int spotNumber) {
        if (spotNumber >= 0 && spotNumber < totalSpots && !parkingSpots[spotNumber]) {
            parkingSpots[spotNumber] = true;
            return true;
        }
        return false;
    }
} 
