package class15;

public class ArmstrongNUmber {
    public static void main(String[] args) {
        boolean result=isArmstrongNumber(153);
        System.out.println("RESULT : "+result);
    }
    private static boolean isArmstrongNumber(int n){
        int temp=n;
        int sum=0;
        int i=0;
        int count=noOfDigits(n);
        while(n!=0){
            int rem=n%10;
            sum+=(int)Math.pow(rem, count);
            n/=10;
        }
        return temp==sum;
    }
    private static int noOfDigits(int n){

        int count=0;
        while(n!=0){

            count++;
            n/=10;
        }
        return count;
    }
}
