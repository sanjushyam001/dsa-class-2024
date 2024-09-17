package class17;

import java.util.Arrays;

public class RotateArrayBy1 {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5};
        printRotateArrayBy1(ar);
    }
    private static void printRotateArrayBy1(int ar[]){
        int n=ar.length;
        int tempValue=ar[n-1];
        for(int i=n-2;i>=0;i--){
            ar[i+1]=ar[i];
        }
        ar[0]=tempValue;

        System.out.println(Arrays.toString(ar));
    }
}
