package class12;

public class BinaryToDecimal {
    public static void main(String[] args) {

        int result=convert(1101);
        System.out.println(result);

    }
    private static int convert(int n){

        int i=0;
        int ans=0;
        int mul=1;
        while(n!=0){
            int rem=n%10;

//            ans=rem*(int)Math.pow(2, i)+ans;
            ans=rem*mul+ans;

            n/=10;
            i++;
            mul*=10;
        }
        return ans;
    }
}
