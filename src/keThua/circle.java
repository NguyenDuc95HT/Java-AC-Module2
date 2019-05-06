package keThua;

public class circle extends shape implements Resizeable {
    private double radius = 1.0;

    public circle () {

    }

    public circle (double radius) {
        this.radius = radius;
    }

    public circle (double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius () {
        return radius;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    public double getArae () {
        return radius * radius * Math.PI;
    }

    public double getPerimeter () {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        setRadius(Math.sqrt(getArae() * percent / Math.PI));
    }
}
class CircleTest {
    public static void main(String[] args) {
        circle cir = new circle();
        System.out.println(cir);

        cir = new circle(3.5);
        System.out.println(cir);

        cir = new circle(3.5, "indigo", false);
        System.out.println(cir);
        cir.resize(1.5);
        System.out.println(cir);
    }
}