package makingdecisions;

import java.util.Scanner;

public class TroubleShootingCarIssues {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? Please, enter Y or N. ");
       String first = scanner.nextLine();

        if (first.equals("Y")) {
            System.out.print("Are the battery terminals corroded? ");
            String second = scanner.nextLine();

            if (second.equals("Y")) {
                System.out.print("Clean terminals and try starting again. ");
            } else if (second.equals("N")) {
                System.out.print("Replace cables and try again. ");
            }
        } else if (first.equals("N")) {
            System.out.print("Does the car make a clicking noise? ");
            String third = scanner.nextLine();
            if (third.equals("Y")) {
                System.out.print("Replace the battery.");
            } else if (third.equals("N")) {
                System.out.print("Does the car crank up but fail to start? ");
                String fourth = scanner.nextLine();

                if (fourth.equals("Y")) {
                    System.out.print("Check spark plug connections. ");
                } else if (fourth.equals("N")) {
                    System.out.print("Does the engine start and then die? ");
                    String fifth = scanner.nextLine();

                    if (fifth.equals("Y")) {
                        System.out.print("Does your car have fuel injection? ");
                        String sixth = scanner.nextLine();

                        if (sixth.equals("N")) {
                            System.out.print("Check to ensure the choke is opening and closing. ");
                        } else if (sixth.equals("Y")) {
                            System.out.print("Get it in for service. ");
                        }
                    }
                }
            }

            }

        }
    }
