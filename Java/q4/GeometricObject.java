package Java.q4;


import java.util.Date;

public class GeometricObject {
    String color = "white";
    Boolean filled = false;
    Date dateCreated;

    public GeometricObject() {
    }

    public GeometricObject(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String toString() {
        return "color : " + this.color;
    }
}
