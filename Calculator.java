
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int sum;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number for the Calculation: ");
        int num1 = in.nextInt();

        System.out.println("Enter the second number for the Calculation: ");
        int num2 = in.nextInt();

        System.out.println("Enter the operation you want to perform");
        String operation = in.next();

        if(operation.equals("add")){
            System.out.println(num1+num2);
        }
        else if(operation.equals("sub")){
            System.out.println(num1-num2);
        }
        else if(operation.equals("mul")){
            System.out.println(num1*num2);
        }
        else if(operation.equals("div")){
            System.out.println(num1/num2);
        }
        else{
            System.out.println("Please Enter valid operation name");
        }
    }    
}
