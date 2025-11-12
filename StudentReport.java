import java.util.Scanner;
public class StudentReport {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);

        System.out.printf("Please Enter your name : ");
        String name = ns.nextLine();

        System.out.printf("How many subjects do you have : ");
        int sub = ns.nextInt();
        ns.nextLine();
        
        int sum = 0;
        int[] marks = new int[sub];
        String[] subjects = new String[sub]; 

        for(int i=0;i<sub;i++){
            System.out.printf("Enter the subject " + (i+1) +  " name : ");
            subjects[i] = ns.nextLine();
            System.out.printf("Enter the " + (subjects[i]) + " marks : ");
            marks[i] = ns.nextInt();
            ns.nextLine();
        }

        for(int i=0;i<sub;i++){
            sum +=  marks[i];
        }

        char grade;
        double avg = (double) sum / sub;
        
         if(avg>=90 && avg<=100){
            grade = 'A';
         }
         else if(avg >= 75 && avg <= 89){
            grade = 'B';
         }
         else if(avg >= 50 && avg <= 74){
            grade = 'C';
         }
         else if(avg >= 35 && avg <= 49){
            grade = 'D';
         }
         else{
            grade = 'F';
         }
         
        
        System.out.println("-----------STUDENT REPORT-----------" );
        System.out.println("Student Name : " + name);
        System.out.println("------------------------------------");
        System.out.println(" ");

        for(int i=0;i<sub;i++){
            System.out.println(subjects[i] + " : " + marks[i]);
        }

        System.out.println(" ");

        System.out.println("------------------------------------");

        System.out.println(" ");
        System.out.println("Total Marks : " + sum);
        System.out.println("Average Marks : " + avg);
        System.out.println("Grade : " + grade);
        System.out.println(" ");

        System.out.println("------------------------------------");

        ns.close();


    }
    
}
