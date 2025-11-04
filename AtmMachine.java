
import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);

        int pin = 1234;

        double balance = 1000.00;

        System.out.println("Please Enter your pin : ");
        int enteredPin = ns.nextInt();

        if(enteredPin != pin){
            System.out.println("Invalid Pin access denied");
            return;
        }
        System.out.println("Access Granted");

        int choice;
        
        do{
            System.out.println("\n----- ATM Menu -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            choice = ns.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Your Current Balance is $%.2f%n",balance);
                    break;
                
                case 2:
                    System.out.println("Enter the money to deposit : ");
                    double deposit = ns.nextDouble();
                    balance += deposit;
                    System.out.printf("Your money has been deposited successfully, your new balance is $%.2f%n",balance);
                    break;
                case 3: 
                    System.out.println("Enter the amount to withdraw : ");
                    double withdraw = ns.nextDouble();
                    if(withdraw > balance){
                        System.out.println("Insufficient Balance");
                    }
                    else{
                        balance -= withdraw;
                        System.out.printf("Withdrawal successful, Your current balance is %.2f%n",balance);
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye !");
                    break;
                
                default:
                    System.out.println("Invalid option please try again.");
                    break;
            }
            }while(choice!=4);
            ns.close();
        }    
}
