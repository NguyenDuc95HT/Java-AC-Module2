package keThua;

public class shape {
    private String color = "green";
    private boolean filled = true;

    public shape () {

    }

    public shape (String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
    }
}

 class ShapeTest {
    public static void main(String[] args) {
        shape sh = new shape();
        System.out.println(sh);

        sh = new shape("red", false);
        System.out.println(sh);
    }
}
