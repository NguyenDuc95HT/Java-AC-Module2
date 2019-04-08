package areaRectangle;
import java.util.Scanner;

public class areaRectangle {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width from the keyboard: ");
        width = scanner.nextFloat();
        System.out.println("Enter height from the keyboard: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area of rectangle is: " + area);
    }
}
