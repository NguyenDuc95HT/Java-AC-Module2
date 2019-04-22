package Array;

import java.util.Random;
import java.util.Scanner;

public class addElement {
    static int[] adde (int index, int Element, int[] array) {
         int[] temArr = new int[array.length + 1];
         boolean abc = false;
         for (int i = 0; i < temArr.length; i++) {
             if (abc) {
                 temArr[i] = array[i - 1];
             } else {
                 temArr[i] = array[i];
             }
             if (i == index) {
                 temArr[i] = Element;
                 abc = true;
             }
         }
         return temArr;
    }

    public static void main(String[] args) {
        
        System.out.println("Enter size in array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        Random rd = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rd.nextInt(100);
        }
        System.out.println("Enter index and value: ");
        int index = scanner.nextInt();
        int element = scanner.nextInt();
        arr = adde(index, element, arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
