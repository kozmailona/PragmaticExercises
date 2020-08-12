package makingdecisions;

import java.util.Scanner;

public class MultistateSalesTaxCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the order amount?: ");
        int orderAmount = scanner.nextInt();
        System.out.print("What state do you live in?");
        String stateUser = scanner.nextLine();
    }
}
//order amount and state