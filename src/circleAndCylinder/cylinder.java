package circleAndCylinder;

public class cylinder extends circle {
    private double height = 1.0;

    public cylinder() {

    }

    public cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder height = " + getHeight() + super.toString() + " volume = " + getVolume();
    }
}

class testCylinder {
    public static void main(String[] args) {
        cylinder cyl = new cylinder(5, 5, "blue");
        System.out.println(cyl);
    }
}