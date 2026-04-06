import java.util.Scanner;

public class UserInputScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sc.nextLine();

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        System.out.println("Enter your height in meters : ");
        double height = sc.nextDouble();

        System.out.println("hello your name is " + name + " and your age is "+age+ " and your height is "+height+ " meters");

    }
}