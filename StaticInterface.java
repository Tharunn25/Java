
interface mathUtils{
    static int add(int a,int b){
        return a+b;
    }
}

public class StaticInterface {
    public static void main(String[] args) {

        int result = mathUtils.add(2,3);
        System.out.println(result);
        
    }
    
}
