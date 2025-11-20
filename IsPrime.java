public class IsPrime {

    public static boolean isprime(int n){

        if(n<2) return false;

        for(int i=2;i <= Math.sqrt(n);i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    public static void primeResult(int n){
        if(isprime(n))
            System.out.println("The given number is prime number");
        else
            System.out.println("The given number is not a prime number");
    }

    public static void main(String[] args) {

        int n = 8;
        primeResult(n);
        
    }
    
}
