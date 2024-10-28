package class22_prefix_suffix_sum;

public class DivideArrayIn2SubArray {
    public static void main(String[] args) {

        int ar[] = {3, 4, -2, 5, 8, 20, -10, 8};
        boolean isDivideable = divide3(ar);
        System.out.println("isDivideable : " + isDivideable);

    }

    private static boolean divide1(int ar[]) {
        int n = ar.length;
        for (int i = 0; i < n - 1; i++) {

            int firstSubArray = 0;
            int secondSubArray = 0;

            for (int j = 0; j <= i; j++) {
                firstSubArray += ar[j];
            }
            for (int j = i + 1; j < n; j++) {
                secondSubArray += ar[j];
            }
            if (firstSubArray == secondSubArray)
                return true;
        }
        return false;
    }

    private static boolean divide2(int ar[]) {
        int n = ar.length;
        int prefix[] = new int[n];
        prefix[0] = ar[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + ar[i];
        }
        for (int i = 0; i < n - 1; i++) {

            int firstSubArray = prefix[i];
            int secondSubArray = prefix[n - 1] - prefix[i];
            if (firstSubArray == secondSubArray)
                return true;


        }
        return false;
    }

    private static boolean divide3(int ar[]) {
        int n = ar.length;

        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += ar[i];
        }
        int prefix = 0;
        for (int i = 0; i < n - 1; i++) {
            prefix += ar[i];
            int secondSubArray = totalSum - prefix;
            if (prefix == secondSubArray)
                return true;
        }

        return false;
    }
}
