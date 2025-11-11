import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("Enter the String for which you want to reverse : ");
        String input = ns.nextLine();
        // String ans = " ";

        StringBuilder ans = new StringBuilder();
        ans.append(input);
        ans.reverse();
        System.out.println(ans);

        // for(int i=0;i<input.length();i++){
        //     ans = input.charAt(i) + ans;
        // }
        // System.out.println(ans);
        ns.close();



        
    }

    
}
