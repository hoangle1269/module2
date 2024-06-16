package src;

public class DeliveryStaff extends Staff {
    private String vehicleType;

    public DeliveryStaff(int id, String name, String phone, String position, String vehicleType) {
        super(id, name, phone, position);
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Vehicle Type: " + vehicleType;
    }
}
