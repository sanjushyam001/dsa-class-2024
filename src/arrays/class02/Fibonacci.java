package arrays.class02;

public class Fibonacci {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21
        System.out.println("Result is : " + print(8));
        printFibonacci(10);
    }

    private static void printFibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a + " , " + b + " , ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            if (i == n - 1)
                System.out.print(c);
            else
                System.out.print(c + " , ");

            a = b;
            b = c;

        }
    }

    private static int print(int n) {
//        int size=n+1;
        int ar[] = new int[n];
        ar[0] = 0;
        ar[1] = 1;
        for (int i = 2; i < ar.length; i++) {
            ar[i] = ar[i - 2] + ar[i - 1];
        }

        return ar[n - 1];
    }
}
