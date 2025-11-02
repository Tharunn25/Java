import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Please Enter your marks to find your grade : ");
            int marks = ns.nextInt();
            ns.nextLine();
            if(marks > 100 || marks < 0)
                System.out.println("please Enter valid Marks : ");
            else if(marks > 90)
                System.out.println(marks + " marks is grade is A");
            else if (marks > 75 && marks < 89)
                System.out.println(marks + " marks is grade is B");
            else if (marks > 50 && marks < 74)
                System.out.println(marks + " marks is grade is C");
            else if (marks > 35 && marks < 49)
                System.out.println(marks + " marks is grade is D");
            else
                System.out.println(marks + " is Fail");
            ns.nextLine();
            System.out.println("Do you want to check your grade again with different marks: ");
            choice = ns.nextLine();    
        } 
        while (choice.equalsIgnoreCase("yes"));
        System.out.println("Thank you for using this application to find the grade");
        ns.close();

        
    }
    
}
