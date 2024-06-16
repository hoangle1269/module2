package src;

public class FactoryStaff extends Staff {
    private int factoryId;
    private String type;

    public FactoryStaff(int id, String name, String phone, String position, int factoryId, String type) {
        super(id, name, phone, position);
        this.factoryId = factoryId;
        this.type = type;
    }

    public int getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(int factoryId) {
        this.factoryId = factoryId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", Factory ID: " + factoryId + ", Type: " + type;
    }
}
