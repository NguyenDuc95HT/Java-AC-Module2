package circleAndCylinder;

public class circle {
    private double radius = 1.0;
    private String color = "green";

    public circle() {

    }

    public circle(double radius, String color) {
        this.color = color;
        this.radius =radius;
    }
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    public double getPerimeter () {
        return 2 * getRadius() * Math.PI;
    }

    @Override
    public String toString() {
        return "A Cricle radius = " + getRadius() + " Color = " + getColor() + " Area = " + getArea() + " Perimeter = " + getPerimeter();
    }
}
