package class12;

public class OctaToDecimal {
    public static void main(String[] args) {

        System.out.println(convert(15));
    }
    private static int convert(int n){

        int i=0;
        int ans=0;
        while(n!=0){
            int rem=n%10;
            ans=rem*(int)Math.pow(8, i)+ans;
            n/=10;
            i++;


        }
        return ans;
    }
}
