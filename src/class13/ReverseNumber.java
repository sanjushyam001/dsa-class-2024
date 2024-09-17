package class13;

public class ReverseNumber {
    public static void main(String[] args) {

        int result=reverse(12345);
        System.out.println("REVERSE OF NUMBER: "+result);

    }
    private static int reverse(int n){
        int reverseValue=0;
        while(n!=0){
            int rem=n%10;
            /**
             * if reverseValue will be greater than Integer.MAX_VALUE in such case we will
             * get error Integer overflow ,to resolve this we can use this
             *
             * reverseValue*10+rem>Integer.MAX_VALUE
             * reverseValue*10>Integer.MAX_VALUE-rem
             * reverseValue>Integer.MAX_VALUE/10-rem/10
             * reverseValue>Integer.MAX_VALUE/10-0
             * reverseValue>Integer.MAX_VALUE/10
             */
            if(reverseValue<Integer.MIN_VALUE/10 || reverseValue>Integer.MAX_VALUE/10)
                return 0;
            reverseValue = reverseValue * 10 + rem;

            n/=10;
        }
        return reverseValue;
    }
}
