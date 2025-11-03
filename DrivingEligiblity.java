
import java.util.Scanner;

public class DrivingEligiblity {
    
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        System.out.println("Please Enter Your age : ");
        int age = ns.nextInt();
        ns.nextLine();

        if(age<18){
            System.out.println("Your not eligible for driving");
        }
        else{
            System.out.println("Do you have driving License : ");
            String drivingLicense = ns.nextLine();
        
            if(drivingLicense.equalsIgnoreCase("yes"))
                System.out.println("your eligible for diriving");
            else
                System.out.println("your old enough but need a license");
        }
        ns.close();
        
    }

    
}