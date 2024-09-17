package class17;

public class MissingNo {
    public static void main(String[] args) {

        printMissingNumber(new int[]{1,2,3,5,6,7});
    }
    public static  void printMissingNumber(int ar[]){

        int sum=0;
        for(int i=0;i<ar.length;i++){
            sum+=ar[i];
        }

        int n=ar.length+1;
        int totalSum=n*(n+1)/2;
        System.out.println("Missing no is : "+(totalSum-sum));

    }
}
