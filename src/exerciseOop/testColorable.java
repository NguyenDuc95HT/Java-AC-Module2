package exerciseOop;

public class testColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle();
        shapes[1] = new Square();
        shapes[2] = new Circle();

        System.out.println("Shape :");
        for (Shape shape: shapes) {
            System.out.println(shape);
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
        }
    }
}
