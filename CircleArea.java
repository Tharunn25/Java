import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);

        System.out.println("Enter the radius of the circle to find the area : ");
        double radius= ns.nextDouble();

        double area = Math.PI*radius*radius;
        System.out.printf("The area of the circle is :  %.2f",area);

        ns.close();


    }
}