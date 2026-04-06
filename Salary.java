import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner byd = new Scanner(System.in);

        System.out.println("Please Enter your basic salary : ");
        double basicSalary = byd.nextDouble();

        System.out.println("Please Enter your HRA : ");
        double HRA = byd.nextDouble();

        System.out.println("Please Enter your Dearness Allowance : ");
        double allowances = byd.nextDouble();

        double totalSalary = basicSalary + HRA + allowances;

        System.out.printf("Your Total Salary is : %.2f",totalSalary);

        byd.close();

    }
}