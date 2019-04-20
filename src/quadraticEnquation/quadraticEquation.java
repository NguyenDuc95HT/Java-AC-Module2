package quadraticEnquation;

public class quadraticEquation {
    private double a, b, c;

    public quadraticEquation() {
    }

    quadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a *c;
    }

    double getRoot1() {
        return (Math.pow(- b, 2) + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    double getRoot2() {
        return (Math.pow(- b, 2) - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}
