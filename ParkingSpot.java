public class ParkingSpot {
    private VehicleType type;
    private Vehicle vehicle;
    private boolean free;

    public ParkingSpot(VehicleType type) {
        this.type = type;
        this.free = true;
    }

    public boolean isFree() {
        return free;
    }

    public boolean assignVehicle(Vehicle v) {
        if (v.getType() == this.type) {
            this.vehicle = v;
            this.free = false;
            return true;
        }
        return false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.free = true;
    }
}