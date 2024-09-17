package arrays.class03Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int ar[]={4,2,0,5,1};
        int[] sortedAr = sort(ar);
        System.out.println(Arrays.toString(sortedAr));

    }
    private static int[] sort(int ar[]){
        int n=ar.length;
        int minIndex=0;
        for(int i=0;i<n-1;i++){
            minIndex=i;
            for(int j=i+1;j<n;j++){
                if(ar[j]<ar[minIndex]){
                    minIndex=j;

                }
            }
            int tempValue=ar[i];
            ar[i]=ar[minIndex];
            ar[minIndex]=tempValue;
        }
        return ar;
    }

}
