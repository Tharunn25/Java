
import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);

        int pin = 1234;

        System.out.println("Please Enter Your ATM Pin : ");
        int userPin = ns.nextInt();

        if(userPin == pin){
            System.out.println("Access Granted ✅");
        }
        else{
            System.out.println("Please Enter a correct Pin");
        }

        
    }
    
}
