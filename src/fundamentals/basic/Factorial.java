package fundamentals.basic;

public class Factorial {
    public static void main(String[] args) {

        int n=5;
        System.out.println("Factorial : "+findFactorial(5));

    }
    private static int findFactorial(int n){

        int i=1;
        int fact=1;
        while(i<=n){

            fact*=i;
            i++;
        }
        return fact;
    }
}
