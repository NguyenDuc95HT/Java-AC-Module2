package linearEquationResolver;

import java.util.Scanner;

public class linearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Liner Equation Resolver");
        System.out.println("Give a equation as 'ax + b = 0', please enter constants: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        double a = scanner.nextDouble();
        System.out.println("b = ");
        double b = scanner.nextDouble();
        if(a != 0) {
            double x = - b / a;
            System.out.println("The solution is: " + x);
        } else {
            if(b == 0) {
                System.out.println("There are countless solution" );
            } else {
                System.out.println("No solution!" );
            }
        }

    }
}
