
import java.util.Scanner;

public class DayOne {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        System.out.println("Please Enter your First Name : ");
        String FirstName = ns.nextLine();

        System.out.println("Please Enter your Last Name : ");
        String LastName = ns.nextLine();

        System.out.println("please Enter your age : ");
        int age = ns.nextInt();

        System.out.println("Hello Your name is " + FirstName + " " + LastName +" " + "and your age is : " + age);

        ns.close();

    }
}
