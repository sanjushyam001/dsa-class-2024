package class19_sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int ar[]={9,7,3,1,6};
        System.out.println(Arrays.toString(sort(ar)));
    }
    private static int[] sort(int ar[]){
//9 7 3 1  6
        int n=ar.length;
        for(int i=0;i<n-1;i++){
            int index=i;
            for(int j=i+1;j<n;j++){
                if(ar[j]<ar[index]){
                    index=j;
                }
            }
            int tempValue=ar[i];
            ar[i]=ar[index];
            ar[index]=tempValue;
        }
        return ar;
    }
}
