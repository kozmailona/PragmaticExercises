package calculations;

import java.util.Scanner;

public class SelfCheckout {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        double firstItem = scanner.nextDouble();
        System.out.print("The quantity of item 1: ");
        int quantityItemOne = scanner.nextInt();
        System.out.print("Enter the price of item 2: ");
        double secondItem = scanner.nextDouble();
        System.out.print("The quantity of item 2: ");
        int quantityItemTwo = scanner.nextInt();
        System.out.print("Enter the price of item 3: ");
        double thirdItem = scanner.nextDouble();
        System.out.print("The quantity of item 3: ");
        int quantityThirdItem = scanner.nextInt();

        double taxRate = 5.5;
        double subtotal =
                (firstItem * quantityItemOne) + (secondItem * quantityItemTwo) + (thirdItem * quantityThirdItem);
        double tax = (subtotal * taxRate) / 100;
        double total = subtotal + tax;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
}
