package class13;

public class Palindrome {

    public static void main(String[] args) {

        int n=424;
        boolean result=isPalindrome(n);

        System.out.println("Is given number palindrome? "+result);
    }
    private static boolean isPalindrome(int n){

        return n==getReverse(n);

    }
    private static int getReverse(int n){

        int reverseValue=0;

        while(n!=0){

            if(reverseValue<Integer.MIN_VALUE/10 || reverseValue>Integer.MAX_VALUE/10)
                return 0;
            reverseValue=reverseValue*10+n%10;
            n/=10;

        }
        return reverseValue;
    }
}
