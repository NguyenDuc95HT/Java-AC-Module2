package Array;

import java.util.Random;
import java.util.Scanner;

public class findMaxElement {
    static int maxElement (int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int size = scanner.nextInt();
        Random rd = new Random();
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = rd.nextInt(100);
            }
        }

        System.out.println("max:" + maxElement(arr));
    }
}
