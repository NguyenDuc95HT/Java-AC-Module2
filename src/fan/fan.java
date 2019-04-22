package fan;

public class fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FLAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public fan() {

    }


    @Override
    public String toString() {
        return on? "Speed: "+ speed + " Color: " +color +" Radius: " + radius + " fan is on": "fan is off";
    }

    public static void main(String[] args) {
        fan Fan1 = new fan();
        fan Fan2 = new fan();
        Fan1.setSpeed(FLAST);
        Fan1.setRadius(10);
        Fan1.setColor("yellow");
        Fan1.setOn(true);

        System.out.println("Fan1: " + Fan1.toString() + " Fan2: " + Fan2.toString());
    }
}
