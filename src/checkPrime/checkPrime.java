package checkPrime;

import java.util.Scanner;

public class checkPrime {
    private static boolean check(int num) {
        int index = 2;
        while(index <= Math.sqrt(num)) {
            if((num % index) == 0) {
                return true;
            }
            index++;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter that number you want to check?");
        int num = scanner.nextInt();
        if (!check(num)) {
            System.out.println(num + " is a prime!");
        } else {
            System.out.println(num + " is not a prime");
        }
    }
}
