package fundamentals.basic;



public class Fibonacci {
    public static void main(String[] args) {

        int n = 10;
        printFibonacci(n);
    }

    private static void printFibonacci(int n) {

        int i = 0;
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a + " " + b + " ");
        while (i < n) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;

            i++;
        }
    }
}
