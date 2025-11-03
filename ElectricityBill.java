// 0–100 units → ₹5 per unit
// 101–200 units → ₹7 per unit
// Above 200 units → ₹10 per unit


import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        System.out.println("Please Enter the units of electricity Consumed: ");
        double units = ns.nextDouble();

        if(units >= 0 && units <= 100){
            System.out.println("Per unit cost is 5 rs");
        }
        else if(units >= 101 && units <= 200){
            System.out.println("Per unit cost is 7 rs");
        }
        else{
            System.out.println("Per unit cost is 10 rs");
        }
    }    
}