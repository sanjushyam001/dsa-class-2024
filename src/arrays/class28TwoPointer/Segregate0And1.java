package arrays.class28TwoPointer;

import java.util.Arrays;

public class Segregate0And1 {
    public static void main(String[] args) {

        int ar[]=new int[]{0,1,1,0,0,0,1};
        System.out.println(Arrays.toString(segregate1(ar)));
    }
    // Time Complexity o(n)
    private static int[] segregate(int ar[]){

        int n=ar.length;
        int count0=0,count1=0;
        for(int i=0;i<n;i++){
            if(ar[i]==0){
                count0++;
            }else{
                count1++;
            }
        }
        ar=new int[n];
        for(int i=0;i<count0;i++)
            ar[i]=0;
        for(int i=count0;i<n;i++)
            ar[i]=1;
        return ar;
    }
    private static int[] segregate1(int ar[]){

       int start=0,end=ar.length-1;

       /*while(start<end){

           if(ar[start]==0){
               start++;
           } else if(ar[end]==1){
               end--;
           }else{
               int tempValue=ar[start];
               ar[start]=ar[end];
               ar[end]=tempValue;
               start++;
               end--;

           }
       }*/

        while(start<=end){

            if(ar[start]==0){
                start++;
            }else{
                if(ar[end]==0){
                    int tempValue=ar[start];
                    ar[start]=ar[end];
                    ar[end]=tempValue;
                    start++;
                    end--;
                }else{
                    end--;
                }
            }
        }
        return ar;
    }
}
