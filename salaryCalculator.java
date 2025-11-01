
import java.util.Scanner;

public class salaryCalculator {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);

        System.out.println("Please Enter your Basic Salary :  ");
        int basicSalary = ns.nextInt();

        System.out.println("Please Enter your HRA : ");
        int hra = ns.nextInt();
        
        System.out.println("Please Enter your Dearness Allowance : ");
        int allowance = ns.nextInt();

        int totalSalary = basicSalary + hra + allowance;

        System.out.println("your monthly salary is : " + totalSalary);

        ns.close();
    }

    
    
}
