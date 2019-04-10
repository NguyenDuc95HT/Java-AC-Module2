package numberToString;

import java.util.Scanner;

public class numberToString {

    public static  String oneProsse(int num ) {
        String strNum = "";
        switch (num) {
            case 0:
                strNum = "zero";
                break;
            case 1:
                strNum = "one";
                break;
            case 2:
                strNum = "two";
                break;
            case 3:
                strNum = "three";
                break;
            case 4:
                strNum = "four";
                break;
            case 5:
                strNum = "five";
                break;
            case 6:
                strNum = "six";
                break;
            case 7:
                strNum = "seven";
                break;
            case 8:
                strNum = "eight";
                break;
            case 9:
                strNum = "nine";
                break;
            case 10:
                strNum = "ten";
                break;
        }
        return strNum;
    }

    public static  String tenProsse(int num ) {
        String strNum = "";
        switch (num) {
            case 2:
                strNum = "twenty";
                break;
            case 3:
                strNum = "thirty";
                break;
            case 4:
                strNum = "forty";
                break;
            case 5:
                strNum = "fifty";
                break;
            case 6:
                strNum = "sixty";
                break;
            case 7:
                strNum = "seventy";
                break;
            case 8:
                strNum = "eighty";
                break;
            case 9:
                strNum = "ninety";
                break;

        }
        return strNum;
    }

    public static String ntoString(int num) {
        String strNum = "";
        if (num > 0 && num < 1000) {
            if (num <= 10) {
                strNum = oneProsse(num);
            } else if (num <= 20) {
                int ten = num / 10;
                int ones = num % 10;
                String strOne = "teen";
                switch (num) {

                    case 11:
                        strNum = "Eleven";
                        break;
                    case 12:
                        strNum = "Twelve";
                        break;
                    case 13:
                        strNum = "Thirteen";
                        break;
                    case 15:
                        strNum = "Fifteen";
                        break;
                    case 14:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        strNum = oneProsse(ones) + strOne;
                        break;
                    case 20:
                        strNum = "Twenty";
                        break;
                }

            } else if (num < 100) {
                int ten = num / 10;
                int ones = num % 10;
                String strTen = "";
                String strOne = "";
                if (ones == 0) {
                    strNum = tenProsse(ten);
                } else {
                    strNum = tenProsse(ten) + " " + oneProsse(ones);
                }
            } else if (num < 1000) {
                int hundr = num / 100;
                int ten = (num % 100) / 10;
                int ones = (ten % 100) % 10;
                String strTen = "";
                String strOne = "";
                if (ones == 0) {
                    if (ten == 0) {
                        strNum = oneProsse(hundr) + " hundred";
                    } else {
                        strNum = oneProsse(hundr) + " hundred " + tenProsse(ten);
                    }
                } else {
                    if (ten == 0) {
                        strNum = oneProsse(hundr) + " hundred and " + oneProsse(ones) ;
                    } else {
                        strNum = oneProsse(hundr) + " hundred " + tenProsse(ten) + " and " + oneProsse(ones) ;
                    }
                }
            }
        } else {
                System.out.println("Number have integer and max = 999!!");
        }
        return strNum;
    }
    public static void main (String[]args){
        String keyt = "";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number: ");
            int num = scanner.nextInt();
            System.out.println( ntoString(num));
            System.out.println("===============================\nYou want continue? \nEnter key Y to continue, any key to exit?");
            keyt = scanner.next();
            System.out.println("===============================");
        } while (keyt.equals("Y") || keyt.equals("y"));

    }

}
