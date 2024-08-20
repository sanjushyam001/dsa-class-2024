package arrays.class02Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int ar[]={1,4,5,7,0,8,2};
        System.out.println("ORIGINAL ARRAY IS : "+ Arrays.toString(ar));

        System.out.println("REVERSED ARRAY IS : "+ Arrays.toString(reverse(ar)));


    }
    private static int[] reverse(int ar[]){
        int first=0;
        int last=ar.length-1;

        while(first<last){
            swap(ar, first, last);
            first++;
            last--;
        }
        return ar;
    }
    private static void swap(int ar[],int i,int j){

        int tempValue=ar[i];
        ar[i]=ar[j];
        ar[j]=tempValue;
    }
}
