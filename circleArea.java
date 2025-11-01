import java.util.Scanner;

public class circleArea {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("Please Enter the radius of the circle to find the area :");
        double radius = ns.nextDouble();

        double area = radius * radius * Math.PI;

        String formattedValue = String.format("%.2f",area);
        System.out.println(formattedValue);

        ns.close();


    }  
}
