
import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        String choice;

        do{
              System.out.println("Enter the principal amount : ");
        double principalAmount = ns.nextDouble();

        System.out.println("Enter the Interest rate : ");
        double interestRate = ns.nextDouble();

        System.out.println("Enter the time duration of the load (In years) : ");
        double time = ns.nextDouble();

        double simpleInterest = (principalAmount * interestRate * time)/100.00;
        double totalAmount = principalAmount + simpleInterest;

        System.out.printf("Simple Interest is %.2f%n",simpleInterest);
        System.out.printf("Total Amount is %.2f%n", totalAmount);

        ns.nextLine();

        System.out.println("Do you want to perform the Interest calculation again : ");
        choice = ns.nextLine();
        }
        while(choice.equalsIgnoreCase("yes"));
        System.out.println("Thank you for using Interest Calculator");
        ns.close();  
    }
    
}
