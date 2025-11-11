import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("Enter the String to check for palindrome : ");
        String input = ns.nextLine();

        String ans = "";

        for(int i = 0;i<input.length();i++){
            ans = input.charAt(i) + ans;
        }

       

        if(input.equals(ans))
            System.out.println("The given String is a palindrome ");
        else    
            System.out.println("The give String is not a palindrome");

            ns.close();

        
    }
}
