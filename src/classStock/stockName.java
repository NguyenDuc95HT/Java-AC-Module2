package classStock;

import java.util.Scanner;

public class stockName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Symbol and name: ");
        String sym = scanner.next();
        String name = scanner.next();
        stock st = new stock(sym, name);
        System.out.println("Enter previous closing price: ");
        double pPrice = scanner.nextDouble();
        st.setPreviousClosingPrice(pPrice);
        System.out.println("Enter current price: ");
        double cPrice = scanner.nextDouble();
        st.setCurrentPrice(cPrice);
        System.out.println(st.getChenSend());

    }
}
