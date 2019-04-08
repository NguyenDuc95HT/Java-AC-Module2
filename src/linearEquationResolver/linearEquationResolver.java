package linearEquationResolver;

import java.util.Scanner;

public class linearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Liner Equation Resolver");
        System.out.println("Give a equation as 'ax + b = c', please enter constants: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        double a = scanner.nextFloat();
        System.out.println("b = ");
        double b = scanner.nextFloat();
        System.out.println("c = ");
        double c = scanner.nextFloat();
        double x = (c - b) / a;
        System.out.println("The solution is: " + x);
    }
}
