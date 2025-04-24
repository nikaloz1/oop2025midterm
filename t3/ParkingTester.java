package t3;

public class ParkingTester {
    public static void main(String[] args) {
        // making vehicles
        Vehicle v1 = new Vehicle();
        v1.setPlateNumber("ABC123");
        v1.setType("Sedan");

        Vehicle v2 = new Vehicle();
        v2.setPlateNumber("XYZ789");
        v2.setType("SUV");

        // creating PMS with 10 parking spots
        PMS pms = new PMS(10);

        // add vehicles to parking
        pms.addVehicle(v1);
        pms.addVehicle(v2);

        // print current storage
        System.out.println("Current parking status:");
        pms.printStorage();

        // spot availability
        System.out.println("\nTesting spot availability:");
        System.out.println("Is spot 5 available? " + pms.isSpotAvailable(5));
        
        // reserving a spot
        System.out.println("Reserving spot 5: " + pms.reserveSpot(5));
        System.out.println("Is spot 5 still available? " + pms.isSpotAvailable(5));

        // removing a car
        System.out.println("\nRemoving vehicle " + v1.getPlateNumber());
        pms.removeVehicle(v1);

        // printing final parking storage
        System.out.println("\nFinal parking status:");
        pms.printStorage();
    }
} 
