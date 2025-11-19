
public class methodOverloading {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        int  a = 5;
        int b= 10;
        int c = 20;
        
        System.out.println(add(a, b)); // int, int
        System.out.println(add(3.5, 2.2)); // double, double
        System.out.println(add(a, b, c)); // int, int, int
        
        
    }
    
}
