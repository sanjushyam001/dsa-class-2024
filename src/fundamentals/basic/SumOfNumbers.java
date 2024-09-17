package fundamentals.basic;

public class SumOfNumbers {

    public static void main(String[] args) {

        int ar[]={1,2,3,4,5,6,7};
        int result=findSum(ar);
        System.out.println("SUM OF NUMBERS : "+result);

    }
    private static int findSum(int ar[]){

        int i=0;
        int sum=0;
        while(i<ar.length){
            sum+=ar[i];
            i++;
        }
        return sum;
    }
}
