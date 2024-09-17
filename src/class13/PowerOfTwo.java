package class13;

public class PowerOfTwo {
    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(65));
        System.out.println(isPowerOfTwo1(66));
        System.out.println(isPowerOfTwo2(66));

    }
    private static boolean isPowerOfTwo(int n){
        int i=2;
        while(i<n){
           if(n%i==0)
               return true;
           i*=2;
        }
        return false;
    }
    private static boolean isPowerOfTwo1(int n){

        while(n!=1){

            int rem=n%2;
            if(rem!=0)
                return false;
            n/=2;
        }
        return true;
    }
    private static boolean isPowerOfTwo2(int n){

        if((n&1)==0)
            return true;
        else
            return false;
    }
}
