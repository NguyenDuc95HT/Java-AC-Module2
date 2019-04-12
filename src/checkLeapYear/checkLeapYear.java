package checkLeapYear;

import java.util.Scanner;

public class checkLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String keyt = "";
        do {
            System.out.println("Enter Year you want check: ");
            int year = scanner.nextInt();
            if(year % 4 == 0) {
                if(year % 100 == 0) {
                    if(year % 400 == 0) {
                        System.out.println("This year you check is leap year !!!");
                    } else {
                        System.out.println("This year you check is NOT leap year !!!");
                    }

                } else {
                    System.out.println("This year you check is leap year !!!");
                }
            } else {
                System.out.println("This year you check is NOT leap year !!!");
            }
            System.out.println("===============================\nYou want continue? \nEnter key Y to continue, any key to exit?");

            //dong them cua Nam day!!!
            System.out.println("===============================\nYou want continue? \nEnter key Y to continue, any key to exit?");

            keyt = scanner.next();
            System.out.println("===============================");
        } while (keyt.equals("Y") || keyt.equals("y"));
    }
}
