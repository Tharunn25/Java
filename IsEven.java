public class IsEven {

    public static boolean isEven(int n){
        return n%2==0;
    }

    public static void check(int n ){
        if(isEven(n)){
            System.out.println("It's an even number");
        }
        else{
            System.out.println("It's a odd number");
        }
    }

    public static void main(String[] args){

        int n = 6;
        check(n);

    }
    
    
}
