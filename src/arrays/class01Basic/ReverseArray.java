package arrays.class01Basic;

public class ReverseArray {

    public static void main(String[] args) {
        int ar[]={1,2,3,4,5};
       int reverseArr[]=reverse(ar);
       for(int i:reverseArr){
           System.out.print(i+" ");
       }

    }
    private static int[] reverse(int ar[]){
        int start=0, end=ar.length-1;
        while(start<=end){
            int tempValue=ar[start];
            ar[start]=ar[end];
            ar[end]=tempValue;
            start++;end--;
        }
        return ar;
    }
}
