import java.util.Scanner;
public class FullName {
    public static void main(String[] args) {

        Scanner ns = new Scanner (System.in);

        System.out.println("Enter Your name : ");
        String name = ns.nextLine();

        System.out.println("Enter your age : ");
        int age = ns.nextInt();

        System.out.println("your name is : " + name + " and your age is " + age);

        ns.close();

    }
}