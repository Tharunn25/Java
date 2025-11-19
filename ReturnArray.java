public class ReturnArray {

    public static int[] getEvenNumber(int n){

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = (i+1)*2;
        }

        return arr;

    }

    public static void main(String[] args) {

        int n = 2;
        int[] result = getEvenNumber(n);
        for(int num : result){
            System.out.println(num + " ");
        }
        
    }

    
}