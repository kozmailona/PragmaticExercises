package makingdecisions;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        int orderAmount = scanner.nextInt();
        scanner.nextLine();
        System.out.print("What is the state? ");
        String state = scanner.nextLine();

        double total;

//        if (state.equals("WI")) {
//            total = orderAmount + 0.55;
//
//            System.out.println("The subtotal is " + orderAmount + ".\n" + "The tax is $0.55.\n" + "The total is $ " + total + "." );
//            System.out.println();
//        }

        if (state.equals("MN")) {
            total = orderAmount + 0;
            System.out.println("The total is $ " + total );
        }

    }
}
