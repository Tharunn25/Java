
import java.util.Scanner;

public class calci {


    public static int sum(int a,int b) {return a+b;}
    public static int sub(int a,int b) {return b-a;}
    public static int mul(int a,int b) {return a*b;}
    public static double div(int a,int b) {return (double)a/b;}



    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);

        System.out.printf("Enter the first number for calculation : ");
        int a = ns.nextInt();

        System.out.printf("Enter the Second number for Calculation : ");

        int b = ns.nextInt();

        System.out.println("-------------- Calculator Menu -------------");
        System.out.println("1. Add");
        System.out.println("2. Subract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");

        System.out.println("---------------------------");

        System.out.printf("Enter your choice of Calculation : ");

        int userInput = ns.nextInt();

        if(userInput == 1){
            System.out.printf("Sum of a and b is  " + sum(a, b));
        }
        else if(userInput == 2){
            System.out.println("difference of a and b is  " + sub(a, b));
        }
        else if (userInput == 3) {
            System.out.println("product of a and b is " + mul(a, b)); 
        }
        else if (userInput == 4){
            System.out.println("Division of a and b is  " + div(a, b));
        }
        else if(userInput == 5){
            System.exit(0);
        }
        else{
            System.out.println("Please select the choice given in the menu");
        }
        ns.close(); 
    }

    
}