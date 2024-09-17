package arrays.class03Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int ar[]={8,2,1,5,3};
        int[] sortedAr = sort1(ar);
        System.out.println(Arrays.toString(sortedAr));

    }
    private static int[] sort(int ar[]){
        int n=ar.length;
        int flag=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(ar[j]<ar[j+1]){
                    int tempValue=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=tempValue;
                    flag=1;
                }

            }
            System.out.println("Flag : "+flag);
            if(flag==0)
                break;
        }
        return ar;
    }
    private static int[] sort1(int ar[]){
        int n=ar.length;
        int flag=0;
        for(int i=0;i<n-1;i++){
            for(int j=n-1-i;j>0;j--){
                System.out.print(ar[j]+" ");
                if(ar[j-1]>ar[j]){
                    int tempValue=ar[j];
                    ar[j]=ar[j-1];
                    ar[j-1]=tempValue;
                    flag=1;
                }

            }
            System.out.println();
//            System.out.println("Flag : "+flag);
            if(flag==0)
                break;
        }
        return ar;
    }
}
