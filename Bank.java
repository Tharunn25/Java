import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        double balance = 1000;
        int pin = 1234;

        System.out.println("Enter your pin : ");
        int userPin = ns.nextInt();

        if (pin != userPin) {
            System.out.println("Access Denied");
            return; // Stops the program if PIN is wrong
        } else {
            System.out.println("Access Granted");
        }

        int choice;
        do {
            System.out.println("\n-------------- ATM - Menu -------------- ");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("--------------------------");
            System.out.print("Enter your choice: ");

            choice = ns.nextInt(); // Fixed assignment

            switch (choice) {
                case 1:
                    System.out.println("Your Bank Balance is " + balance);
                    break; // Added break
                case 2:
                    System.out.println("Enter the amount to deposit: ");
                    double deposit = ns.nextDouble();
                    balance += deposit;
                    System.out.printf("Deposit Successful. New balance: %.2f%n", balance); // Fixed printf
                    break;
                case 3:
                    System.out.println("How much money do you want to withdraw: ");
                    double withdraw = ns.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("Insufficient Balance!");
                    } else {
                        balance -= withdraw;
                        System.out.printf("Withdrawal successful. Remaining balance: %.2f%n", balance); // Fixed typo
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM, GoodBye");
                    break;
                default:
                    System.out.println("Invalid option please try again.");
            }
        } while (choice != 4);

        ns.close();
    }
}