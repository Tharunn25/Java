import java.util.Scanner;

public class personalInformation {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = ns.nextLine();

        System.out.println("Enter your Last Name : ");
        String lastName = ns.nextline();
        

        System.out.println("Please Enter your age : ");
        int age = ns.nextInt();
        ns.nextLine();

        System.out.println("Please Enter your height : ");
        String height = ns.nextLine();

        System.out.println("Please Enter your college Name : ");
        String collegeName = ns.nextLine();

        System.out.printf("Hi I'm %s,%d years old,and my height is %s,studying in %s%n",name,age,height,collegeName);

        ns.close();
        
    }
    
}
