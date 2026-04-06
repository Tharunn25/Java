import java.util.Scanner;

public  class temp {
    public static void main(String[] args) {

        Scanner byd = new Scanner(System.in);

        System.out.println("please Enter the temperature in celsius : ");
        double celsius = byd.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.printf("The temperature in fahrenheit is : %.2f",fahrenheit);

        byd.close();
    }
}