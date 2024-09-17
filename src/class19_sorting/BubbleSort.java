package class19_sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
    int ar[]={1,2,3,4};
        int[] sortedArr = sort(ar);
        System.out.println(Arrays.toString(sortedArr));

    }
    private static int[] sort(int ar[]){
        int n=ar.length;
        for(int i=0;i<n;i++){
            System.out.println("--Outer loop");
            int swap=0;
            for(int j=0;j<n-1-i;j++){
                System.out.println("-----Inner loop");
                if(ar[j]>ar[j+1]){
                    swap=1;
                    int tempValue=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=tempValue;
                }

            }
            if(swap==0)
                break;
        }
        return ar;
    }
}
