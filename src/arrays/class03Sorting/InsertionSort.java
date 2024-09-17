package arrays.class03Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int ar[]={0,1,2,5,3};
        int[] sortedAr = sort(ar);
        System.out.println(Arrays.toString(sortedAr));

    }
    private static int[] sort(int ar[]){
        int n=ar.length;
        int j=0;
        for(int i=1;i<n;i++){
            j=i;

            while((j>0&&ar[j-1]>ar[j])  ){

                int tempValue=ar[j];
                ar[j]=ar[j-1];
                ar[j-1]=tempValue;
                j--;
                System.out.println("j = "+j);
            }
        }
        return ar;
    }
}
