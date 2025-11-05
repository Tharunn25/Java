import java.util.Scanner;
public class number {
    public static void main(String[] args) {
        int[] nums = {1,2,31,4,5};
        int small=nums[0];
        int large=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>large);
            large = nums[i];
            if(nums[i]<small)
            small = nums[i];
        }
        System.out.println("Smallest number " + small);
        System.out.println("Largest number " + large);
    }

    
}