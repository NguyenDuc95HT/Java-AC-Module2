package interfaceandabstract;

import keThua.circle;

import java.util.Arrays;
import java.util.Comparator;

public class testCircleCom {
    public static void main(String[] args) {
        circle[] circles = new circle[3];
        circles[0] = new circle(3.6);
        circles[1] = new circle();
        circles[2] = new circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (circle c : circles) {
            System.out.println(c);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("Pre-sorted:");
        for (circle c : circles) {
            System.out.println(c);
        }

    }
}
