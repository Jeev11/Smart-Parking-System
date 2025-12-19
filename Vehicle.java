public class Vehicle {
    protected VehicleType type;
    protected String licensePlate;

    public Vehicle(VehicleType type, String licensePlate) {
        this.type = type;
        this.licensePlate = licensePlate;
    }

    public VehicleType getType() {
        return type;
    }
}