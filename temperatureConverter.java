import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);

        System.out.println("Please Enter the temperature in Celsius : ");

        double c = ns.nextDouble();


        double fahrenheit = (c*9/5) + 32;
        System.out.printf("The Temperature in fahrentheit is : %.2f*F",fahrenheit);

        ns.close();


        
    }
    
}
