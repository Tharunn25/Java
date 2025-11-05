
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        System.out.printf("Enter the size of the array : ");
        int input = ns.nextInt();

        int[] nums = new int[input];
        for(int i=0;i<input;i++){

            System.out.printf("Enter the " + (i+1) + " Number: ");
            nums[i] = ns.nextInt();
        }

        System.out.println("Array elements are");
        for(int i=0;i<input;i++){
            System.out.printf(nums[i] + " ");
        }
        ns.close();
        
    }
    
}
