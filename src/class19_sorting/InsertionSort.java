package class19_sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int ar[]={7,4,2,3,5};
        int sortedArr[]=sort(ar);
        System.out.println(Arrays.toString(sortedArr));
    }
    private static int[] sort(int ar[]){
        int n=ar.length;
        for(int i=1;i<n;i++){

            int j=i;
            while(j>0 && ar[j-1]>ar[j]){
                int tempValue=ar[j];
                ar[j]=ar[j-1];
                ar[j-1]=tempValue;
                j--;
            }
        }
        return ar;
    }
}
