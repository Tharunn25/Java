
import java.util.Scanner;

public class StringParam {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter your Name : ");
        String name = in.next();

        String output = greet(name);
        System.out.println(output);


        
    }

    static String greet(String name){
        String message = "hello" + name;
        return message;
    }

    
}