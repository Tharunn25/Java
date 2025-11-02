import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        System.out.println("Please Enter the number : ");
        double num = ns.nextDouble();

        if(num%2 == 0)
            System.out.println("The Number is even number");
        else
            System.out.println("The Number is odd number");

        ns.close();
    }
}
