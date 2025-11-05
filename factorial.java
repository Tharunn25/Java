import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int result = 1;
        Scanner ns = new Scanner(System.in);

        System.out.println("Enter the number to find its factorial: ");
        int input = ns.nextInt();
        
        if(input < 0){
            System.out.println("Factorial is not defined for negative numbers");
        }else{
            result = 1;
            for (int i = 1; i <= input; i++) {
            result *= i;
    }
    System.out.println("The factorial of " + input + " is " + result);
}

ns.close();

    }
    
}
