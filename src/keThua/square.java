package keThua;

public class square extends rectangle {
    public square() {

    }

    public square(double size) {
        super(size, size);
    }

    public square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }

    public double getSize() {
        return getWidth();
    }

    public void setSize(double size) {
        setLength(size);
        setWidth(size);
    }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }

    @Override
    public void setLength(double length) {
        setSize(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSize()
                + ", which is a subclass of "
                + super.toString();
    }
}

class SquareTest {
    public static void main(String[] args) {
        square sq = new square();
        System.out.println(sq);

        sq = new square(2.3);
        System.out.println(sq);

        sq = new square(5.8, "yellow", true);
        System.out.println(sq);
    }
}