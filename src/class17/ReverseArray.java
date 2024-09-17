package class17;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reverse(ar)));
    }
    private static int[] reverse(int ar[]){

        int start=0;
        int end=ar.length-1;
        while(start<=end){
            int temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
            start++;
            end--;
        }
        return ar;
    }
}
