import java.util.Scanner;

public class coutdigits {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("Enter the number to count the digits : ");
        int input = ns.nextInt();
        

        int counter = 0;
        do {
            input = input/10;
            counter++;
      
        } while (input != 0);
        System.out.println("The number of digits in the given input is : "+ counter);

        ns.close();
    }
    
}
