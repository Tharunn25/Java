public class PassByValue {

    public static void changeNumber(int n){
        n += 50;
    }

    public static void main(String[] args) {
        int x = 10;
        changeNumber(x);
        System.out.println(x);
    }
    
}
