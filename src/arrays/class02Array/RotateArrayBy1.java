package arrays.class02Array;

import java.util.Arrays;

public class RotateArrayBy1 {
    public static void main(String[] args) {

        int ar[]={1,2,3,4,5,6,7,8};
        System.out.println("ORIGINAL ARRAY IS : "+ Arrays.toString(ar));
        System.out.println("ROTATED ARRAY IS : "+Arrays.toString(rotate(ar)));
    }
    private static int[] rotate(int ar[]){

        int tempValue=ar[ar.length-1];
        for(int i=ar.length-1-1;i>=0;i--){
            ar[i+1]=ar[i];
        }
        ar[0]=tempValue;
        return ar;
    }
}
