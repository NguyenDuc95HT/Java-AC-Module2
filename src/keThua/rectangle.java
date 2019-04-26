package keThua;

public class rectangle extends shape {
    private double width = 1.0;
    private double length = 1.0;

    public rectangle () {

    }

    public rectangle (double width, double length) {
        this.width = width;
        this.length = length;
    }

    public rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return getWidth() * getLength();
    }

    public double getPerimeter() {
        return 2 * ( getLength() + getWidth());
    }

    @Override
    public String toString() {
        return "A Rectangle with width= " + getWidth() + " and length= " + getLength() + ", which is a subclass of " + super.toString();
    }
}
class RectangleTest {
    public static void main(String[] args) {
        rectangle rec = new rectangle();
        System.out.println(rec);

        rec = new rectangle(2.3, 5.8);
        System.out.println(rec);

        rec = new rectangle(2.5, 3.8, "orange", true);
        System.out.println(rec);
    }
}