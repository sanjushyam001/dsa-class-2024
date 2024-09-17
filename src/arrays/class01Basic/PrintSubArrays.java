package arrays.class01Basic;

public class PrintSubArrays {
    public static void main(String[] args) {
        int ar[] = {2, 4, 6, 8, 10};

//        print(ar);
        System.out.println("---------");
        maxSubArr(ar);
    }

    private static void maxSubArr(int ar[]) {

        int prefixArr[] = new int[ar.length];
        prefixArr[0] = ar[0];
        for (int i = 1; i < ar.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + ar[i];
        }
        int maxSubArr = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i; j < ar.length; j++) {
                int currSum = i == 0 ? prefixArr[j] : (prefixArr[j] - prefixArr[i - 1]);

                if (currSum > maxSubArr) {
                    maxSubArr = currSum;
                }
            }
            System.out.println();
        }

        System.out.println("MAX SUB ARRAY IS : " + maxSubArr);
    }

    private static void print(int ar[]) {

        int maxSubArr = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i; j < ar.length; j++) {
                int sum = 0;
                System.out.print("[ ");
                for (int k = i; k <= j; k++) {
                    sum += ar[k];
                    System.out.print(ar[k] + " ");
                }
                System.out.print(" ] = ");
                System.out.print(sum + "\n");
                if (sum > maxSubArr) {
                    maxSubArr = sum;
                }
            }
            System.out.println();
        }

        System.out.println("MAX SUB ARRAY IS : " + maxSubArr);
    }
}
