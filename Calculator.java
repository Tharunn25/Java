import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner th = new Scanner(System.in);

        System.out.println("Please Enter the first Number : ");
        int n1 = th.nextInt();

        System.out.println("Please Enter the Second Number : ");
        int n2 = th.nextInt();

        int sum = n1 + n2;
        int difference = n1 - n2;
        int product = n1 * n2;
        double remainder = n1 / n2;

        System.out.println("The sum is : " + sum);
        System.out.println("The difference is : " + difference);
        System.out.println("The product is : " + product);
        System.out.println("The remainder is : " + remainder);

    }
}
