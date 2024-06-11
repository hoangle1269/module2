package src;

public class Student {
    // khai bao thuoc tinh
    protected String id;
    protected String name;
    protected String email;
    protected String mobile;
    protected double GPA;

    public Student(String id, String name, String email, String mobile, double GPA) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", GPA=" + GPA +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
