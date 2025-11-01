
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner nw = new Scanner(System.in);

        System.out.println("Please Enter Your name : ");
        String name=nw.nextLine();

        System.out.println("Please Enter your age : ");
        int age = nw.nextInt();
        nw.nextLine();

        System.out.println("Please Enter your hobby : ");
        String hobby = nw.nextLine();

        System.out.println("Hello your name is " + name + " and your " + age + "years old" + " and your favourite hobby is " + hobby);



    }
    
}
