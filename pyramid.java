import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        
        Scanner ns = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = ns.nextInt();
        for(int i=1;i<=n;i++){
            
            for(int j=i;j<n;j++){
                System.out.println(" ");   
            }
            for(int j=1;j<=1;j++){
                System.out.println(j);
            }
            for(int j=i-1;j>=1;j--){
                System.out.println(j);
            }
            System.out.println();
        }
        ns.close();
    }
}
