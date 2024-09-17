package class12;

public class DecimalToBinary {
    public static void main(String[] args) {

        int result=convert(13);
        System.out.println(result);

    }
    private static int convert(int n){

        int i=0;
        int ans=0;
        int mul=1;
        while(n!=0){
//            int rem=n%2;
            int rem=n&1;

//            ans=rem*(int)Math.pow(10, i)+ans;
            ans=rem*mul+ans;
            n/=2;
            i++;
            mul*=10;
        }
        return ans;
    }
}
