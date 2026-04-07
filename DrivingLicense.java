import java.util.Scanner;

public class DrivingLicense {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);

        System.out.println("Please Enter your age : ");
        int age = ns.nextInt();
        ns.nextLine();

        if(age < 18){
            System.out.println("Your not eligible for driving");
        }
        else{
            System.out.println("Do you have a Driving License (Yes/no)");
            String choice = ns.nextLine();

            if(choice.equalsIgnoreCase("yes"))
                System.out.println("Your eligile for driving");
            else
                System.out.println("Your old enough but don't have a driving license");
        }
        ns.close();
    }
}