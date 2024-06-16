package src;

public abstract class Staff {
    private int id;
    private String name;
    private String phone;
    private String position;

    public Staff(int id, String name, String phone, String position) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getPosition() {
        return position;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Phone: " + phone + ", Position: " + position;
    }
}
