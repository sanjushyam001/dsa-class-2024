package class17;

import java.util.Arrays;

public class FibonacciSeries {
    public static void main(String[] args) {

        int ar[]=new int[10];
        int target=7;
        printFibonacciSeries(ar,target);
    }

    private static void printFibonacciSeries(int ar[],int target) {

        ar[0] = 0;
        ar[1] = 1;
        for (int i = 2; i < ar.length; i++) {
            ar[i] = ar[i - 1] + ar[i - 2];

        }
        System.out.println(Arrays.toString(ar));
        System.out.println(ar[target-1]);
    }
}
