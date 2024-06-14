package src;

public abstract class HardDrive {
    protected String name;
    protected String capacity;
    protected String manufacturer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "name='" + name + '\'' +
                ", capacity='" + capacity + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public abstract void readData(); // abstract method, ko co body

    public abstract void writeData();

}
