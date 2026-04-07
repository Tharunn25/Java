import java.util.*;
public class ElectricityBill {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        int rate;

        System.out.println("Enter the number of electricity units consumed : ");
        double unit = ns.nextDouble();

        if(unit >= 0 && unit <=100){
            rate = 5;
        } else if (unit >= 100 || unit <= 200) {
            rate = 7;
        }
        else{
            rate = 10;
        }

        double billAmount = unit * rate;

        System.out.printf("Your unit consumed is %.2f  and rate for the same is %.2f%n",unit,rate);
        System.out.printf("Your total bill is %.2f%n",billAmount);
    }
}