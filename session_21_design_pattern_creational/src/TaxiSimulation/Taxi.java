package TaxiSimulation;

public class Taxi {
    String name;
    int number;

    public Taxi(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Taxi(String s) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
