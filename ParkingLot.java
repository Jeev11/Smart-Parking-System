import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<ParkingSpot> spots;

    public ParkingLot(int capacity) {
        spots = new ArrayList<>();
        // Initialize simple lot: 5 bike spots, 5 car spots, 5 truck spots
        for (int i = 0; i < 5; i++) spots.add(new ParkingSpot(VehicleType.MOTORCYCLE));
        for (int i = 0; i < 5; i++) spots.add(new ParkingSpot(VehicleType.CAR));
        for (int i = 0; i < 5; i++) spots.add(new ParkingSpot(VehicleType.TRUCK));
    }

    // The "Google Algorithm" part: Find the first free spot
    public boolean parkVehicle(Vehicle v) {
        for (ParkingSpot spot : spots) {
            if (spot.isFree() && spot.assignVehicle(v)) {
                System.out.println("Success: " + v.getType() + " with plate " + v.licensePlate + " parked.");
                return true;
            }
        }
        System.out.println("Failure: No spots available for " + v.getType());
        return false;
    }

    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(15);
        
        Vehicle bike = new Vehicle(VehicleType.MOTORCYCLE, "AP-09-1234");
        Vehicle car = new Vehicle(VehicleType.CAR, "TS-08-5678");
        Vehicle truck = new Vehicle(VehicleType.TRUCK, "KA-01-9999");

        lot.parkVehicle(bike);
        lot.parkVehicle(car);
        lot.parkVehicle(truck);
    }
}