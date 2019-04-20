package quadraticEnquation;

import java.util.Scanner;

public class quadraticEquationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        quadraticEquation quadraticEquation = new quadraticEquation(a, b, c);
        if(quadraticEquation.getDiscriminant() < 0) {
            System.out.print("the Equation has no read roots! ");
        } else if(quadraticEquation.getDiscriminant() == 0) {
            System.out.print("the Equation has one roots: " + quadraticEquation.getRoot1());
        } else {
            System.out.print("the Equation has tow roots: " + quadraticEquation.getRoot1() + " and " +quadraticEquation.getRoot2());
        }
    }
}
