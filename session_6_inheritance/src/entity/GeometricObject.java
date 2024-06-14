package entity;

import java.util.Date;


public class GeometricObject {
    protected String color;
    protected boolean filled;
    protected Date dateCreated;

    public GeometricObject() {
        this.color = "green";
        this.filled = true;
    }

    GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "A shape with color of " + this.color + " and " + (this.filled ? "filled" : "not filled");
    }
}


